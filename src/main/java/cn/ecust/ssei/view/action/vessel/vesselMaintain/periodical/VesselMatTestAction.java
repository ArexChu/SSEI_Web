package cn.ecust.ssei.view.action.vessel.vesselMaintain.periodical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.VesselPeriodicalBaseAction;
import cn.ecust.ssei.domain.vessel.periodical.VesselMatTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

@Controller
@Scope("prototype")
public class VesselMatTestAction  extends VesselPeriodicalBaseAction<VesselMatTest>{
	
	public String delete() throws Exception{
		long id = preDelete();
		vesselMatTestService.delete(id);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String edit() throws Exception{
		vesselMatTestService.update(model);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselMatTest vesselMatTest = vesselPeriodicalMaintain.getVesselMatTest();
		vesselMatTestService.generateFile(vesselMatTest);	
		return "toVesselPeriodicalDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselMatTest vesselMatTest = vesselPeriodicalMaintain.getVesselMatTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselMatTest.getId(), "vesselMatTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselMatTest.getId()+"_vesselMatTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	

}
