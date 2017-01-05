package cn.ecust.ssei.view.action.pipe.pipescheme;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import cn.ecust.ssei.base.BaseAction;
import cn.ecust.ssei.domain.Company;
import cn.ecust.ssei.domain.pipe.PipeBasic;
import cn.ecust.ssei.util.QueryHelper;

@Controller
@Scope("prototype")
public class PipeSchemeAction extends BaseAction<PipeBasic> {
	
	private Long companyID;
	
	/** 列表 */
	public String list() throws Exception {
		/**
		 * 1: 满足列表条件
		 * 2：设计单位只能查看设计的管道基础信息,提交和未提交的都可以，不过在显示的时候要注意
		 * 3：使用单位只能看被设计单位提交的信息
		 * 4：设计单位和使用单位只能查看自己使用的。
		 */
		List<Company> companyList;
		if (isSSEIUser()||isDeUser()) {
			companyList = companyService.findUseCompanies();
		}else {
			companyList = companyService.findByPrivilege(getCurrentUser());
		}
		ActionContext.getContext().put("companyList", companyList);
		QueryHelper queryHelper = getByCondition();
		queryHelper.preparePageBean(pipeBasciService, pageNum, pageSize);
		return "list";
	}

	private QueryHelper getByCondition() {
		QueryHelper queryHelper = new QueryHelper(PipeBasic.class, "p").
		addCondition(companyID!=null,  "p.company.id = ?", companyID).
		addCondition(model.getP_Sys()!=null && !model.getP_Sys().isEmpty(),  "p.p_Sys = ?",  model.getP_Sys()).
		addCondition(model.getP_Equ_Name()!=null && !model.getP_Equ_Name().isEmpty(),  "p.p_Equ_Name = ?",  model.getP_Equ_Name()).
		addCondition("p.p_checkType = ?",  "2");//管道系统为单位
		if (isSSEIUser()) {
		}else {
			if (isDeUser()) {//设计单位
				queryHelper.addCondition("p.p_De_Com=?", getCurrentUser().getCompany().getName());
			}
			if (isHoldUser()) {
				queryHelper.addCondition("p.p_submited=?", "2").addCondition("p.company.id=?", getCurrentUser().getCompany().getId());
			}
		}
		queryHelper.addOrderProperty("p.p_submited", true).addOrderProperty("p.id", false);//未提交的在前，提交的在后，新添加的在前
		return queryHelper;
	}
	
	public String listDetail() throws Exception {
		/**
		 * 1: 满足列表条件
		 * 2：设计单位只能查看设计的管道基础信息,提交和未提交的都可以，不过在显示的时候要注意
		 * 3：使用单位只能看被设计单位提交的信息
		 * 4：设计单位和使用单位只能查看自己使用的。
		 */
		List<Company> companyList;
		if (isSSEIUser()||isDeUser()) {
			companyList = companyService.findUseCompanies();
		}else {
			companyList = companyService.findByPrivilege(getCurrentUser());
		}
		ActionContext.getContext().put("companyList", companyList);
		QueryHelper queryHelper = getByCondition();
		queryHelper.preparePageBean(pipeBasciService, pageNum, pageSize);
		return "listDetail";
	}
	
	
	
	
	/** 添加页面 */
	public String addUI() throws Exception {
		backLoadAllCompanys();
		return "saveUI";
	}

	/** 添加 */
	public String add() throws Exception {
		if (companyID!=null&&companyID!=0) {
			Company company = companyService.getById(companyID);
			model.setCompany(company);
		}
		model.setP_submited("2");//初始提交
		model.setP_checkType("2");//管道系统为单位
		pipeBasciService.save(model);
		return "toList";
	}

	/** 修改页面 */
	public String editUI() throws Exception {
		// 准备回显的数据
		backLoadAllCompanys();
		PipeBasic pipeBasic = pipeBasciService.getById(model.getId());
		try {
			companyID=pipeBasic.getCompany().getId();//可能为空
		} catch (Exception e) {
			companyID=null;
		}
		ActionContext.getContext().getValueStack().push(pipeBasic);
		return "saveUI";
	}

	/** 修改 */
	public String edit() throws Exception {
		if (companyID!=null&&companyID!=0) {
			Company company = companyService.getById(companyID);
			model.setCompany(company);
		}
		pipeBasciService.update(model);
		return "toList";
	}
	
	/** 删除 */
	public String delete() throws Exception {
		pipeBasciService.delete(model.getId());
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
