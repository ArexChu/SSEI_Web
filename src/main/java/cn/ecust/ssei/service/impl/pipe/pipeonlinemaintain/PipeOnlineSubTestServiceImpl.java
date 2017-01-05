package cn.ecust.ssei.service.impl.pipe.pipeonlinemaintain;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.pipe.PipeBasic;
import cn.ecust.ssei.domain.pipe.pipeonlinemaintain.PipeOnlineSubTest;
import cn.ecust.ssei.service.pipe.pipeonlinemaintain.PipeOnlineSubTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;

@Service
@Transactional
public class PipeOnlineSubTestServiceImpl extends DaoSupportImpl<PipeOnlineSubTest> implements PipeOnlineSubTestService{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(PipeOnlineSubTest pipeOnlineSubTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(1,"pipeOnlineSubTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(pipeOnlineSubTest.getId(), "pipeOnlineSubTest", Constant.PIPE_DOCUMENT_UPLOAD, "pipeOnlineSubTest.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(pipeOnlineSubTest);
		PipeBasic pipeBasic = pipeOnlineSubTest.getPipeOnlineMaintain().getPipeMaintain().getPipeBasic();
		HashMap<String, String> map1= BeanUtils.beanToMap(pipeBasic);
		map.putAll(map1);
		String m_OL_Prep = pipeOnlineSubTest.getM_OL_Prep();
		m_OL_Prep = genCheckBoxString("管道平面布置图,管道工艺流程图,单线图,历次在线检验报告,历次全面检验报告,运行参数等技术资料", m_OL_Prep);
		map.put("#m_OL_Prep#", m_OL_Prep);
		map.put("#m_Bas_Prob#", pipeOnlineSubTest.getPipeOnlineMaintain().getPipeMaintain().getM_Bas_Prob());
		String m_OL_Check = pipeOnlineSubTest.getM_OL_Check();
		m_OL_Check = genCheckBoxString("管道运行记录,管道开停车记录,管道隐患监护措施实施情况记录,管道改造施工记录,检修报告,管道事故处理记录,检验方案", m_OL_Check);
		map.put("#m_OL_Check#", m_OL_Check);
		helper.toWord(templetePath, filePath, map);	
		
	}


}
