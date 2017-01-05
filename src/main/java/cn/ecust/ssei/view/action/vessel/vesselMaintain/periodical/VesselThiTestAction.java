package cn.ecust.ssei.view.action.vessel.vesselMaintain.periodical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.VesselPeriodicalBaseAction;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.domain.vessel.periodical.VesselThiTest;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

@Controller
@Scope("prototype")
public class VesselThiTestAction  extends VesselPeriodicalBaseAction<VesselThiTest>{
	
	public String delete() throws Exception{
		long id = preDelete();
		vesselThiTestService.delete(id);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String edit() throws Exception{
		vesselThiTestService.update(model);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselThiTest vesselThiTest = vesselPeriodicalMaintain.getVesselThiTest();
		vesselThiTestService.generateFile(vesselThiTest);	
		return "toVesselPeriodicalDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselThiTest vesselThiTest = vesselPeriodicalMaintain.getVesselThiTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselThiTest.getId(), "vesselThiTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselThiTest.getId()+"_vesselThiTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	

}
