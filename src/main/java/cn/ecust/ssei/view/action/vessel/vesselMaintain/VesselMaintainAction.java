package cn.ecust.ssei.view.action.vessel.vesselMaintain;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.BaseAction;
import cn.ecust.ssei.domain.Company;
import cn.ecust.ssei.domain.vessel.VesselMaintain;
import cn.ecust.ssei.util.QueryHelper;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class VesselMaintainAction  extends BaseAction<VesselMaintain>{
	
	private Long companyID;
	
	/** 列表 */
	public String list() throws Exception {
		List<Company> companyList = companyService.findUseCompanies();
		ActionContext.getContext().put("companyList", companyList);
		QueryHelper queryHelper = getbyCondition();
		queryHelper.preparePageBean(vesselMaintainService, pageNum, pageSize);
		return "list";
	}
	
	private QueryHelper getbyCondition() {

		String v_M_Massion_ID = model.getV_M_Massion_ID();
		String v_finished = model.getV_finished();
		String v_M_Mode = model.getV_M_Mode();
		String v_Product_ID = null, v_Name=null;
		if (model.getVesselBasic()!=null) {
			v_Product_ID = model.getVesselBasic().getV_Product_ID();
			v_Name = model.getVesselBasic().getV_Name();
		}
		QueryHelper queryHelper = new QueryHelper(VesselMaintain.class, "v").//
				addCondition(v_M_Massion_ID!=null && !v_M_Massion_ID.isEmpty(), "v.v_M_Massion_ID= ?", v_M_Massion_ID).//
				addCondition(v_finished!=null && !v_finished.isEmpty(), "v.v_finished= ?", v_finished).//
				addCondition(v_M_Mode!=null && !v_M_Mode.isEmpty(), "v.v_M_Mode= ?", v_M_Mode).//
				addCondition(v_Product_ID!=null && !v_Product_ID.isEmpty(), "v.vesselBasic.v_Product_ID= ?", v_Product_ID).//
				addCondition(v_Name!=null && !v_Name.isEmpty(), "v.vesselBasic.v_Name= ?", v_Name).//
				addCondition(companyID!=null,  "v.vesselBasic.v_Use_Com.id = ?", companyID);
		queryHelper.addOrderProperty("v_finished", true);
		queryHelper.addOrderProperty("v.id", false);
		return queryHelper;
	}
	
	public String delete() throws Exception {
		vesselMaintainService.delete(model.getId());
		return "toList";
	}
	
	public String updateStatus() throws Exception {
		VesselMaintain vesselMaintain = vesselMaintainService.getById(model.getId());
		vesselMaintain.setV_finished("2");
		vesselMaintainService.update(vesselMaintain);
		return "toList";
	}
	
	
	/**
	 * @return the companyID
	 */
	public Long getCompanyID() {
		return companyID;
	}

	/**
	 * @param companyID the companyID to set
	 */
	public void setCompanyID(Long companyID) {
		this.companyID = companyID;
	}
	
	
	
	
}
