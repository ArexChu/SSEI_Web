package cn.ecust.ssei.service.impl.vessel.periodical;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.periodical.VesselSPDTest;
import cn.ecust.ssei.service.vessel.periodical.VesselSPDTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class VesselSPDTestServiceImpl extends DaoSupportImpl<VesselSPDTest> implements VesselSPDTestService {

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselSPDTest vesselSPDTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselSPDTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselSPDTest.getId(), "vesselSPDTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselSPDTest.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(vesselSPDTest);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselSPDTest.getVesselPeriodicalMaintain().getVesselMaintain());
		map.putAll(map1);
		helper.toWord(templetePath, filePath, map);
		
	}

}
