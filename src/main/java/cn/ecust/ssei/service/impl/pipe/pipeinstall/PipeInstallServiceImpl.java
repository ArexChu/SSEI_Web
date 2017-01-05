package cn.ecust.ssei.service.impl.pipe.pipeinstall;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.pipe.pipeinstall.PipeInstall;
import cn.ecust.ssei.service.pipe.pipeinstall.PipeInstallService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;


@Service
@Transactional
public class PipeInstallServiceImpl extends DaoSupportImpl<PipeInstall>  implements PipeInstallService{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(PipeInstall pipeInstall) {
		String templetePath = MyFileUtils.getTempletePathWithName(1,"pipeInstallBasic.doc");	
		String filePath = MyFileUtils.getFilePathWithName(pipeInstall.getId(), "pipeInstallBasic", Constant.PIPE_DOCUMENT_UPLOAD, "pipeInstallBasic.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(pipeInstall);
		map.put("#pi_Cons_Com#", pipeInstall.getPi_Cons_Com().getName());
		map.put("#pi_Ins_Com#", pipeInstall.getPi_Ins_Com().getName());
		helper.toWord(templetePath, filePath, map);
	}

	@Override
	public PipeInstall findByPIId(String pi_id) {
		// TODO Auto-generated method stub
		return (PipeInstall) getSession().createQuery(//
				"FROM PipeInstall p WHERE p.pi_ID=?")//
				.setParameter(0, pi_id)//
				.uniqueResult();
	}

	
	@Override
	public void update(PipeInstall entity) {
		getSession().createQuery("UPDATE PipeInstall p SET p.pi_ID=?, p.pi_Name=?, p.pi_Cons_Com=?, p.pi_Ins_Com=?, p.pi_Check_Date=? WHERE p.id=?")//
		.setParameter(0, entity.getPi_ID())
		.setParameter(1, entity.getPi_Name())
		.setParameter(2, entity.getPi_Cons_Com())
		.setParameter(3, entity.getPi_Ins_Com())
		.setParameter(4, entity.getPi_Check_Date())
		.setParameter(5, entity.getId())
		.executeUpdate();
	}
	
}
