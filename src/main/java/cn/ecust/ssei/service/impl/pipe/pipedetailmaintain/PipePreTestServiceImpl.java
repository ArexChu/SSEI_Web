package cn.ecust.ssei.service.impl.pipe.pipedetailmaintain;

import java.io.File;
import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.pipe.PipeBasic;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipePreTest;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipePreTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class PipePreTestServiceImpl  extends DaoSupportImpl<PipePreTest> implements PipePreTestService {

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(PipePreTest pipePreTest) {

		String templetePath = MyFileUtils.getTempletePathWithName(1,"pipePreTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(pipePreTest.getId(), "pipePreTest", Constant.PIPE_DOCUMENT_UPLOAD, "pipePreTest.doc");
		
		/**
		 * jacob操作word
		 */
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(pipePreTest);
		String m_Start_Date = pipePreTest.getPipeDetailMaintain().getPipeMaintain().getM_Start_Date();
		String m_End_Date =pipePreTest.getPipeDetailMaintain().getPipeMaintain().getM_End_Date();
		PipeBasic pipeBasic = pipePreTest.getPipeDetailMaintain().getPipeMaintain().getPipeBasic();
		HashMap<String, String> map1= BeanUtils.beanToMap(pipeBasic);
		map.putAll(map1);
		map.put("#m_Start_Date#", m_Start_Date);
		map.put("#m_End_Date#", m_End_Date);
		/**
		 * 处理图片
		 */
		String path = MyFileUtils.getFilePathWithName(pipePreTest.getPipeDetailMaintain().getId(), "pipePreTestPic.jpg", Constant.PIPE_ATTATCHMENT_UPLOAD, "pipePreTestPic.jpg");
		File file = new File(path);
		if (!file.exists()) {
			path="";
		}
		map.put("#pipePreTestPic.jpg#", path);
		helper.toWord(templetePath, filePath, map);
		
	}



}
