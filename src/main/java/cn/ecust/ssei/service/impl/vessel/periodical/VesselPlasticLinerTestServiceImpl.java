package cn.ecust.ssei.service.impl.vessel.periodical;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.periodical.VesselPlasticLinerTest;
import cn.ecust.ssei.service.vessel.periodical.VesselPlasticLinerTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class VesselPlasticLinerTestServiceImpl  extends DaoSupportImpl<VesselPlasticLinerTest> implements VesselPlasticLinerTestService{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselPlasticLinerTest vesselPlasticLinerTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselPlasticLinerTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselPlasticLinerTest.getId(), "vesselPlasticLinerTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselPlasticLinerTest.doc");
		
		JacobHelper helper = new JacobHelper();

		HashMap<String, String> map= BeanUtils.beanToMap(vesselPlasticLinerTest);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselPlasticLinerTest.getVesselPeriodicalMaintain().getVesselMaintain());
		map.putAll(map1);
		helper.toWord(templetePath, filePath, map);
		
	}

}
