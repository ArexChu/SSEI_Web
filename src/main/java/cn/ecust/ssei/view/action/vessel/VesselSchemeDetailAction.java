package cn.ecust.ssei.view.action.vessel;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.BaseAction;
import cn.ecust.ssei.domain.Company;
import cn.ecust.ssei.domain.vessel.VesselBasic;
import cn.ecust.ssei.domain.vessel.VesselMaintain;
import cn.ecust.ssei.domain.vessel.annual.VesselAnnualMaintain;
import cn.ecust.ssei.domain.vessel.check.VesselCheckMaintain;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.util.QueryHelper;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class VesselSchemeDetailAction extends BaseAction<VesselMaintain> {
	
	private long basicId;
	private Long companyId;
	
	
	public String listRecord() throws Exception {
		new QueryHelper(VesselMaintain.class, "v").//
		addCondition("v.vesselBasic.id=?", basicId).//
		addCondition(model.getV_M_Mode()!=null && !model.getV_M_Mode().isEmpty(), "v_M_Mode=?", model.getV_M_Mode()).
		addOrderProperty("v.v_M_Date", false).//
		preparePageBean(vesselMaintainService, pageNum, pageSize);
		return "listRecord";
	}
	
	
	public String listProblem() throws Exception {
		new QueryHelper(VesselMaintain.class, "v").//
		addCondition("v.vesselBasic.id=?", basicId).//
		addCondition(model.getV_M_Mode()!=null && !model.getV_M_Mode().isEmpty(), "v_M_Mode=?", model.getV_M_Mode()).
		addOrderProperty("v.v_M_Date", false).//
		preparePageBean(vesselMaintainService, pageNum, pageSize);
		return "listProblem";
	}
	
	public String listDetail() throws Exception {
		List<Company> companyList;
		if (isSSEIUser()||isDeUser()) {
			companyList = companyService.findUseCompanies();
		}else {
			companyList = companyService.findByPrivilege(getCurrentUser());
		}
		ActionContext.getContext().put("companyList", companyList);
		
		VesselBasic vesselBasic = model.getVesselBasic();
		if (vesselBasic==null) {
			vesselBasic=new VesselBasic();
		}
		
		String v_Product_ID = vesselBasic.getV_Product_ID();
		String v_Name = vesselBasic.getV_Name();
		
		QueryHelper queryHelper = new QueryHelper(VesselBasic.class, "v").
		addCondition(v_Product_ID!=null && !v_Product_ID.isEmpty(), "v.v_Product_ID = ?", v_Product_ID).
		addCondition(v_Name!=null && !v_Name.isEmpty(), "v.v_Name = ?", v_Name).
		addCondition(companyId!=null,  "v.v_Use_Com.id = ?", companyId);
		if (isSSEIUser()) {
		}else {
			if (isDeUser()) {//设计单位
				queryHelper.addCondition("v.v_De_Com.id=?", getCurrentUser().getCompany().getId());
			}
			if (isHoldUser()) {
				queryHelper.addCondition("v.v_Use_Com.id=?", getCurrentUser().getCompany().getId());
			}
		}
		queryHelper.addOrderProperty("v.id", false);//新添加的在前
		queryHelper.preparePageBean(vesselBasicService, pageNum, pageSize);
		return "listDetail";
	}
	
	
	/** 添加页面 */
	public String addUI() throws Exception {
		return "saveUI";
	}

	/** 添加 */
	public String add() throws Exception {
		VesselBasic vesselBasic = vesselBasicService.getById(basicId);
		model.setVesselBasic(vesselBasic);
		model.setV_finished("1");//设置为未完成
		if (model.getV_M_Mode().equals("验收")) {
			model.setVesselCheckMaintain(new VesselCheckMaintain());
		}else if (model.getV_M_Mode().equals("年度")) {
			model.setVesselAnnualMaintain(new VesselAnnualMaintain());
		}else {
			model.setVesselPeriodicalMaintain(new VesselPeriodicalMaintain());
		}
		vesselMaintainService.save(model);
		return "toList";
	}

	/** 修改页面 */
	public String editUI() throws Exception {
		VesselMaintain vesselMaintain = vesselMaintainService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(vesselMaintain);
		return "saveUI";
	}

	/** 修改 */
	public String edit() throws Exception {

		return "toList";
	}
	
	/** 删除 */
	public String delete() throws Exception {
		vesselMaintainService.delete(model.getId());
		return "toListRecord";
	}
	
	/**
	 * @return the basicId
	 */
	public long getBasicId() {
		return basicId;
	}

	/**
	 * @param basicId the basicId to set
	 */
	public void setBasicId(long basicId) {
		this.basicId = basicId;
	}


	/**
	 * @return the companyId
	 */
	public Long getCompanyId() {
		return companyId;
	}


	/**
	 * @param companyId the companyId to set
	 */
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	
	
	
}
