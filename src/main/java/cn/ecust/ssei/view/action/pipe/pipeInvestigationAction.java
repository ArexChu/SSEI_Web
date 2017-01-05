package cn.ecust.ssei.view.action.pipe;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import cn.ecust.ssei.base.BaseAction;
import cn.ecust.ssei.domain.Company;
import cn.ecust.ssei.domain.pipe.PipeBasic;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.QueryHelper;
import cn.ecust.ssei.view.action.CompanyAction;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class pipeInvestigationAction extends BaseAction<PipeBasic>{
	
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
		QueryHelper queryHelper = new QueryHelper(PipeBasic.class, "p").
		addCondition(model.getP_ID()!=null && !model.getP_ID().isEmpty(), "p.p_ID = ?", model.getP_ID()).//
		addCondition(model.getP_Name()!=null && !model.getP_Name().isEmpty(), "p.p_Name = ?", model.getP_Name()).//
		addCondition(companyID!=null,  "p.company.id = ?", companyID).
		addCondition(model.getP_Gra()!=null && !model.getP_Gra().isEmpty(),  "p.p_Gra = ?",  model.getP_Gra()).
		addCondition(model.getP_Sys()!=null && !model.getP_Sys().isEmpty(),  "p.p_Sys = ?",  model.getP_Sys()).
		addCondition("p.p_checkType = ?",  "1").//以管道为单位
		addCondition(model.getP_Equ_Name()!=null && !model.getP_Equ_Name().isEmpty(),  "p.p_Equ_Name = ?",  model.getP_Equ_Name());
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
		queryHelper.preparePageBean(pipeBasciService, pageNum, pageSize);
		return "list";
	}
	
	

	/** 展示公司信息 */
	public String companyUI() throws Exception {
		Company company = companyService.getById(model.getCompany().getId());
		//需要确定规章制度的有无，扫描此时到底有没有对应的文件
		List<Boolean> fileBoolean = new ArrayList<Boolean>();
		String uploadPath = MyFileUtils.getCompanyPath();
		File file;
		for (int i = 0; i < CompanyAction.pdfName.length; i++) {
			String filePath = uploadPath + "\\" +company.getId()+"_"+ CompanyAction.pdfName[i];
			file =new File(filePath);
			fileBoolean.add(i, file.exists());
		}
		file =null;
		ActionContext.getContext().put("fileBoolean", fileBoolean);
		ActionContext.getContext().getValueStack().push(company);
		return "companyUI";
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
