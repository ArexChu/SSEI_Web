package cn.ecust.ssei.service.impl.vessel.annual;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.Company;
import cn.ecust.ssei.domain.vessel.VesselBasic;
import cn.ecust.ssei.domain.vessel.VesselMaintain;
import cn.ecust.ssei.domain.vessel.annual.VesselAnnualConclusionTest;
import cn.ecust.ssei.service.vessel.annual.VesselAnnualConclusionTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;

@Service
@Transactional
public class VesselAnnualConclusionTestServiceImpl extends DaoSupportImpl<VesselAnnualConclusionTest> implements VesselAnnualConclusionTestService{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselAnnualConclusionTest vesselAnnualConclusionTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselAnnualConclusionTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselAnnualConclusionTest.getId(), "vesselAnnualConclusionTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselAnnualConclusionTest.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(vesselAnnualConclusionTest);
		VesselMaintain vesselMaintain = vesselAnnualConclusionTest.getVesselAnnualMaintain().getVesselMaintain();
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselMaintain);
		VesselBasic vesselBasic = vesselMaintain.getVesselBasic();
		HashMap<String, String> map2= BeanUtils.beanToMap(vesselBasic);
		Company company = vesselBasic.getV_Use_Com();
		HashMap<String, String> map3= BeanUtils.beanToMap(company);
		map.putAll(map1);
		map.putAll(map2);
		map.putAll(map3);
		helper.toWord(templetePath, filePath, map);
		
	}


}
