package cn.ecust.ssei.service.impl.pipe.pipeinstall;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.pipe.pipeinstall.PIConclusion;
import cn.ecust.ssei.service.pipe.pipeinstall.PIConclusionService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;

@Service
@Transactional
public class PIConclusionServiceImpl extends DaoSupportImpl<PIConclusion> implements PIConclusionService{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(PIConclusion piConclusion) {
		String templetePath = MyFileUtils.getTempletePathWithName(1,"piConclusion.doc");	
		String filePath = MyFileUtils.getFilePathWithName(piConclusion.getId(), "piConclusion", Constant.PIPE_DOCUMENT_UPLOAD, "piConclusion.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(piConclusion);
		HashMap<String, String> map1= BeanUtils.beanToMap(piConclusion.getPipeInstall());
		HashMap<String, String> map2= BeanUtils.beanToMap(piConclusion.getPipeInstall().getPiBasic());
		map.putAll(map1);
		map.putAll(map2);
		String pi_Insp_Result =piConclusion.getPi_Insp_Result();
		pi_Insp_Result = genCheckBoxString("合格,不合格", pi_Insp_Result);
		map.put("#pi_Insp_Result#",pi_Insp_Result);
		map.put("#pi_Cons_Com#", piConclusion.getPipeInstall().getPi_Cons_Com().getName());
		map.put("#pi_Ins_Com#", piConclusion.getPipeInstall().getPi_Ins_Com().getName());
		helper.toWord(templetePath, filePath, map);
		
	}

	 

}
