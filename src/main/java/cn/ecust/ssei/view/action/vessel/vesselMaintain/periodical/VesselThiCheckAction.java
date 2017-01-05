package cn.ecust.ssei.view.action.vessel.vesselMaintain.periodical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.VesselPeriodicalBaseAction;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.domain.vessel.periodical.VesselThiCheck;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

@Controller
@Scope("prototype")
public class VesselThiCheckAction  extends VesselPeriodicalBaseAction<VesselThiCheck>{
	
	public String delete() throws Exception{
		long id = preDelete();
		vesselThiCheckService.delete(id);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String edit() throws Exception{
		vesselThiCheckService.update(model);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselThiCheck vesselThiCheck = vesselPeriodicalMaintain.getVesselThiCheck();
		vesselThiCheckService.generateFile(vesselThiCheck);	
		return "toVesselPeriodicalDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselThiCheck vesselThiCheck = vesselPeriodicalMaintain.getVesselThiCheck();
		String fileRootpath = MyFileUtils.getFilePath(vesselThiCheck.getId(), "vesselThiCheck", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselThiCheck.getId()+"_vesselThiCheck.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	

}
