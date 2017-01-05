package cn.ecust.ssei.service.impl.pipe.pipeonlinemaintain;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.pipe.PipeBasic;
import cn.ecust.ssei.domain.pipe.pipeonlinemaintain.PipeOnlineThiTest;
import cn.ecust.ssei.service.pipe.pipeonlinemaintain.PipeOnlineThiTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;

@Service
@Transactional
public class PipeOnlineThiTestServiceImpl extends DaoSupportImpl<PipeOnlineThiTest> implements PipeOnlineThiTestService{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(PipeOnlineThiTest pipeOnlineThiTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(1,"pipeOnlineThiTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(pipeOnlineThiTest.getId(), "pipeOnlineThiTest", Constant.PIPE_DOCUMENT_UPLOAD, "pipeOnlineThiTest.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(pipeOnlineThiTest);
		PipeBasic pipeBasic = pipeOnlineThiTest.getPipeOnlineMaintain().getPipeMaintain().getPipeBasic();
		HashMap<String, String> map1= BeanUtils.beanToMap(pipeBasic);
		map.putAll(map1);
		map.put("#m_ID#", pipeOnlineThiTest.getPipeOnlineMaintain().getPipeMaintain().getM_ID());
		map.put("#com_Name#", pipeBasic.getCompany().getName());
		String p_Sur_Sta = pipeOnlineThiTest.getP_Sur_Sta();
		p_Sur_Sta = genCheckBoxString("去漆,去绣,打磨,未处理", p_Sur_Sta);
		String value=pipeOnlineThiTest.getP_Thi_Value()+" "; 
		String[] array = value.split(",|;");
		String tempFilePath = MyFileUtils.getPipeTempPath()+"pipeTemp.doc";
		helper.addRowAndValueInOnlineThi(templetePath, tempFilePath, array.length);
		for (int i = 0; i < array.length; i++) {
			int num = i+1;
		    String name ="#temp"+num+"#";
		    map.put(name, array[i]);
		}
		for (int i = array.length; i < 100; i++) {
			int num = i+1;
			String name ="#temp"+num+"#";
	        map.put(name, "");
		}
		helper = new JacobHelper();
		helper.toWord(tempFilePath, filePath, map);		
	}


}
