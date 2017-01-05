package cn.ecust.ssei.view.action.vessel.vesselMaintain.periodical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.VesselPeriodicalBaseAction;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.domain.vessel.periodical.VesselPlasticTest;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

@Controller
@Scope("prototype")
public class VesselPlasticTestAction  extends VesselPeriodicalBaseAction<VesselPlasticTest>{
	
	public String delete() throws Exception{
		long id = preDelete();
		vesselPlasticTestService.delete(id);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String edit() throws Exception{
		vesselPlasticTestService.update(model);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselPlasticTest vesselPlasticTest = vesselPeriodicalMaintain.getVesselPlasticTest();
		vesselPlasticTestService.generateFile(vesselPlasticTest);	
		return "toVesselPeriodicalDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselPlasticTest vesselPlasticTest = vesselPeriodicalMaintain.getVesselPlasticTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselPlasticTest.getId(), "vesselPlasticTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselPlasticTest.getId()+"_vesselPlasticTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	

}
