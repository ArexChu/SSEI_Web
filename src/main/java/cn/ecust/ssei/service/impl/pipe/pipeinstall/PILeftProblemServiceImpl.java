package cn.ecust.ssei.service.impl.pipe.pipeinstall;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.pipe.pipeinstall.PILeftProblem;
import cn.ecust.ssei.service.pipe.pipeinstall.PILeftProblemService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;

@Service
@Transactional
public class PILeftProblemServiceImpl extends DaoSupportImpl<PILeftProblem> implements PILeftProblemService {

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(PILeftProblem piLeftProblem) {
		String templetePath = MyFileUtils.getTempletePathWithName(1,"piLeftProblem.doc");	
		String filePath = MyFileUtils.getFilePathWithName(piLeftProblem.getId(), "piLeftProblem", Constant.PIPE_DOCUMENT_UPLOAD, "piLeftProblem.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(piLeftProblem);
		HashMap<String, String> map1= BeanUtils.beanToMap(piLeftProblem.getPipeInstall());
		map.putAll(map1);
		map.put("#pi_Cons_Com#", piLeftProblem.getPipeInstall().getPi_Cons_Com().getName());
		map.put("#pi_Ins_Com#", piLeftProblem.getPipeInstall().getPi_Ins_Com().getName());
		if (piLeftProblem.getPipeInstall().getPiConclusion()!=null) {
			map.put("#pi_Addr#", piLeftProblem.getPipeInstall().getPiConclusion().getPi_Addr());
		}else {
			map.put("#pi_Addr#", "");
		}
		helper.toWord(templetePath, filePath, map);
		
	}

}
