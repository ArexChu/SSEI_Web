package cn.ecust.ssei.service.impl.vessel.periodical;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.periodical.VesselGraphiteLinerTest;
import cn.ecust.ssei.service.vessel.periodical.VesselGraphiteLinerTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class VesselGraphiteLinerTestServiceImpl extends DaoSupportImpl<VesselGraphiteLinerTest> implements VesselGraphiteLinerTestService {

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselGraphiteLinerTest vesselGraphiteLinerTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselGraphiteLinerTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselGraphiteLinerTest.getId(), "vesselGraphiteLinerTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselGraphiteLinerTest.doc");
		
		JacobHelper helper = new JacobHelper();

		HashMap<String, String> map= BeanUtils.beanToMap(vesselGraphiteLinerTest);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselGraphiteLinerTest.getVesselPeriodicalMaintain().getVesselMaintain());
		map.putAll(map1);
		helper.toWord(templetePath, filePath, map);
		
	}



}
