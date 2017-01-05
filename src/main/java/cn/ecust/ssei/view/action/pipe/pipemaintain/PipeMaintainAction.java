package cn.ecust.ssei.view.action.pipe.pipemaintain;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.BaseAction;
import cn.ecust.ssei.domain.Company;
import cn.ecust.ssei.domain.pipe.PipeMaintain;
import cn.ecust.ssei.util.QueryHelper;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class PipeMaintainAction  extends BaseAction<PipeMaintain>{
	private Long companyID;
	
	/** 列表 */
	public String list() throws Exception {
		List<Company> companyList = companyService.findUseCompanies();
		ActionContext.getContext().put("companyList", companyList);
		QueryHelper queryHelper = getbyCondition();
		queryHelper.preparePageBean(pipeMaintainService, pageNum, pageSize);
		return "list";
	}
	
	private QueryHelper getbyCondition() {

		String m_ID = model.getM_ID();
		String p_finished = model.getP_finished();
		String p_Equ_Name = null, p_Name=null, p_Sys=null;
		if (model.getPipeBasic()!=null) {
			p_Equ_Name = model.getPipeBasic().getP_Equ_Name();
			p_Name = model.getPipeBasic().getP_Name();
			p_Sys = model.getPipeBasic().getP_Sys();
		}
		String m_Prop = model.getM_Prop();
		QueryHelper queryHelper = new QueryHelper(PipeMaintain.class, "p").//
				addCondition(m_ID!=null && !m_ID.isEmpty(), "p.m_ID= ?", m_ID).//
				addCondition(p_finished!=null && !p_finished.isEmpty(), "p.p_finished= ?", p_finished).//
				addCondition(p_Equ_Name!=null && !p_Equ_Name.isEmpty(), "p.pipeBasic.p_Equ_Name= ?", p_Equ_Name).//
				addCondition(p_Name!=null && !p_Name.isEmpty(), "p.pipeBasic.p_Name= ?", p_Name).//
				addCondition(p_Sys!=null && !p_Sys.isEmpty(), "p.pipeBasic.p_Sys= ?", p_Sys).//
				addCondition(m_Prop!=null && !m_Prop.isEmpty(), "p.m_Prop= ?", m_Prop).//
				addCondition(companyID!=null,  "p.pipeBasic.company.id = ?", companyID);
		queryHelper.addOrderProperty("p.p_finished", true);
		queryHelper.addOrderProperty("p.id", false);
		return queryHelper;
	}
	
	
	public String updateStatus() throws Exception {
		PipeMaintain pipeMaintain = pipeMaintainService.getById(model.getId());
		pipeMaintain.setP_finished("2");
		pipeMaintainService.update(pipeMaintain);
		return "toList";
	}
	
	public String delete() throws Exception {
		pipeMaintainService.delete(model.getId());
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
