package cn.ecust.ssei.service.impl.vessel.periodical;

import java.io.File;
import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.periodical.VesselMetTest;
import cn.ecust.ssei.service.vessel.periodical.VesselMetTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class VesselMetTestServiceImpl  extends DaoSupportImpl<VesselMetTest> implements VesselMetTestService {

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselMetTest vesselMetTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselMetTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselMetTest.getId(), "vesselMetTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselMetTest.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(vesselMetTest);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselMetTest.getVesselPeriodicalMaintain().getVesselMaintain());
		map.putAll(map1);
		/**
		 * 处理图片
		 */
		String path = MyFileUtils.getFilePathWithName(vesselMetTest.getVesselPeriodicalMaintain().getId(), "vesselMetTestPic1.jpg", Constant.VESSEL_ATTATCHMENT_UPLOAD, "vesselMetTestPic1.jpg");
		File file = new File(path);
		if (!file.exists()) {
			path="";
		}
		map.put("#vesselMetTestPic1.jpg#", path);
		/**
		 * 处理图片
		 */
		String path1 = MyFileUtils.getFilePathWithName(vesselMetTest.getVesselPeriodicalMaintain().getId(), "vesselMetTestPic2.jpg", Constant.VESSEL_ATTATCHMENT_UPLOAD, "vesselMetTestPic2.jpg");
		File file1 = new File(path1);
		if (!file1.exists()) {
			path1="";
		}
		map.put("#vesselMetTestPic2.jpg#", path1);
		
		helper.toWord(templetePath, filePath, map);
		
	}

}
