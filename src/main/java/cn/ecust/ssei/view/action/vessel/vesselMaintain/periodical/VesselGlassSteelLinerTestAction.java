package cn.ecust.ssei.view.action.vessel.vesselMaintain.periodical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.VesselPeriodicalBaseAction;
import cn.ecust.ssei.domain.vessel.periodical.VesselGlassSteelLinerTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

@Controller
@Scope("prototype")
public class VesselGlassSteelLinerTestAction  extends VesselPeriodicalBaseAction<VesselGlassSteelLinerTest>{
	
	public String delete() throws Exception{
		long id = preDelete();
		vesselGlassSteelLinerTestService.delete(id);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String edit() throws Exception{
		vesselGlassSteelLinerTestService.update(model);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselGlassSteelLinerTest vesselGlassSteelLinerTest = vesselPeriodicalMaintain.getVesselGlassSteelLinerTest();
		vesselGlassSteelLinerTestService.generateFile(vesselGlassSteelLinerTest);	
		return "toVesselPeriodicalDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselGlassSteelLinerTest vesselGlassSteelLinerTest = vesselPeriodicalMaintain.getVesselGlassSteelLinerTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselGlassSteelLinerTest.getId(), "vesselGlassSteelLinerTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselGlassSteelLinerTest.getId()+"_vesselGlassSteelLinerTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	

}
