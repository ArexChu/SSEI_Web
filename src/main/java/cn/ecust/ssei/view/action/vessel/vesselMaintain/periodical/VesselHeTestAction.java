package cn.ecust.ssei.view.action.vessel.vesselMaintain.periodical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.VesselPeriodicalBaseAction;
import cn.ecust.ssei.domain.vessel.periodical.VesselHeTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

@Controller
@Scope("prototype")
public class VesselHeTestAction  extends VesselPeriodicalBaseAction<VesselHeTest>{
	
	public String delete() throws Exception{
		long id = preDelete();
		vesselHeTestService.delete(id);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String edit() throws Exception{
		vesselHeTestService.update(model);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselHeTest vesselHeTest = vesselPeriodicalMaintain.getVesselHeTest();
		vesselHeTestService.generateFile(vesselHeTest);	
		return "toVesselPeriodicalDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselHeTest vesselHeTest = vesselPeriodicalMaintain.getVesselHeTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselHeTest.getId(), "vesselHeTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselHeTest.getId()+"_vesselHeTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	

}
