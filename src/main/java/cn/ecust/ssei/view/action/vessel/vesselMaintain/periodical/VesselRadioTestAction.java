package cn.ecust.ssei.view.action.vessel.vesselMaintain.periodical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.VesselPeriodicalBaseAction;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.domain.vessel.periodical.VesselRadioTest;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

@Controller
@Scope("prototype")
public class VesselRadioTestAction  extends VesselPeriodicalBaseAction<VesselRadioTest>{
	
	public String delete() throws Exception{
		long id = preDelete();
		vesselRadioTestService.delete(id);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String edit() throws Exception{
		vesselRadioTestService.update(model);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselRadioTest vesselRadioTest = vesselPeriodicalMaintain.getVesselRadioTest();
		vesselRadioTestService.generateFile(vesselRadioTest);	
		return "toVesselPeriodicalDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselRadioTest vesselRadioTest = vesselPeriodicalMaintain.getVesselRadioTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselRadioTest.getId(), "vesselRadioTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselRadioTest.getId()+"_vesselRadioTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	

}
