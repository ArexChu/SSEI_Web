package cn.ecust.ssei.view.action.vessel.vesselMaintain.periodical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.VesselPeriodicalBaseAction;
import cn.ecust.ssei.domain.vessel.periodical.VesselAmmoniaTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

@Controller
@Scope("prototype")
public class VesselAmmoniaTestAction  extends VesselPeriodicalBaseAction<VesselAmmoniaTest>{
	
	public String delete() throws Exception{
		long id = preDelete();
		vesselAmmoniaTestService.delete(id);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String edit() throws Exception{
		vesselAmmoniaTestService.update(model);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselAmmoniaTest vesselAmmoniaTest = vesselPeriodicalMaintain.getVesselAmmoniaTest();
		vesselAmmoniaTestService.generateFile(vesselAmmoniaTest);	
		return "toVesselPeriodicalDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselAmmoniaTest vesselAmmoniaTest = vesselPeriodicalMaintain.getVesselAmmoniaTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselAmmoniaTest.getId(), "vesselAmmoniaTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselAmmoniaTest.getId()+"_vesselAmmoniaTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	

}
