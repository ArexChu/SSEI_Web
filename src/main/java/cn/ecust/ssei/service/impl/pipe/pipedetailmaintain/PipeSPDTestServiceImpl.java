package cn.ecust.ssei.service.impl.pipe.pipedetailmaintain;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeSPDTest;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipeSPDTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class PipeSPDTestServiceImpl  extends DaoSupportImpl<PipeSPDTest> implements PipeSPDTestService {

	@Override
	public void generateFile(PipeSPDTest pipeSPDTest) {	
		String templetePath = MyFileUtils.getTempletePathWithName(1,"pipeSPDTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(pipeSPDTest.getId(), "pipeSPDTest", Constant.PIPE_DOCUMENT_UPLOAD, "pipeSPDTest.doc");
		
		JacobHelper helper = new JacobHelper();
		@SuppressWarnings("unchecked")
		HashMap<String, String> map= BeanUtils.beanToMap(pipeSPDTest);
		String m_Start_Date = pipeSPDTest.getPipeDetailMaintain().getPipeMaintain().getM_Start_Date();
		String m_End_Date =pipeSPDTest.getPipeDetailMaintain().getPipeMaintain().getM_End_Date();
		map.put("#m_Start_Date#", m_Start_Date);
		map.put("#m_End_Date#", m_End_Date);
		helper.toWord(templetePath, filePath, map);	

	}



}
