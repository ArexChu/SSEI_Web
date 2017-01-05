package cn.ecust.ssei.view.action.vessel.vesselMaintain.periodical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.VesselPeriodicalBaseAction;
import cn.ecust.ssei.domain.vessel.periodical.VesselGlassSteelTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

@Controller
@Scope("prototype")
public class VesselGlassSteelTestAction  extends VesselPeriodicalBaseAction<VesselGlassSteelTest>{
	
	public String delete() throws Exception{
		long id = preDelete();
		vesselGlassSteelTestService.delete(id);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String edit() throws Exception{
		vesselGlassSteelTestService.update(model);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselGlassSteelTest vesselGlassSteelTest = vesselPeriodicalMaintain.getVesselGlassSteelTest();
		vesselGlassSteelTestService.generateFile(vesselGlassSteelTest);	
		return "toVesselPeriodicalDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselGlassSteelTest vesselGlassSteelTest = vesselPeriodicalMaintain.getVesselGlassSteelTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselGlassSteelTest.getId(), "vesselGlassSteelTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselGlassSteelTest.getId()+"_vesselGlassSteelTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	

}
