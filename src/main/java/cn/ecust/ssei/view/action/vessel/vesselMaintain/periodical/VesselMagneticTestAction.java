package cn.ecust.ssei.view.action.vessel.vesselMaintain.periodical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.VesselPeriodicalBaseAction;
import cn.ecust.ssei.domain.vessel.periodical.VesselMagneticTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

@Controller
@Scope("prototype")
public class VesselMagneticTestAction  extends VesselPeriodicalBaseAction<VesselMagneticTest>{
	
	public String delete() throws Exception{
		long id = preDelete();
		vesselMagneticTestService.delete(id);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String edit() throws Exception{
		vesselMagneticTestService.update(model);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselMagneticTest vesselMagneticTest = vesselPeriodicalMaintain.getVesselMagneticTest();
		vesselMagneticTestService.generateFile(vesselMagneticTest);	
		return "toVesselPeriodicalDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselMagneticTest vesselMagneticTest = vesselPeriodicalMaintain.getVesselMagneticTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselMagneticTest.getId(), "vesselMagneticTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselMagneticTest.getId()+"_vesselMagneticTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	

}
