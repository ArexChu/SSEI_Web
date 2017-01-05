package cn.ecust.ssei.view.action.vessel.vesselMaintain.periodical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.VesselPeriodicalBaseAction;
import cn.ecust.ssei.domain.vessel.periodical.VesselAddTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

@Controller
@Scope("prototype")
public class VesselAddTestAction  extends VesselPeriodicalBaseAction<VesselAddTest>{
	
	public String delete() throws Exception{
		long id = preDelete();
		vesselAddTestService.delete(id);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String edit() throws Exception{
		vesselAddTestService.update(model);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselAddTest vesselAddTest = vesselPeriodicalMaintain.getVesselAddTest();
		vesselAddTestService.generateFile(vesselAddTest);	
		return "toVesselPeriodicalDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselAddTest vesselAddTest = vesselPeriodicalMaintain.getVesselAddTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselAddTest.getId(), "vesselAddTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselAddTest.getId()+"_vesselAddTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	

}
