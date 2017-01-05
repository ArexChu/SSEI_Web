package cn.ecust.ssei.view.action.vessel.vesselMaintain.periodical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.VesselPeriodicalBaseAction;
import cn.ecust.ssei.domain.vessel.periodical.VesselGraphiteTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

@Controller
@Scope("prototype")
public class VesselGraphiteTestAction  extends VesselPeriodicalBaseAction<VesselGraphiteTest>{
	
	public String delete() throws Exception{
		long id = preDelete();
		vesselGraphiteTestService.delete(id);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String edit() throws Exception{
		vesselGraphiteTestService.update(model);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselGraphiteTest vesselGraphiteTest = vesselPeriodicalMaintain.getVesselGraphiteTest();
		vesselGraphiteTestService.generateFile(vesselGraphiteTest);	
		return "toVesselPeriodicalDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselGraphiteTest vesselGraphiteTest = vesselPeriodicalMaintain.getVesselGraphiteTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselGraphiteTest.getId(), "vesselGraphiteTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselGraphiteTest.getId()+"_vesselGraphiteTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	

}
