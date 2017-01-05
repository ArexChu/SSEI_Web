package cn.ecust.ssei.view.action.vessel.vesselMaintain.periodical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.VesselPeriodicalBaseAction;
import cn.ecust.ssei.domain.vessel.periodical.VesselGraphiteLinerTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

@Controller
@Scope("prototype")
public class VesselGraphiteLinerTestAction  extends VesselPeriodicalBaseAction<VesselGraphiteLinerTest>{
	
	public String delete() throws Exception{
		long id = preDelete();
		vesselGraphiteLinerTestService.delete(id);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String edit() throws Exception{
		vesselGraphiteLinerTestService.update(model);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselGraphiteLinerTest vesselGraphiteLinerTest = vesselPeriodicalMaintain.getVesselGraphiteLinerTest();
		vesselGraphiteLinerTestService.generateFile(vesselGraphiteLinerTest);	
		return "toVesselPeriodicalDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselGraphiteLinerTest vesselGraphiteLinerTest = vesselPeriodicalMaintain.getVesselGraphiteLinerTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselGraphiteLinerTest.getId(), "vesselGraphiteLinerTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselGraphiteLinerTest.getId()+"_vesselGraphiteLinerTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	

}
