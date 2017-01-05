package cn.ecust.ssei.service.impl.pipe.pipedetailmaintain;

import java.io.File;
import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.pipe.PipeBasic;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeMetTest;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipeMetTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class PipeMetTestServiceImpl extends DaoSupportImpl<PipeMetTest> implements PipeMetTestService  {

	@Override
	@SuppressWarnings("unchecked")
	public void generateFile(PipeMetTest pipeMetTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(1,"pipeMetTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(pipeMetTest.getId(), "pipeMetTest", Constant.PIPE_DOCUMENT_UPLOAD, "pipeMetTest.doc");
	
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(pipeMetTest);
		String m_Start_Date = pipeMetTest.getPipeDetailMaintain().getPipeMaintain().getM_Start_Date();
		String m_End_Date =pipeMetTest.getPipeDetailMaintain().getPipeMaintain().getM_End_Date();
		PipeBasic pipeBasic = pipeMetTest.getPipeDetailMaintain().getPipeMaintain().getPipeBasic();
		HashMap<String, String> map1= BeanUtils.beanToMap(pipeBasic);
		map.putAll(map1);
		map.put("#m_Start_Date#", m_Start_Date);
		map.put("#m_End_Date#", m_End_Date);
		/**
		 * 处理图片
		 */

		String path = MyFileUtils.getFilePathWithName(pipeMetTest.getPipeDetailMaintain().getId(), "pipeMetTestPic.jpg", Constant.PIPE_ATTATCHMENT_UPLOAD, "pipeMetTestPic.jpg");
		File file = new File(path);
		if (!file.exists()) {
			path="";
		}
		map.put("#pipeMetTestPic.jpg#", path);
		helper.toWord(templetePath, filePath, map);	

	}
}
