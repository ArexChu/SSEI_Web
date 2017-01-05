package cn.ecust.ssei.service.impl.vessel.periodical;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.periodical.VesselThiCheck;
import cn.ecust.ssei.service.vessel.periodical.VesselThiCheckService;
import cn.ecust.ssei.util.BeanUtils;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobHelper;
@Service
@Transactional
public class VesselThiCheckServiceImpl  extends DaoSupportImpl<VesselThiCheck> implements VesselThiCheckService{

	@Override
	@SuppressWarnings("unchecked")
	public void generateFile(VesselThiCheck vesselThiCheck) {
		String templetePath = MyFileUtils.getTempletePathWithName(2,"vesselThiCheck.doc");	
		String filePath = MyFileUtils.getFilePathWithName(vesselThiCheck.getId(), "vesselThiCheck", Constant.VESSEL_DOCUMENT_UPLOAD, "vesselThiCheck.doc");
		JacobHelper helper = new JacobHelper();
		HashMap<String, String> map= BeanUtils.beanToMap(vesselThiCheck);
		HashMap<String, String> map1= BeanUtils.beanToMap(vesselThiCheck.getVesselPeriodicalMaintain().getVesselMaintain());
		map.putAll(map1);
		helper.toWord(templetePath, filePath, map);
		
	}

}
