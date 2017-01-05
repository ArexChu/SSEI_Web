package cn.ecust.ssei.view.action.vessel.vesselMaintain.periodical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.VesselPeriodicalBaseAction;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.domain.vessel.periodical.VesselTOFDTest;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

@Controller
@Scope("prototype")
public class VesselTOFDTestAction  extends VesselPeriodicalBaseAction<VesselTOFDTest>{
	
	public String delete() throws Exception{
		long id = preDelete();
		vesselTOFDTestService.delete(id);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String edit() throws Exception{
		vesselTOFDTestService.update(model);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselTOFDTest vesselTOFDTest = vesselPeriodicalMaintain.getVesselTOFDTest();
		vesselTOFDTestService.generateFile(vesselTOFDTest);	
		return "toVesselPeriodicalDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselTOFDTest vesselTOFDTest = vesselPeriodicalMaintain.getVesselTOFDTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselTOFDTest.getId(), "vesselTOFDTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselTOFDTest.getId()+"_vesselTOFDTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	

}
