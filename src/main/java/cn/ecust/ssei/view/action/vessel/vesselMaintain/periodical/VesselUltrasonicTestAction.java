package cn.ecust.ssei.view.action.vessel.vesselMaintain.periodical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.VesselPeriodicalBaseAction;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.domain.vessel.periodical.VesselUltrasonicTest;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

@Controller
@Scope("prototype")
public class VesselUltrasonicTestAction  extends VesselPeriodicalBaseAction<VesselUltrasonicTest>{
	
	public String delete() throws Exception{
		long id = preDelete();
		vesselUltrasonicTestService.delete(id);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String edit() throws Exception{
		vesselUltrasonicTestService.update(model);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselUltrasonicTest vesselUltrasonicTest = vesselPeriodicalMaintain.getVesselUltrasonicTest();
		vesselUltrasonicTestService.generateFile(vesselUltrasonicTest);	
		return "toVesselPeriodicalDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselUltrasonicTest vesselUltrasonicTest = vesselPeriodicalMaintain.getVesselUltrasonicTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselUltrasonicTest.getId(), "vesselUltrasonicTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselUltrasonicTest.getId()+"_vesselUltrasonicTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	

}
