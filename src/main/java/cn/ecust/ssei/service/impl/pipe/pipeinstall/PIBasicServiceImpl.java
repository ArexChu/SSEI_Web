package cn.ecust.ssei.service.impl.pipe.pipeinstall;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.pipe.pipeinstall.PIBasic;
import cn.ecust.ssei.service.pipe.pipeinstall.PIBasicService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;

@Service
@Transactional
public class PIBasicServiceImpl  extends DaoSupportImpl<PIBasic> implements PIBasicService {

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(PIBasic piBasic) {
		String templetePath = MyFileUtils.getTempletePathWithName(1,"piBasic.doc");	
		String filePath = MyFileUtils.getFilePathWithName(piBasic.getId(), "piBasic", Constant.PIPE_DOCUMENT_UPLOAD, "piBasic.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(piBasic);
		HashMap<String, String> map1= BeanUtils.beanToMap(piBasic.getPipeInstall());
		map.putAll(map1);
		helper.toWord(templetePath, filePath, map);
		
	}

}
