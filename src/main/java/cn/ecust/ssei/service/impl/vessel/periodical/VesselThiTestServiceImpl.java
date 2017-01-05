package cn.ecust.ssei.service.impl.vessel.periodical;

import java.io.File;
import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.periodical.VesselThiTest;
import cn.ecust.ssei.service.vessel.periodical.VesselThiTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class VesselThiTestServiceImpl  extends DaoSupportImpl<VesselThiTest> implements VesselThiTestService{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselThiTest vesselThiTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselThiTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselThiTest.getId(), "vesselThiTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselThiTest.doc");
		
		JacobHelper helper = new JacobHelper();

		HashMap<String, String> map= BeanUtils.beanToMap(vesselThiTest);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselThiTest.getVesselPeriodicalMaintain().getVesselMaintain());
		map.putAll(map1);

		
		/**
		 * 处理图片
		 */
		String path = MyFileUtils.getFilePathWithName(vesselThiTest.getVesselPeriodicalMaintain().getId(), "vesselThiTestPic.jpg", Constant.VESSEL_ATTATCHMENT_UPLOAD, "vesselThiTestPic.jpg");
		File file = new File(path);
		if (!file.exists()) {
			path="";
		}
		map.put("#vesselThiTestPic.jpg#", path);
		/**
		 * 处理v_Thi_Value
		 */
		String value=vesselThiTest.getV_Thi_Value();
		if (value==null) {
			value="";
		}
		value=value+" ";
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
