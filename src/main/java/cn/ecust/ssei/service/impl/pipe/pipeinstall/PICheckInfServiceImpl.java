package cn.ecust.ssei.service.impl.pipe.pipeinstall;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.pipe.pipeinstall.PICheckInf;
import cn.ecust.ssei.service.pipe.pipeinstall.PICheckInfService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;

@Service
@Transactional
public class PICheckInfServiceImpl extends DaoSupportImpl<PICheckInf> implements PICheckInfService  {

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(PICheckInf piCheckInf) {
		String templetePath = MyFileUtils.getTempletePathWithName(1,"piCheckInf.doc");	
		String filePath = MyFileUtils.getFilePathWithName(piCheckInf.getId(), "piCheckInf", Constant.PIPE_DOCUMENT_UPLOAD, "piCheckInf.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(piCheckInf);
		HashMap<String, String> map1= BeanUtils.beanToMap(piCheckInf.getPipeInstall());
		map.putAll(map1);
		helper.toWord(templetePath, filePath, map);
		
	}

}
