package cn.ecust.ssei.view.action.vessel.vesselMaintain.periodical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.VesselPeriodicalBaseAction;
import cn.ecust.ssei.domain.vessel.VesselBasic;
import cn.ecust.ssei.domain.vessel.VesselMaintain;
import cn.ecust.ssei.domain.vessel.periodical.VesselConclusionTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class VesselConclusionTestAction  extends VesselPeriodicalBaseAction<VesselConclusionTest>{
	
	private String v_M_Next_Date;
	private String v_M_Bas_Prob;
	
	public String delete() throws Exception{
		long id = preDelete();
		vesselConclusionTestService.delete(id);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String editUI() throws Exception {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselConclusionTest vesselConclusionTest = vesselPeriodicalMaintain.getVesselConclusionTest();
		ActionContext.getContext().getValueStack().push(vesselConclusionTest);
		v_M_Bas_Prob=vesselPeriodicalMaintain.getVesselMaintain().getV_M_Bas_Prob();
		v_M_Next_Date=vesselPeriodicalMaintain.getVesselMaintain().getVesselBasic().getV_M_Next_Date();
		return "saveUI";
		
	}
	
	public String edit() throws Exception{
		VesselConclusionTest vesselConclusionTest = vesselConclusionTestService.getById(model.getId());
		vesselConclusionTest.setV_M_Type(model.getV_M_Type());
		vesselConclusionTest.setV_M_Sta(model.getV_M_Sta());
		vesselConclusionTest.setV_M_Basic(model.getV_M_Basic());
		vesselConclusionTest.setV_M_Explain(model.getV_M_Explain());
		vesselConclusionTest.setV_M_Test_Date(model.getV_M_Test_Date());
		vesselConclusionTest.setV_M_Check_Date(model.getV_M_Check_Date());
		vesselConclusionTest.setV_M_check_Prob(model.getV_M_check_Prob());
		vesselConclusionTest.setV_M_Prob(model.getV_M_Prob());
		vesselConclusionTest.setV_M_Condition(model.getV_M_Condition());
		vesselConclusionTest.setV_M_Conclusion(model.getV_M_Conclusion());
		vesselConclusionTest.setV_M_Level(model.getV_M_Level());
		vesselConclusionTest.setV_M_Pre(model.getV_M_Pre());
		vesselConclusionTest.setV_M_Tem(model.getV_M_Tem());
		vesselConclusionTest.setV_M_Med(model.getV_M_Med());
		vesselConclusionTest.setV_M_Other(model.getV_M_Other());
		VesselMaintain vesselMaintain=vesselConclusionTest.getVesselPeriodicalMaintain().getVesselMaintain();
		vesselMaintain.setV_M_Bas_Prob(v_M_Bas_Prob);
		VesselBasic vesselBasic = vesselMaintain.getVesselBasic();
		vesselBasic.setV_M_Next_Date(v_M_Next_Date);
		vesselConclusionTestService.update(vesselConclusionTest);
		return "toVesselPeriodicalMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselConclusionTest vesselConclusionTest = vesselPeriodicalMaintain.getVesselConclusionTest();
		vesselConclusionTestService.generateFile(vesselConclusionTest);	
		return "toVesselPeriodicalDocumentMenuList";
	}
	@Override
	public String makeSurePath() {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselPeriodicalMaintainService.getById(periodicalId);
		VesselConclusionTest vesselConclusionTest = vesselPeriodicalMaintain.getVesselConclusionTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselConclusionTest.getId(), "vesselConclusionTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselConclusionTest.getId()+"_vesselConclusionTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}

	/**
	 * @return the v_M_Next_Date
	 */
	public String getV_M_Next_Date() {
		return v_M_Next_Date;
	}

	/**
	 * @param v_M_Next_Date the v_M_Next_Date to set
	 */
	public void setV_M_Next_Date(String v_M_Next_Date) {
		this.v_M_Next_Date = v_M_Next_Date;
	}

	/**
	 * @return the v_M_Bas_Prob
	 */
	public String getV_M_Bas_Prob() {
		return v_M_Bas_Prob;
	}

	/**
	 * @param v_M_Bas_Prob the v_M_Bas_Prob to set
	 */
	public void setV_M_Bas_Prob(String v_M_Bas_Prob) {
		this.v_M_Bas_Prob = v_M_Bas_Prob;
	}

}
