package cn.ecust.ssei.service.impl.vessel.periodical;

import java.io.File;
import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.periodical.VesselUltrasonicTest;
import cn.ecust.ssei.service.vessel.periodical.VesselUltrasonicTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class VesselUltrasonicTestServiceImpl  extends DaoSupportImpl<VesselUltrasonicTest> implements VesselUltrasonicTestService{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselUltrasonicTest vesselUltrasonicTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselUltrasonicTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselUltrasonicTest.getId(), "vesselUltrasonicTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselUltrasonicTest.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(vesselUltrasonicTest);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselUltrasonicTest.getVesselPeriodicalMaintain().getVesselMaintain());
		map.putAll(map1);
		/**
		 * 处理图片
		 */
		String path = MyFileUtils.getFilePathWithName(vesselUltrasonicTest.getVesselPeriodicalMaintain().getId(), "vesselUltrasonicTestPic.jpg", Constant.VESSEL_ATTATCHMENT_UPLOAD, "vesselUltrasonicTestPic.jpg");
		File file = new File(path);
		if (!file.exists()) {
			path="";
		}
		map.put("#vesselUltrasonicTestPic.jpg#", path);
		
		String value=vesselUltrasonicTest.getV_Ult_Value()+" "; 
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

}
