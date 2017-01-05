package cn.ecust.ssei.service.impl.vessel.annual;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.VesselMaintain;
import cn.ecust.ssei.domain.vessel.annual.VesselAnnualTest;
import cn.ecust.ssei.service.vessel.annual.VesselAnnualTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;

@Service
@Transactional
public class VesselAnnualTestServiceImpl extends DaoSupportImpl<VesselAnnualTest> implements VesselAnnualTestService{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselAnnualTest vesselAnnualTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselAnnualTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselAnnualTest.getId(), "vesselAnnualTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselAnnualTest.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(vesselAnnualTest);
		VesselMaintain vesselMaintain = vesselAnnualTest.getVesselAnnualMaintain().getVesselMaintain();
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselMaintain);
		map.putAll(map1);
		helper.toWord(templetePath, filePath, map);
		
		
	}


}
