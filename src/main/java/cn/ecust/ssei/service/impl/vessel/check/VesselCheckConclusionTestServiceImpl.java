package cn.ecust.ssei.service.impl.vessel.check;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.Company;
import cn.ecust.ssei.domain.vessel.VesselBasic;
import cn.ecust.ssei.domain.vessel.VesselMaintain;
import cn.ecust.ssei.domain.vessel.check.VesselCheckConclusionTest;
import cn.ecust.ssei.service.vessel.check.VesselCheckConclusionTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;

@Service
@Transactional
public class VesselCheckConclusionTestServiceImpl  extends DaoSupportImpl<VesselCheckConclusionTest> implements VesselCheckConclusionTestService{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselCheckConclusionTest vesselCheckConclusionTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselCheckConclusionTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselCheckConclusionTest.getId(), "vesselCheckConclusionTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselCheckConclusionTest.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(vesselCheckConclusionTest);
		VesselMaintain vesselMaintain = vesselCheckConclusionTest.getVesselCheckMaintain().getVesselMaintain();
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselMaintain);
		VesselBasic vesselBasic = vesselMaintain.getVesselBasic();
		HashMap<String, String> map2= BeanUtils.beanToMap(vesselBasic);
		Company company = vesselBasic.getV_Use_Com();
		HashMap<String, String> map3= BeanUtils.beanToMap(company);
		map.putAll(map1);
		map.putAll(map2);
		map.putAll(map3);
		map.put("#v_Install_Com#", vesselBasic.getV_Install_Com().getName());
		map.put("#v_M_Ins_Com_Per#", vesselBasic.getV_Install_Com().getContactsPhone());
		
		helper.toWord(templetePath, filePath, map);
		
	}


}
