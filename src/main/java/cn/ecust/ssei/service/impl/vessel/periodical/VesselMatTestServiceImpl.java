package cn.ecust.ssei.service.impl.vessel.periodical;

import java.io.File;
import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.periodical.VesselMatTest;
import cn.ecust.ssei.service.vessel.periodical.VesselMatTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class VesselMatTestServiceImpl   extends DaoSupportImpl<VesselMatTest> implements VesselMatTestService{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselMatTest vesselMatTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselMatTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselMatTest.getId(), "vesselMatTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselMatTest.doc");
		
		JacobHelper helper = new JacobHelper();

		HashMap<String, String> map= BeanUtils.beanToMap(vesselMatTest);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselMatTest.getVesselPeriodicalMaintain().getVesselMaintain());
		map.putAll(map1);
		
		String v_Mat_Ele = vesselMatTest.getV_Mat_Ele();
		getTempData(v_Mat_Ele,map);
		
		String v_Mat_Ana_Method= vesselMatTest.getV_Mat_Ana_Method();
		v_Mat_Ana_Method = genCheckBoxString("化学,光谱", v_Mat_Ana_Method);
		map.put("#v_Mat_Ana_Method#", v_Mat_Ana_Method);
		
		/**
		 * 处理图片
		 */
		String path = MyFileUtils.getFilePathWithName(vesselMatTest.getVesselPeriodicalMaintain().getId(), "vesselMatTestPic.jpg", Constant.VESSEL_ATTATCHMENT_UPLOAD, "vesselMatTestPic.jpg");
		File file = new File(path);
		if (!file.exists()) {
			path="";
		}
		map.put("#vesselMatTestPic.jpg#", path);
		/**
		 * 处理v_mat_Value
		 */
		String value=vesselMatTest.getV_Mat_Value()+" "; 
		String[] array = value.split(",|;");
		String tempFilePath = MyFileUtils.getVesselTempPath()+"vesselTemp.doc";
		int maxNum=12;
		int lastNum=2;
		helper.addRowAndValueInVessel(templetePath, tempFilePath, array.length,maxNum,lastNum);
		for (int i = 0; i < array.length; i++) {
			int num = i+1;
		    String name ="#"+num+"#";
		    map.put(name, array[i]);
		}
		for (int i = array.length; i <maxNum; i++) {
			int num = i+1;
			String name ="#"+num+"#";
	        map.put(name, "");
		}
		
		helper = new JacobHelper();
		helper.toWord(tempFilePath, filePath, map);	
		
	}
	
	
	private void getTempData(String string, HashMap<String, String> map) {
		string=string+" ";
		String[]array=string.split(",");
		for (int i = 0; i < array.length; i++) {
			String baseString="e_"+i;
			map.put("#"+baseString+"#", array[i]);
			
		}
	}
	
}
