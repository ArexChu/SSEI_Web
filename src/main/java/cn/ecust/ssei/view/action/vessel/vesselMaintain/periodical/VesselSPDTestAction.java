package cn.ecust.ssei.view.action.vessel.vesselMaintain.periodical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.VesselPeriodicalBaseAction;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.domain.vessel.periodical.VesselSPDTest;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

@Controller
@Scope("prototype")
public class VesselSPDTestAction  extends VesselPeriodicalBaseAction<VesselSPDTest>{
	
	public String delete() throws Exception{
		long id = preDelete();
		vesselSPDTestService.delete(id);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String edit() throws Exception{
		vesselSPDTestService.update(model);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselSPDTest vesselSPDTest = vesselPeriodicalMaintain.getVesselSPDTest();
		vesselSPDTestService.generateFile(vesselSPDTest);	
		return "toVesselPeriodicalDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselSPDTest vesselSPDTest = vesselPeriodicalMaintain.getVesselSPDTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselSPDTest.getId(), "vesselSPDTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselSPDTest.getId()+"_vesselSPDTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	

}
