package cn.ecust.ssei.service.impl.vessel.periodical;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.periodical.VesselGlassSteelTest;
import cn.ecust.ssei.service.vessel.periodical.VesselGlassSteelTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class VesselGlassSteelTestServiceImpl extends DaoSupportImpl<VesselGlassSteelTest> implements VesselGlassSteelTestService {

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselGlassSteelTest vesselGlassSteelTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselGlassSteelTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselGlassSteelTest.getId(), "vesselGlassSteelTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselGlassSteelTest.doc");
		
		JacobHelper helper = new JacobHelper();

		HashMap<String, String> map= BeanUtils.beanToMap(vesselGlassSteelTest);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselGlassSteelTest.getVesselPeriodicalMaintain().getVesselMaintain());
		map.putAll(map1);
		helper.toWord(templetePath, filePath, map);
		
	}

}
