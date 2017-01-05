package cn.ecust.ssei.service.impl.vessel.periodical;

import java.io.File;
import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.periodical.VesselHardTest;
import cn.ecust.ssei.service.vessel.periodical.VesselHardTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class VesselHardTestServiceImpl   extends DaoSupportImpl<VesselHardTest> implements VesselHardTestService{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselHardTest vesselHardTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselHardTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselHardTest.getId(), "vesselHardTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselHardTest.doc");
		
		JacobHelper helper = new JacobHelper();

		HashMap<String, String> map= BeanUtils.beanToMap(vesselHardTest);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselHardTest.getVesselPeriodicalMaintain().getVesselMaintain());
		map.putAll(map1);

		
		/**
		 * 处理图片
		 */
		String path = MyFileUtils.getFilePathWithName(vesselHardTest.getVesselPeriodicalMaintain().getId(), "vesselHardTestPic.jpg", Constant.VESSEL_ATTATCHMENT_UPLOAD, "vesselHardTestPic.jpg");
		File file = new File(path);
		if (!file.exists()) {
			path="";
		}
		map.put("#vesselHardTestPic.jpg#", path);
		/**
		 * 处理v_hard_Value
		 */
		String value=vesselHardTest.getV_Hard_Value()+" "; 
		String[] array = value.split(",|;");
		String tempFilePath = MyFileUtils.getVesselTempPath()+"vesselTemp.doc";
		int maxNum=9;
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
