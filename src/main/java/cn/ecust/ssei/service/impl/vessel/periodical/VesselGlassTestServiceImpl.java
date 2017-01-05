package cn.ecust.ssei.service.impl.vessel.periodical;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.periodical.VesselGlassTest;
import cn.ecust.ssei.service.vessel.periodical.VesselGlassTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class VesselGlassTestServiceImpl extends DaoSupportImpl<VesselGlassTest> implements VesselGlassTestService {

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselGlassTest vesselGlassTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselGlassTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselGlassTest.getId(), "vesselGlassTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselGlassTest.doc");
		
		JacobHelper helper = new JacobHelper();

		HashMap<String, String> map= BeanUtils.beanToMap(vesselGlassTest);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselGlassTest.getVesselPeriodicalMaintain().getVesselMaintain());
		map.putAll(map1);
		helper.toWord(templetePath, filePath, map);
		
	}

}
