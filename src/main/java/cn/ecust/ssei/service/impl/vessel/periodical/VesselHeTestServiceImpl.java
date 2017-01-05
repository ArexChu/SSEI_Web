package cn.ecust.ssei.service.impl.vessel.periodical;

import java.io.File;
import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.periodical.VesselHeTest;
import cn.ecust.ssei.service.vessel.periodical.VesselHeTestService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class VesselHeTestServiceImpl  extends DaoSupportImpl<VesselHeTest> implements VesselHeTestService{

	@SuppressWarnings("unchecked")
	@Override
	public void generateFile(VesselHeTest vesselHeTest) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselHeTest.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselHeTest.getId(), "vesselHeTest", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselHeTest.doc");
		
		JacobHelper helper = new JacobHelper();

		HashMap<String, String> map= BeanUtils.beanToMap(vesselHeTest);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselHeTest.getVesselPeriodicalMaintain().getVesselMaintain());
		map.putAll(map1);
		/**
		 * 处理图片
		 */
		String path = MyFileUtils.getFilePathWithName(vesselHeTest.getVesselPeriodicalMaintain().getId(), "vesselHeTestPic.jpg", Constant.VESSEL_ATTATCHMENT_UPLOAD, "vesselHeTestPic.jpg");
		File file = new File(path);
		if (!file.exists()) {
			path="";
		}
		map.put("#vesselHeTestPic.jpg#", path);
		helper.toWord(templetePath, filePath, map);
		
	}

}
