package cn.ecust.ssei.service.impl.vessel.periodical;

import java.io.File;
import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.periodical.VesselAmmoniaTest;
import cn.ecust.ssei.service.vessel.periodical.VesselAmmoniaTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class VesselAmmoniaTestServiceImpl extends DaoSupportImpl<VesselAmmoniaTest> implements VesselAmmoniaTestService{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselAmmoniaTest vesselAmmoniaTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselAmmoniaTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselAmmoniaTest.getId(), "vesselAmmoniaTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselAmmoniaTest.doc");
		
		JacobHelper helper = new JacobHelper();

		HashMap<String, String> map= BeanUtils.beanToMap(vesselAmmoniaTest);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselAmmoniaTest.getVesselPeriodicalMaintain().getVesselMaintain());
		map.putAll(map1);
		/**
		 * 处理图片
		 */
		String path = MyFileUtils.getFilePathWithName(vesselAmmoniaTest.getVesselPeriodicalMaintain().getId(), "vesselAmmoniaTestPic.jpg", Constant.VESSEL_ATTATCHMENT_UPLOAD, "vesselAmmoniaTestPic.jpg");
		File file = new File(path);
		if (!file.exists()) {
			path="";
		}
		map.put("#vesselAmmoniaTestPic.jpg#", path);
		helper.toWord(templetePath, filePath, map);
		
	}


}
