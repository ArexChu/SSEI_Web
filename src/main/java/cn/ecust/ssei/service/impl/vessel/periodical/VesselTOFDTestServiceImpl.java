package cn.ecust.ssei.service.impl.vessel.periodical;

import java.io.File;
import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.periodical.VesselTOFDTest;
import cn.ecust.ssei.service.vessel.periodical.VesselTOFDTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class VesselTOFDTestServiceImpl extends DaoSupportImpl<VesselTOFDTest> implements VesselTOFDTestService {

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselTOFDTest vesselTOFDTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselTOFDTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselTOFDTest.getId(), "vesselTOFDTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselTOFDTest.doc");
		
		JacobHelper helper = new JacobHelper();

		HashMap<String, String> map= BeanUtils.beanToMap(vesselTOFDTest);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselTOFDTest.getVesselPeriodicalMaintain().getVesselMaintain());
		map.putAll(map1);
		
		String v_TOFD_Cha_1 = vesselTOFDTest.getV_TOFD_Cha_1();
		getTempData(v_TOFD_Cha_1,map,"1");
		String v_TOFD_Cha_2 = vesselTOFDTest.getV_TOFD_Cha_2();
		getTempData(v_TOFD_Cha_2,map,"2");
		String v_TOFD_Cha_3 = vesselTOFDTest.getV_TOFD_Cha_3();
		getTempData(v_TOFD_Cha_3,map,"3");
		String v_TOFD_Cha_4 = vesselTOFDTest.getV_TOFD_Cha_4();
		getTempData(v_TOFD_Cha_4,map,"4");
		
		/**
		 * 处理图片
		 */
		String path = MyFileUtils.getFilePathWithName(vesselTOFDTest.getVesselPeriodicalMaintain().getId(), "vesselTOFDTestPic.jpg", Constant.VESSEL_ATTATCHMENT_UPLOAD, "vesselTOFDTestPic.jpg");
		File file = new File(path);
		if (!file.exists()) {
			path="";
		}
		map.put("#vesselTOFDTestPic.jpg#", path);
		/**
		 * 处理v_tofd_Value
		 */
		String value=vesselTOFDTest.getV_TOFD_Value()+" "; 
		String[] array = value.split(",|;");
		String tempFilePath = MyFileUtils.getVesselTempPath()+"vesselTemp.doc";
		int maxNum=40;
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

	private void getTempData(String string, HashMap<String, String> map, String num) {
		string=string+" ";
		String[]array=string.split(",");
		for (int i = 0; i < array.length; i++) {
			String baseString="tm"+num+"_"+i;
			map.put("#"+baseString+"#", array[i]);
			
		}
	}

}
