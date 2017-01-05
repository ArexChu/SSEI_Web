package cn.ecust.ssei.service.impl.pipe.pipeinstall;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.pipe.pipeinstall.PIComInf;
import cn.ecust.ssei.service.pipe.pipeinstall.PIComInfService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;

@Service
@Transactional
public class PIComInfServiceImpl extends DaoSupportImpl<PIComInf>  implements PIComInfService{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(PIComInf piComInf) {
		String templetePath = MyFileUtils.getTempletePathWithName(1,"piComInf.doc");	
		String filePath = MyFileUtils.getFilePathWithName(piComInf.getId(), "piComInf", Constant.PIPE_DOCUMENT_UPLOAD, "piComInf.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(piComInf);
		HashMap<String, String> map1= BeanUtils.beanToMap(piComInf.getPipeInstall());
		map.putAll(map1);
		helper.toWord(templetePath, filePath, map);
		
	}

}
