package cn.ecust.ssei.service.impl.vessel.periodical;

import java.io.File;
import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.periodical.VesselMicroTest;
import cn.ecust.ssei.service.vessel.periodical.VesselMicroTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class VesselMicroTestServiceImpl  extends DaoSupportImpl<VesselMicroTest> implements VesselMicroTestService {

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselMicroTest vesselMicroTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselMicroTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselMicroTest.getId(), "vesselMicroTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselMicroTest.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(vesselMicroTest);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselMicroTest.getVesselPeriodicalMaintain().getVesselMaintain());
		map.putAll(map1);

		/**
		 * 处理图片
		 */
		String path = MyFileUtils.getFilePathWithName(vesselMicroTest.getVesselPeriodicalMaintain().getId(), "vesselMicroTestPic.jpg", Constant.VESSEL_ATTATCHMENT_UPLOAD, "vesselPermTestPic.jpg");
		File file = new File(path);
		if (!file.exists()) {
			path="";
		}
		map.put("#vesselPermTestPic.jpg#", path);
		helper.toWord(templetePath, filePath, map);
	}

}
