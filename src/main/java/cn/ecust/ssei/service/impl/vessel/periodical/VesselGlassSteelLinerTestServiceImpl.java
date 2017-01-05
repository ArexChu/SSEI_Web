package cn.ecust.ssei.service.impl.vessel.periodical;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.periodical.VesselGlassSteelLinerTest;
import cn.ecust.ssei.service.vessel.periodical.VesselGlassSteelLinerTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class VesselGlassSteelLinerTestServiceImpl extends DaoSupportImpl<VesselGlassSteelLinerTest> implements VesselGlassSteelLinerTestService {

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselGlassSteelLinerTest vesselGlassSteelLinerTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselGlassSteelLinerTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselGlassSteelLinerTest.getId(), "vesselGlassSteelLinerTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselGlassSteelLinerTest.doc");
		
		JacobHelper helper = new JacobHelper();

		HashMap<String, String> map= BeanUtils.beanToMap(vesselGlassSteelLinerTest);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselGlassSteelLinerTest.getVesselPeriodicalMaintain().getVesselMaintain());
		map.putAll(map1);
		helper.toWord(templetePath, filePath, map);
		
	}



}
