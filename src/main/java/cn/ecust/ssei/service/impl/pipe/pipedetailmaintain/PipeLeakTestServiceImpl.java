package cn.ecust.ssei.service.impl.pipe.pipedetailmaintain;

import java.io.File;
import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.pipe.PipeBasic;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeLeakTest;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipeLeakTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class PipeLeakTestServiceImpl  extends DaoSupportImpl<PipeLeakTest> implements PipeLeakTestService{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(PipeLeakTest pipeLeakTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(1,"pipeLeakTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(pipeLeakTest.getId(), "pipeLeakTest", Constant.PIPE_DOCUMENT_UPLOAD, "pipeLeakTest.doc");
	
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(pipeLeakTest);
		String m_Start_Date = pipeLeakTest.getPipeDetailMaintain().getPipeMaintain().getM_Start_Date();
		String m_End_Date =pipeLeakTest.getPipeDetailMaintain().getPipeMaintain().getM_End_Date();
		PipeBasic pipeBasic = pipeLeakTest.getPipeDetailMaintain().getPipeMaintain().getPipeBasic();
		HashMap<String, String> map1= BeanUtils.beanToMap(pipeBasic);
		map.putAll(map1);
		map.put("#m_Start_Date#", m_Start_Date);
		map.put("#m_End_Date#", m_End_Date);
		/**
		 * 处理图片
		 */
		String path = MyFileUtils.getFilePathWithName(pipeLeakTest.getPipeDetailMaintain().getId(), "pipeLeakTestPic.jpg", Constant.PIPE_ATTATCHMENT_UPLOAD, "pipeLeakTestPic.jpg");
		File file = new File(path);
		if (!file.exists()) {
			path="";
		}
		map.put("#pipeLeakTestPic.jpg#", path);
		helper.toWord(templetePath, filePath, map);
		
	}



}
