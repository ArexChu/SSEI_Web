package cn.ecust.ssei.service.impl.vessel.periodical;

import java.io.File;
import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.periodical.VesselMagneticTest;
import cn.ecust.ssei.service.vessel.periodical.VesselMagneticTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class VesselMagneticTestServiceImpl  extends DaoSupportImpl<VesselMagneticTest> implements VesselMagneticTestService {

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselMagneticTest vesselMagneticTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselMagneticTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselMagneticTest.getId(), "vesselMagneticTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselMagneticTest.doc");
		
		JacobHelper helper = new JacobHelper();

		HashMap<String, String> map= BeanUtils.beanToMap(vesselMagneticTest);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselMagneticTest.getVesselPeriodicalMaintain().getVesselMaintain());
		map.putAll(map1);

		
		/**
		 * 处理图片
		 */
		String path = MyFileUtils.getFilePathWithName(vesselMagneticTest.getVesselPeriodicalMaintain().getId(), "vesselMagneticTestPic.jpg", Constant.VESSEL_ATTATCHMENT_UPLOAD, "vesselMagneticTestPic.jpg");
		File file = new File(path);
		if (!file.exists()) {
			path="";
		}
		map.put("#vesselMagneticTestPic.jpg#", path);
		/**
		 * 处理v_TMag_Value
		 */
		String value=vesselMagneticTest.getV_Mag_Value()+" "; 
		String[] array = value.split(",|;");
		String tempFilePath = MyFileUtils.getVesselTempPath()+"vesselTemp.doc";
		int maxNum=36;
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
