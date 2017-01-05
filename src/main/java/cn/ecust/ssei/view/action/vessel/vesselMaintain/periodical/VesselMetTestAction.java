package cn.ecust.ssei.view.action.vessel.vesselMaintain.periodical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.VesselPeriodicalBaseAction;
import cn.ecust.ssei.domain.vessel.periodical.VesselMetTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

@Controller
@Scope("prototype")
public class VesselMetTestAction  extends VesselPeriodicalBaseAction<VesselMetTest>{
	
	public String delete() throws Exception{
		long id = preDelete();
		vesselMetTestService.delete(id);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String edit() throws Exception{
		vesselMetTestService.update(model);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselMetTest vesselMetTest = vesselPeriodicalMaintain.getVesselMetTest();
		vesselMetTestService.generateFile(vesselMetTest);	
		return "toVesselPeriodicalDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselMetTest vesselMetTest = vesselPeriodicalMaintain.getVesselMetTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselMetTest.getId(), "vesselMetTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselMetTest.getId()+"_vesselMetTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	

}
