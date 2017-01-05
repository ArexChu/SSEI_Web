package cn.ecust.ssei.service.impl.vessel.periodical;

import java.io.File;
import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.periodical.VesselPermTest;
import cn.ecust.ssei.service.vessel.periodical.VesselPermTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class VesselPermTestServiceImpl  extends DaoSupportImpl<VesselPermTest> implements VesselPermTestService{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselPermTest vesselPermTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselPermTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselPermTest.getId(), "vesselPermTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselPermTest.doc");
		
		JacobHelper helper = new JacobHelper();

		HashMap<String, String> map= BeanUtils.beanToMap(vesselPermTest);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselPermTest.getVesselPeriodicalMaintain().getVesselMaintain());
		map.putAll(map1);
		
		/**
		 * 处理图片
		 */
		String path = MyFileUtils.getFilePathWithName(vesselPermTest.getVesselPeriodicalMaintain().getId(), "vesselPermTestPic.jpg", Constant.VESSEL_ATTATCHMENT_UPLOAD, "vesselPermTestPic.jpg");
		File file = new File(path);
		if (!file.exists()) {
			path="";
		}
		map.put("#vesselPermTestPic.jpg#", path);
		
		/**
		 * 处理v_Perm_Value
		 */
		String value=vesselPermTest.getV_Perm_Value()+" "; 
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
