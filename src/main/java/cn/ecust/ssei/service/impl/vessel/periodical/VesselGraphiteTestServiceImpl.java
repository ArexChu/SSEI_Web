package cn.ecust.ssei.service.impl.vessel.periodical;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.periodical.VesselGraphiteTest;
import cn.ecust.ssei.service.vessel.periodical.VesselGraphiteTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class VesselGraphiteTestServiceImpl  extends DaoSupportImpl<VesselGraphiteTest> implements VesselGraphiteTestService {

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselGraphiteTest vesselGraphiteTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselGraphiteTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselGraphiteTest.getId(), "vesselGraphiteTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselGraphiteTest.doc");
		
		JacobHelper helper = new JacobHelper();

		HashMap<String, String> map= BeanUtils.beanToMap(vesselGraphiteTest);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselGraphiteTest.getVesselPeriodicalMaintain().getVesselMaintain());
		map.putAll(map1);
		helper.toWord(templetePath, filePath, map);
		
	}

}
