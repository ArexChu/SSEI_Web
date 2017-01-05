package cn.ecust.ssei.service.impl.pipe.pipedetailmaintain;

import java.io.File;
import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeThiTest;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipeThiTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class PipeThiTestServiceImpl extends DaoSupportImpl<PipeThiTest> implements PipeThiTestService {

	@Override
	@SuppressWarnings("unchecked")
	public void generateFile(PipeThiTest pipeThiTest) {	
		String templetePath = MyFileUtils.getTempletePathWithName(1,"pipeThiTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(pipeThiTest.getId(), "pipeThiTest", Constant.PIPE_DOCUMENT_UPLOAD, "pipeThiTest.doc");
		
		JacobHelper helper = new JacobHelper();

		HashMap<String, String> map= BeanUtils.beanToMap(pipeThiTest);
		String m_Start_Date = pipeThiTest.getPipeDetailMaintain().getPipeMaintain().getM_Start_Date();
		String m_End_Date =pipeThiTest.getPipeDetailMaintain().getPipeMaintain().getM_End_Date();
		String p_ID =pipeThiTest.getPipeDetailMaintain().getPipeMaintain().getPipeBasic().getP_ID();
		map.put("#m_Start_Date#", m_Start_Date);
		map.put("#m_End_Date#", m_End_Date);
		map.put("#p_ID#", p_ID);
		String p_Sur_Sta = pipeThiTest.getP_Sur_Sta();
		p_Sur_Sta = genCheckBoxString("去漆,去绣,打磨,未处理", p_Sur_Sta);
		map.put("#p_Sur_Sta#", p_Sur_Sta);
		/**
		 * 处理图片
		 */
		String path = MyFileUtils.getFilePathWithName(pipeThiTest.getPipeDetailMaintain().getId(), "pipeThiTestPic.jpg", Constant.PIPE_ATTATCHMENT_UPLOAD, "pipeThiTestPic.jpg");
		File file = new File(path);
		if (!file.exists()) {
			path="";
		}
		map.put("#pipeThiTestPic.jpg#", path);
		/**
		 * 处理p_Thi_Value
		 */
		String value=pipeThiTest.getP_Thi_Value()+" "; 
		String[] array = value.split(",|;");
		String tempFilePath = MyFileUtils.getPipeTempPath()+"pipeTemp.doc";
		
		helper.addRowAndValueInThi(templetePath, tempFilePath, array.length);
		for (int i = 0; i < array.length; i++) {
			  if (i % 2 == 0) {
				  	int num = i/2+1;
		            String name ="#"+num+"#";
		            map.put(name, array[i]);
		        } else {
		        	int num = i/2+1;
		        	String name ="#p_Thi_"+num+"#";
		            map.put(name, array[i]);
		        }
		}
		for (int j = array.length; j < 160; j++) {
			  if (j % 2 == 0) {
				  	int num = j/2+1;
		            String name ="#"+num+"#";
		            map.put(name, "");
		        } else {
		        	int num = j/2+1;
		        	String name ="#p_Thi_"+num+"#";
		            map.put(name, "");
		        }
		}
		helper = new JacobHelper();
		helper.toWord(tempFilePath, filePath, map);	
	}
}
