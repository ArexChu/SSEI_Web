package cn.ecust.ssei.view.action.vessel.vesselMaintain.periodical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.VesselPeriodicalBaseAction;
import cn.ecust.ssei.domain.vessel.periodical.VesselGlassTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

@Controller
@Scope("prototype")
public class VesselGlassTestAction  extends VesselPeriodicalBaseAction<VesselGlassTest>{
	
	public String delete() throws Exception{
		long id = preDelete();
		vesselGlassTestService.delete(id);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String edit() throws Exception{
		vesselGlassTestService.update(model);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselGlassTest vesselGlassTest = vesselPeriodicalMaintain.getVesselGlassTest();
		vesselGlassTestService.generateFile(vesselGlassTest);	
		return "toVesselPeriodicalDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselGlassTest vesselGlassTest = vesselPeriodicalMaintain.getVesselGlassTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselGlassTest.getId(), "vesselGlassTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselGlassTest.getId()+"_vesselGlassTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	

}
