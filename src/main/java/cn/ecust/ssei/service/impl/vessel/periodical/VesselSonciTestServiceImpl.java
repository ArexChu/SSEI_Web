package cn.ecust.ssei.service.impl.vessel.periodical;

import java.io.File;
import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.periodical.VesselSonciTest;
import cn.ecust.ssei.service.vessel.periodical.VesselSonciTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class VesselSonciTestServiceImpl  extends DaoSupportImpl<VesselSonciTest> implements VesselSonciTestService{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselSonciTest vesselSonciTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselSonciTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselSonciTest.getId(), "vesselSonciTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselSonciTest.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(vesselSonciTest);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselSonciTest.getVesselPeriodicalMaintain().getVesselMaintain());
		map.putAll(map1);
		/**
		 * 处理图片
		 */
		String path = MyFileUtils.getFilePathWithName(vesselSonciTest.getVesselPeriodicalMaintain().getId(), "vesselSonciTestPic1.jpg", Constant.VESSEL_ATTATCHMENT_UPLOAD, "vesselSonciTestPic1.jpg");
		File file = new File(path);
		if (!file.exists()) {
			path="";
		}
		map.put("#vesselSonciTestPic1.jpg#", path);
		/**
		 * 处理图片
		 */
		String path1 = MyFileUtils.getFilePathWithName(vesselSonciTest.getVesselPeriodicalMaintain().getId(), "vesselSonciTestPic1.jpg", Constant.VESSEL_ATTATCHMENT_UPLOAD, "vesselSonciTestPic1.jpg");
		File file1 = new File(path1);
		if (!file1.exists()) {
			path1="";
		}
		map.put("#vesselSonciTestPic2.jpg#", path1);
		helper.toWord(templetePath, filePath, map);
		
	}

}
