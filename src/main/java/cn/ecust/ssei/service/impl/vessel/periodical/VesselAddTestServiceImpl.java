package cn.ecust.ssei.service.impl.vessel.periodical;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.periodical.VesselAddTest;
import cn.ecust.ssei.service.vessel.periodical.VesselAddTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;

@Service
@Transactional
public class VesselAddTestServiceImpl extends DaoSupportImpl<VesselAddTest> implements VesselAddTestService {

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselAddTest vesselAddTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselAddTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselAddTest.getId(), "vesselAddTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselAddTest.doc");
		
		JacobHelper helper = new JacobHelper();

		HashMap<String, String> map= BeanUtils.beanToMap(vesselAddTest);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselAddTest.getVesselPeriodicalMaintain().getVesselMaintain());
		map.putAll(map1);
		String v_Add_Result = vesselAddTest.getV_Add_Result();
		v_Add_Result = genCheckBoxString("合格,不合格", v_Add_Result);
		map.put("#v_Add_Result#", v_Add_Result);
		helper.toWord(templetePath, filePath, map);
		
	}

}
