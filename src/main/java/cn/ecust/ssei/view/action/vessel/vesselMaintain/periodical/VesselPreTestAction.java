package cn.ecust.ssei.view.action.vessel.vesselMaintain.periodical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.VesselPeriodicalBaseAction;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.domain.vessel.periodical.VesselPreTest;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

@Controller
@Scope("prototype")
public class VesselPreTestAction  extends VesselPeriodicalBaseAction<VesselPreTest>{
	
	public String delete() throws Exception{
		long id = preDelete();
		vesselPreTestService.delete(id);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String edit() throws Exception{
		vesselPreTestService.update(model);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselPreTest vesselPreTest = vesselPeriodicalMaintain.getVesselPreTest();
		vesselPreTestService.generateFile(vesselPreTest);	
		return "toVesselPeriodicalDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselPreTest vesselPreTest = vesselPeriodicalMaintain.getVesselPreTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselPreTest.getId(), "vesselPreTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselPreTest.getId()+"_vesselPreTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	

}
