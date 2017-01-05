package cn.ecust.ssei.view.action.vessel;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.BaseAction;
import cn.ecust.ssei.domain.Company;
import cn.ecust.ssei.domain.vessel.VesselBasic;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.QueryHelper;
import cn.ecust.ssei.view.action.CompanyAction;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class vesselInvestigationAction extends BaseAction<VesselBasic>{
	
	private Long companyID;
	/** 列表 */
	public String list() throws Exception {
		/**
		 * 1: 满足列表条件
		 * 2：设计单位只能查看设计的管道基础信息
		 */
		List<Company> companyList;
		if (isSSEIUser()||isDeUser()) {
			companyList = companyService.findUseCompanies();
		}else {
			companyList = companyService.findByPrivilege(getCurrentUser());
		}
		ActionContext.getContext().put("companyList", companyList);
		QueryHelper queryHelper = getbyCondition();
		queryHelper.preparePageBean(vesselBasicService, pageNum, pageSize);
		return "list";
	}
	
	

	/** 展示公司信息 */
	public String companyUI() throws Exception {
		Company company = companyService.getById(companyID);
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
	
	private QueryHelper getbyCondition() {
		String v_Product_ID = model.getV_Product_ID();
		String v_Name = model.getV_Name();
		String v_Type = model.getV_Type();
		String v_Use_Addr = model.getV_Use_Addr();
		String v_Mainbody_Str = model.getV_Mainbody_Str();
		
		QueryHelper queryHelper = new QueryHelper(VesselBasic.class, "v").
		addCondition(v_Product_ID!=null && !v_Product_ID.isEmpty(), "v.v_Product_ID = ?", v_Product_ID).
		addCondition(v_Name!=null && !v_Name.isEmpty(), "v.v_Name = ?", v_Name).
		addCondition(v_Type!=null && !v_Type.isEmpty(), "v.v_Type = ?", v_Type).
		addCondition(v_Use_Addr!=null && !v_Use_Addr.isEmpty(), "v.v_Use_Addr like ?", "%"+v_Use_Addr+"%").
		addCondition(v_Mainbody_Str!=null && !v_Mainbody_Str.isEmpty(), "v.v_Mainbody_Str like ?", "%"+v_Mainbody_Str+"%").
		addCondition(v_Product_ID!=null && !v_Product_ID.isEmpty(), "v.v_Product_ID = ?", v_Product_ID).
		addCondition(companyID!=null,  "v.v_Use_Com.id = ?", companyID);
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
		return queryHelper;
	}
	

	

}
