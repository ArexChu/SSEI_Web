package cn.ecust.ssei.service.impl.pipe.pipedetailmaintain;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.Company;
import cn.ecust.ssei.domain.pipe.PipeBasic;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeVerification;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipeVerficationService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class PipeVerficationServiceImpl extends DaoSupportImpl<PipeVerification> implements PipeVerficationService {

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(PipeVerification pipeVerification) {
		
		String templetePath = MyFileUtils.getTempletePathWithName(1,"pipeVerification.doc");	
		String filePath = MyFileUtils.getFilePathWithName(pipeVerification.getId(), "pipeVerification", Constant.PIPE_DOCUMENT_UPLOAD, "pipeVerification.doc");
	
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(pipeVerification);
		PipeBasic pipeBasic= pipeVerification.getPipeDetailMaintain().getPipeMaintain().getPipeBasic();
		Company company = pipeBasic.getCompany();
		HashMap<String, String> map1= BeanUtils.beanToMap(company);
		map.putAll(map1);
		String m_Original_Data = pipeVerification.getM_Original_Data();
		m_Original_Data = genCheckBoxString("有,部分,无", m_Original_Data);
		map.put("#m_Original_Data#", m_Original_Data);
		
		String m_Rules = pipeVerification.getM_Rules();
		m_Rules = genCheckBoxString("有,不健全,无", m_Rules);
		map.put("#m_Rules#", m_Rules);
		
		String m_Items = pipeVerification.getM_Items();
		m_Items = genCheckBoxString("宏观检验,管道测厚,射线探伤,超声探伤,磁粉探伤,渗透探伤,材料分析,硬度测定,压力试验,泄漏试验,安全附件检查,单线图",m_Items);
		map.put("#m_Items#", m_Items);
		
		String p_Next_Time=pipeBasic.getNextDetailMaintainDate();
		map.put("#p_Next_Time#",p_Next_Time );
		
		helper.toWord(templetePath, filePath, map);
		
		
	}


}
