package cn.ecust.ssei.view.action.vessel.vesselMaintain.periodical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.VesselPeriodicalBaseAction;
import cn.ecust.ssei.domain.vessel.periodical.VesselHardTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

@Controller
@Scope("prototype")
public class VesselHardTestAction  extends VesselPeriodicalBaseAction<VesselHardTest>{
	
	public String delete() throws Exception{
		long id = preDelete();
		vesselHardTestService.delete(id);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String edit() throws Exception{
		vesselHardTestService.update(model);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselHardTest vesselHardTest = vesselPeriodicalMaintain.getVesselHardTest();
		vesselHardTestService.generateFile(vesselHardTest);	
		return "toVesselPeriodicalDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselHardTest vesselHardTest = vesselPeriodicalMaintain.getVesselHardTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselHardTest.getId(), "vesselHardTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselHardTest.getId()+"_vesselHardTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	

}
