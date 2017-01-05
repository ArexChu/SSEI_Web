package cn.ecust.ssei.service.impl.vessel.periodical;

import java.io.File;
import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.periodical.VesselPreTest;
import cn.ecust.ssei.service.vessel.periodical.VesselPreTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class VesselPreTestServiceImpl  extends DaoSupportImpl<VesselPreTest> implements VesselPreTestService{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselPreTest vesselPreTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselPreTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselPreTest.getId(), "vesselPreTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselPreTest.doc");
		
		JacobHelper helper = new JacobHelper();

		HashMap<String, String> map= BeanUtils.beanToMap(vesselPreTest);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselPreTest.getVesselPeriodicalMaintain().getVesselMaintain());
		map.putAll(map1);
		String v_Pre_Result = vesselPreTest.getV_Pre_Result();
		v_Pre_Result = genCheckBoxString("合格,不合格", v_Pre_Result);
		map.put("#v_Pre_Result#", v_Pre_Result);
		/**
		 * 处理图片
		 */
		String path = MyFileUtils.getFilePathWithName(vesselPreTest.getVesselPeriodicalMaintain().getId(), "vesselPreTestPic.jpg", Constant.VESSEL_ATTATCHMENT_UPLOAD, "vesselPreTestPic.jpg");
		File file = new File(path);
		if (!file.exists()) {
			path="";
		}
		String v_Pre_Process = vesselPreTest.getV_Pre_Process();
		getTempData(v_Pre_Process,map);
		map.put("#vesselPreTestPic.jpg#", path);
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
