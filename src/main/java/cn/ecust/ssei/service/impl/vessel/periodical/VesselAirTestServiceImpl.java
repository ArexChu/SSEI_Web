package cn.ecust.ssei.service.impl.vessel.periodical;

import java.io.File;
import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.periodical.VesselAirTest;
import cn.ecust.ssei.service.vessel.periodical.VesselAirTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class VesselAirTestServiceImpl extends DaoSupportImpl<VesselAirTest> implements VesselAirTestService{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselAirTest vesselAirTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselAirTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselAirTest.getId(), "vesselAirTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselAirTest.doc");
		
		JacobHelper helper = new JacobHelper();

		HashMap<String, String> map= BeanUtils.beanToMap(vesselAirTest);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselAirTest.getVesselPeriodicalMaintain().getVesselMaintain());
		map.putAll(map1);
		String v_Air_Result = vesselAirTest.getV_Air_Result();
		v_Air_Result = genCheckBoxString("合格,不合格", v_Air_Result);
		map.put("#v_Air_Result#", v_Air_Result);
		/**
		 * 处理图片
		 */
		String path = MyFileUtils.getFilePathWithName(vesselAirTest.getVesselPeriodicalMaintain().getId(), "vesselAirTestPic.jpg", Constant.VESSEL_ATTATCHMENT_UPLOAD, "vesselAirTestPic.jpg");
		File file = new File(path);
		if (!file.exists()) {
			path="";
		}
		String v_Air_Process = vesselAirTest.getV_Air_Process();
		getTempData(v_Air_Process,map);
		map.put("#vesselAirTestPic.jpg#", path);
		helper.toWord(templetePath, filePath, map);
		
	}
	
	private void getTempData(String string, HashMap<String, String> map) {
		string=string+" ";
		String[]array=string.split(",");
		for (int i = 0; i < array.length; i++) {
			String baseString="t1_"+i;
			map.put("#"+baseString+"#", array[i]);
			
		}
	}


}
