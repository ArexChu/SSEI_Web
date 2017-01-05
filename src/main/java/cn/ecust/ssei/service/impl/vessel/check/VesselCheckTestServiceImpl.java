package cn.ecust.ssei.service.impl.vessel.check;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.VesselBasic;
import cn.ecust.ssei.domain.vessel.VesselMaintain;
import cn.ecust.ssei.domain.vessel.check.VesselCheckTest;
import cn.ecust.ssei.service.vessel.check.VesselCheckTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;

@Service
@Transactional
public class VesselCheckTestServiceImpl  extends DaoSupportImpl<VesselCheckTest> implements VesselCheckTestService{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselCheckTest vesselCheckTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselCheckTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselCheckTest.getId(), "vesselCheckTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselCheckTest.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(vesselCheckTest);
		VesselMaintain vesselMaintain = vesselCheckTest.getVesselCheckMaintain().getVesselMaintain();
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselMaintain);
		VesselBasic vesselBasic = vesselMaintain.getVesselBasic();
		HashMap<String, String> map2= BeanUtils.beanToMap(vesselBasic);
		map.putAll(map1);
		map.putAll(map2);
		String v_C_Volume = vesselBasic.getV_C_Volume();
		v_C_Volume = genCheckBoxString("容积m3,换热面积m2", v_C_Volume);
		map.put("#v_C_Volume#", v_C_Volume);
		
		String v_De_Pre_C_Shell = vesselBasic.getV_De_Pre_C_Shell();
		v_De_Pre_C_Shell = genCheckBoxString("壳体,壳程", v_De_Pre_C_Shell);
		map.put("#v_De_Pre_C_Shell#", v_De_Pre_C_Shell);
		
		String v_De_Pre_C_Jacket = vesselBasic.getV_De_Pre_C_Jacket();
		v_De_Pre_C_Jacket = genCheckBoxString("夹套,管程", v_De_Pre_C_Jacket);
		map.put("#v_De_Pre_C_Jacket#", v_De_Pre_C_Jacket);
		
		String v_Wo_Pre_C_Shell = vesselBasic.getV_Wo_Pre_C_Shell();
		v_Wo_Pre_C_Shell = genCheckBoxString("壳体,壳程", v_Wo_Pre_C_Shell);
		map.put("#v_Wo_Pre_C_Shell#", v_Wo_Pre_C_Shell);
		
		String v_Wo_Pre_C_Jacket = vesselBasic.getV_Wo_Pre_C_Jacket();
		v_Wo_Pre_C_Jacket = genCheckBoxString("夹套,管程", v_Wo_Pre_C_Jacket);
		map.put("#v_Wo_Pre_C_Jacket#", v_Wo_Pre_C_Jacket);
		
		String v_De_Tem_C_Shell = vesselBasic.getV_De_Tem_C_Shell();
		v_De_Tem_C_Shell = genCheckBoxString("壳体,壳程", v_De_Tem_C_Shell);
		map.put("#v_De_Tem_C_Shell#", v_De_Tem_C_Shell);
		
		String v_De_Tem_C_Jacket = vesselBasic.getV_De_Tem_C_Jacket();
		v_De_Tem_C_Jacket = genCheckBoxString("夹套,管程", v_De_Tem_C_Jacket);
		map.put("#v_De_Tem_C_Jacket#", v_De_Tem_C_Jacket);
						
		String v_Wo_Tem_C_Shell = vesselBasic.getV_Wo_Tem_C_Shell();
		v_Wo_Tem_C_Shell = genCheckBoxString("壳体,壳程", v_Wo_Tem_C_Shell);
		map.put("#v_Wo_Tem_C_Shell#", v_Wo_Tem_C_Shell);
		
		String v_Wo_Tem_C_Jacket = vesselBasic.getV_Wo_Tem_C_Jacket();
		v_Wo_Tem_C_Jacket = genCheckBoxString("夹套,管程", v_Wo_Tem_C_Jacket);
		map.put("#v_Wo_Tem_C_Jacket#", v_Wo_Tem_C_Jacket);
		
		String v_Med_C_Shell = vesselBasic.getV_Med_C_Shell();
		v_Med_C_Shell = genCheckBoxString("壳体,壳程", v_Med_C_Shell);
		map.put("#v_Med_C_Shell#", v_Med_C_Shell);
		
		String v_Med_C_Jacket = vesselBasic.getV_Med_C_Jacket();
		v_Med_C_Jacket = genCheckBoxString("夹套,管程", v_Med_C_Jacket);
		map.put("#v_Med_C_Jacket#", v_Med_C_Jacket);
		
		String v_Ma_C_Jacket = vesselBasic.getV_Ma_C_Jacket();
		v_Ma_C_Jacket = genCheckBoxString("夹套,换热管", v_Ma_C_Jacket);
		map.put("#v_Ma_C_Jacket#", v_Ma_C_Jacket);
		
		String v_Thi_C_Jacket = vesselBasic.getV_Thi_C_Jacket();
		v_Thi_C_Jacket = genCheckBoxString("夹套,换热管", v_Thi_C_Jacket);
		map.put("#v_Thi_C_Jacket#", v_Thi_C_Jacket);
		
		map.put("#v_De_Com#", vesselBasic.getV_De_Com().getName());
		map.put("#v_Man_Com#", vesselBasic.getV_Man_Com().getName());
		
		helper.toWord(templetePath, filePath, map);
		
	}


}
