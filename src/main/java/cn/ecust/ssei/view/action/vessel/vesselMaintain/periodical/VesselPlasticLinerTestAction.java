package cn.ecust.ssei.view.action.vessel.vesselMaintain.periodical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.VesselPeriodicalBaseAction;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.domain.vessel.periodical.VesselPlasticLinerTest;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

@Controller
@Scope("prototype")
public class VesselPlasticLinerTestAction  extends VesselPeriodicalBaseAction<VesselPlasticLinerTest>{
	
	public String delete() throws Exception{
		long id = preDelete();
		vesselPlasticLinerTestService.delete(id);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String edit() throws Exception{
		vesselPlasticLinerTestService.update(model);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselPlasticLinerTest vesselPlasticLinerTest = vesselPeriodicalMaintain.getVesselPlasticLinerTest();
		vesselPlasticLinerTestService.generateFile(vesselPlasticLinerTest);	
		return "toVesselPeriodicalDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselPlasticLinerTest vesselPlasticLinerTest = vesselPeriodicalMaintain.getVesselPlasticLinerTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselPlasticLinerTest.getId(), "vesselPlasticLinerTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselPlasticLinerTest.getId()+"_vesselPlasticLinerTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	

}
