package cn.ecust.ssei.service.impl.pipe.pipeinstall;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.pipe.pipeinstall.PipeCompleteInf;
import cn.ecust.ssei.service.pipe.pipeinstall.PipeCompleteInfService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;

@Service
@Transactional
public class PipeCompleteInfServiceImpl extends DaoSupportImpl<PipeCompleteInf> implements PipeCompleteInfService {

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(PipeCompleteInf pipeCompleteInf) {
		String templetePath = MyFileUtils.getTempletePathWithName(1,"pipeCompleteInf.doc");	
		String filePath = MyFileUtils.getFilePathWithName(pipeCompleteInf.getId(), "pipeCompleteInf", Constant.PIPE_DOCUMENT_UPLOAD, "pipeCompleteInf.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(pipeCompleteInf);
		HashMap<String, String> map1= BeanUtils.beanToMap(pipeCompleteInf.getPipeInstall());
		map.putAll(map1);
		helper.toWord(templetePath, filePath, map);
		
	}

}
