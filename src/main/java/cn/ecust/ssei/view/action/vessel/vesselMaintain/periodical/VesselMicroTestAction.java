package cn.ecust.ssei.view.action.vessel.vesselMaintain.periodical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.VesselPeriodicalBaseAction;
import cn.ecust.ssei.domain.vessel.periodical.VesselMicroTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

@Controller
@Scope("prototype")
public class VesselMicroTestAction  extends VesselPeriodicalBaseAction<VesselMicroTest>{
	
	public String delete() throws Exception{
		long id = preDelete();
		vesselMicroTestService.delete(id);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String edit() throws Exception{
		vesselMicroTestService.update(model);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselMicroTest vesselMicroTest = vesselPeriodicalMaintain.getVesselMicroTest();
		vesselMicroTestService.generateFile(vesselMicroTest);	
		return "toVesselPeriodicalDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselMicroTest vesselMicroTest = vesselPeriodicalMaintain.getVesselMicroTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselMicroTest.getId(), "vesselMicroTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselMicroTest.getId()+"_vesselMicroTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	

}
