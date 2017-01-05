package cn.ecust.ssei.service.impl.pipe.pipedetailmaintain;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.pipe.PipeBasic;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeHardTest;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipeHardTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class PipeHardTestServiceImpl extends DaoSupportImpl<PipeHardTest> implements PipeHardTestService{

	@Override
	@SuppressWarnings("unchecked")
	public void generateFile(PipeHardTest pipeHardTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(1,"pipeHardTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(pipeHardTest.getId(), "pipeHardTest", Constant.PIPE_DOCUMENT_UPLOAD, "pipeHardTest.doc");
	
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(pipeHardTest);
		String m_Start_Date = pipeHardTest.getPipeDetailMaintain().getPipeMaintain().getM_Start_Date();
		String m_End_Date =pipeHardTest.getPipeDetailMaintain().getPipeMaintain().getM_End_Date();
		PipeBasic pipeBasic = pipeHardTest.getPipeDetailMaintain().getPipeMaintain().getPipeBasic();
		HashMap<String, String> map1= BeanUtils.beanToMap(pipeBasic);
		map.putAll(map1);
		map.put("#m_Start_Date#", m_Start_Date);
		map.put("#m_End_Date#", m_End_Date);
		/**
		 * 处理p_Thi_Value
		 */
		String value=pipeHardTest.getP_HB_Value()+" "; 
		String[] array = value.split(",|;");
		String tempFilePath = MyFileUtils.getPipeTempPath()+"pipeTemp.doc";
		helper.addRowAndValueInHard(templetePath, tempFilePath, array.length);
		for (int i = 0; i < array.length; i++) {
			int num = i+1;
		    String name ="#"+num+"#";
		    map.put(name, array[i]);
		}
		for (int i = array.length; i < 48; i++) {
			int num = i+1;
			String name ="#"+num+"#";
	        map.put(name, "");
		}
		helper = new JacobHelper();
		helper.toWord(tempFilePath, filePath, map);	
	}



}
