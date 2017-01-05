package cn.ecust.ssei.service.impl.vessel.periodical;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.periodical.VesselPlasticTest;
import cn.ecust.ssei.service.vessel.periodical.VesselPlasticTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class VesselPlasticTestServiceImpl  extends DaoSupportImpl<VesselPlasticTest> implements VesselPlasticTestService{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselPlasticTest vesselPlasticTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselPlasticTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselPlasticTest.getId(), "vesselPlasticTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselPlasticTest.doc");
		
		JacobHelper helper = new JacobHelper();

		HashMap<String, String> map= BeanUtils.beanToMap(vesselPlasticTest);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselPlasticTest.getVesselPeriodicalMaintain().getVesselMaintain());
		map.putAll(map1);
		helper.toWord(templetePath, filePath, map);
		
	}

}
