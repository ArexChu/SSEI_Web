package cn.ecust.ssei.view.action.vessel.vesselMaintain.periodical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.VesselPeriodicalBaseAction;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.domain.vessel.periodical.VesselSonciTest;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

@Controller
@Scope("prototype")
public class VesselSonciTestAction  extends VesselPeriodicalBaseAction<VesselSonciTest>{
	
	public String delete() throws Exception{
		long id = preDelete();
		vesselSonciTestService.delete(id);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String edit() throws Exception{
		vesselSonciTestService.update(model);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselSonciTest vesselSonciTest = vesselPeriodicalMaintain.getVesselSonciTest();
		vesselSonciTestService.generateFile(vesselSonciTest);	
		return "toVesselPeriodicalDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselSonciTest vesselSonciTest = vesselPeriodicalMaintain.getVesselSonciTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselSonciTest.getId(), "vesselSonciTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselSonciTest.getId()+"_vesselSonciTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	

}
