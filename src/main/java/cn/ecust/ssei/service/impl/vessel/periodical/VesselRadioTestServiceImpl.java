package cn.ecust.ssei.service.impl.vessel.periodical;

import java.io.File;
import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.periodical.VesselRadioTest;
import cn.ecust.ssei.service.vessel.periodical.VesselRadioTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class VesselRadioTestServiceImpl  extends DaoSupportImpl<VesselRadioTest> implements VesselRadioTestService{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselRadioTest vesselRadioTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselRadioTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselRadioTest.getId(), "vesselRadioTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselRadioTest.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(vesselRadioTest);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselRadioTest.getVesselPeriodicalMaintain().getVesselMaintain());
		map.putAll(map1);
		String v_Radio_Type = vesselRadioTest.getV_Radio_Type();
		v_Radio_Type = genCheckBoxString("X射线,Ir192,Co60,其他", v_Radio_Type);
		map.put("#v_Radio_Type#", v_Radio_Type);
		/**
		 * 处理图片
		 */
		String path = MyFileUtils.getFilePathWithName(vesselRadioTest.getVesselPeriodicalMaintain().getId(), "vesselRadioTestPic.jpg", Constant.VESSEL_ATTATCHMENT_UPLOAD, "vesselRadioTestPic.jpg");
		File file = new File(path);
		if (!file.exists()) {
			path="";
		}
		map.put("#vesselRadioTestPic.jpg#", path);
		/**
		 * 处理getV_Radio_value
		 */
		String value=vesselRadioTest.getV_Radio_value()+" "; 
		String[] array = value.split(",|;");
		String tempFilePath = MyFileUtils.getVesselTempPath()+"vesselTemp.doc";
		int maxNum=30;
		int lastNum=3;
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
