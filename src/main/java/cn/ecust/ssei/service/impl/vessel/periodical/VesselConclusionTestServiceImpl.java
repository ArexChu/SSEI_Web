package cn.ecust.ssei.service.impl.vessel.periodical;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.VesselBasic;
import cn.ecust.ssei.domain.vessel.VesselMaintain;
import cn.ecust.ssei.domain.vessel.periodical.VesselConclusionTest;
import cn.ecust.ssei.service.vessel.periodical.VesselConclusionTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class VesselConclusionTestServiceImpl extends DaoSupportImpl<VesselConclusionTest> implements VesselConclusionTestService{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselConclusionTest vesselConclusionTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselConclusionTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselConclusionTest.getId(), "vesselConclusionTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselConclusionTest.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(vesselConclusionTest);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselConclusionTest.getVesselPeriodicalMaintain().getVesselMaintain());
		VesselMaintain vesselMaintain= vesselConclusionTest.getVesselPeriodicalMaintain().getVesselMaintain();
		VesselBasic vesselBasic= vesselMaintain.getVesselBasic();
		HashMap<String, String> map2= BeanUtils.beanToMap(vesselBasic);
		HashMap<String, String> map3=BeanUtils.beanToMap(vesselBasic.getV_Use_Com());
		map.putAll(map1);
		map.putAll(map2);
		map.putAll(map3);
		String v_M_Bas_Prob = vesselMaintain.getV_M_Bas_Prob();
		map.put("#v_M_Bas_Prob#", v_M_Bas_Prob);
		
		String v_M_Condition= vesselConclusionTest.getV_M_Condition();
		v_M_Condition = genCheckBoxString("具备检验条件,不具备检验条件", v_M_Condition);
		map.put("#v_M_Condition#", v_M_Condition);
		
		String v_M_Type= vesselConclusionTest.getV_M_Type();
		v_M_Type = genCheckBoxString("首次,定期检验", v_M_Type);
		map.put("#v_M_Type#", v_M_Type);
		
		
		String v_M_Sta= vesselConclusionTest.getV_M_Sta();
		if (v_M_Sta!=null) {
			String[] arr = v_M_Sta.split(",");
			String v_M_Sta_1 = genCheckBoxString("自用,租赁", arr[0]);
			String v_M_Sta_2 = genCheckBoxString("生产,生活", arr[1]);
			String v_M_Sta_3 = genCheckBoxString("长期使用,间歇使用,备用", arr[2]);
			v_M_Sta=v_M_Sta_1+"/"+v_M_Sta_2+"/"+v_M_Sta_3;
			map.put("#v_M_Sta#", v_M_Sta);
		}else {
			map.put("#v_M_Sta#", "");
		}
		

		helper.toWord(templetePath, filePath, map);
		
	}
}
