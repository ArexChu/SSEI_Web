package cn.ecust.ssei.view.action.vessel.vesselMaintain.periodical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.VesselPeriodicalBaseAction;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.domain.vessel.periodical.VesselPermTest;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

@Controller
@Scope("prototype")
public class VesselPermTestAction  extends VesselPeriodicalBaseAction<VesselPermTest>{
	
	public String delete() throws Exception{
		long id = preDelete();
		vesselPermTestService.delete(id);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String edit() throws Exception{
		vesselPermTestService.update(model);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselPermTest vesselPermTest = vesselPeriodicalMaintain.getVesselPermTest();
		vesselPermTestService.generateFile(vesselPermTest);	
		return "toVesselPeriodicalDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselPermTest vesselPermTest = vesselPeriodicalMaintain.getVesselPermTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselPermTest.getId(), "vesselPermTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselPermTest.getId()+"_vesselPermTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	

}
