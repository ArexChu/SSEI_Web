package cn.ecust.ssei.view.action.vessel.vesselMaintain;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.BaseAction;
import cn.ecust.ssei.domain.Company;
import cn.ecust.ssei.domain.vessel.VesselBasic;
import cn.ecust.ssei.domain.vessel.VesselMonthlyInspection;
import cn.ecust.ssei.util.QueryHelper;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class VesselMonthlyInspectionAction  extends BaseAction<VesselMonthlyInspection>{
	
	private Long companyID;
	
	private String startDate;
	
	private String endDate;
	

	
	/** 列表 */
	public String list() throws Exception {

		List<Company> companyList;
		if (isSSEIUser()||isDeUser()) {
			companyList = companyService.findUseCompanies();
		}else {
			companyList = companyService.findByPrivilege(getCurrentUser());
		}
		ActionContext.getContext().put("companyList", companyList);
		QueryHelper queryHelper = getbyCondition();
		queryHelper.preparePageBean(vesselMonthlyInspectionService, pageNum, pageSize);
		return "list";
	}
	
	private QueryHelper getbyCondition() {
		
		boolean judegeDate=true;
		if ((startDate==null||startDate.isEmpty())&&(endDate==null||endDate.isEmpty())) {
			judegeDate=false;
		}else {
			if (startDate==null||startDate.isEmpty()) {
				startDate="0000-00-00";
			}
			if (endDate==null||endDate.isEmpty()) {
				endDate="9999-99-99";
			}
		}
		String v_Product_ID = null;
		if (model.getVesselBasic()!=null) {
			v_Product_ID = model.getVesselBasic().getV_Product_ID();
		}
		String enCoding = getEncoding(v_Product_ID);
		if (enCoding.equals("ISO-8859-1")) {
			try {
				v_Product_ID=new String(v_Product_ID.getBytes("iso-8859-1"), "utf-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		model.getVesselBasic().setV_Product_ID(v_Product_ID);
		QueryHelper queryHelper = new QueryHelper(VesselMonthlyInspection.class, "v").//
				addCondition(v_Product_ID!=null && !v_Product_ID.isEmpty(), "v.vesselBasic.v_Product_ID= ?", v_Product_ID).//
				addCondition(judegeDate, "v.v_Date between ? and ?", startDate,endDate);

		queryHelper.addOrderProperty("v.id", false);
		return queryHelper;
	}
	
	public String delete() throws Exception {
		vesselMonthlyInspectionService.delete(model.getId());
		return "toList";
	}
	
	/** 添加页面 */
	public String addUI() throws Exception {
		String v_Product_ID = null;
		if (model.getVesselBasic()!=null) {
			v_Product_ID = model.getVesselBasic().getV_Product_ID();
		}
		try {
			v_Product_ID = new String(v_Product_ID.getBytes("iso-8859-1"), "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		model.getVesselBasic().setV_Product_ID(v_Product_ID);
		return "saveUI";
	}
	
	/** 添加 */
	public String add() throws Exception {
		String v_Product_ID=null ;
		if (model.getVesselBasic()!=null) {
			v_Product_ID = model.getVesselBasic().getV_Product_ID();
		}
		VesselBasic vesselBasic=null;
		if (v_Product_ID!=null) {
			vesselBasic = vesselBasicService.getByProductId(v_Product_ID);
		}
		if (vesselBasic!=null) {
			model.setVesselBasic(vesselBasic);
		}
		vesselMonthlyInspectionService.save(model);
		vesselBasic.setV_Product_ID(new String(v_Product_ID.getBytes("utf-8"),"iso8859-1"));
		model.setVesselBasic(vesselBasic);
		return "toList";
	}
	
	
	/** 修改页面 */
	public String editUI() throws Exception {
		// 准备回显的数据
		VesselMonthlyInspection vesselMonthlyInspection = vesselMonthlyInspectionService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(vesselMonthlyInspection);
		return "saveUI";
	}

	/** 修改 */
	public String edit() throws Exception {
		String v_Product_ID=null ;
		if (model.getVesselBasic()!=null) {
			v_Product_ID = model.getVesselBasic().getV_Product_ID();
		}
		VesselBasic vesselBasic=null;
		if (v_Product_ID!=null) {
			vesselBasic = vesselBasicService.getByProductId(v_Product_ID);
		}
		if (vesselBasic!=null) {
			model.setVesselBasic(vesselBasic);
		}
		vesselMonthlyInspectionService.update(model);
		vesselBasic.setV_Product_ID(new String(v_Product_ID.getBytes("utf-8"),"iso8859-1"));
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

	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public static String getEncoding(String str) {      
	       String encode = "GB2312";      
	      try {      
	          if (str.equals(new String(str.getBytes(encode), encode))) {      //判断是不是GB2312
	               String s = encode;      
	              return s;      //是的话，返回“GB2312“，以下代码同理
	           }      
	       } catch (Exception exception) {      
	       }      
	       encode = "ISO-8859-1";      
	      try {      
	          if (str.equals(new String(str.getBytes(encode), encode))) {      //判断是不是ISO-8859-1
	               String s1 = encode;      
	              return s1;      
	           }      
	       } catch (Exception exception1) {      
	       }      
	       encode = "UTF-8";      
	      try {      
	          if (str.equals(new String(str.getBytes(encode), encode))) {   //判断是不是UTF-8
	               String s2 = encode;      
	              return s2;      
	           }      
	       } catch (Exception exception2) {      
	       }      
	       encode = "GBK";      
	      try {      
	          if (str.equals(new String(str.getBytes(encode), encode))) {      //判断是不是GBK
	               String s3 = encode;      
	              return s3;      
	           }      
	       } catch (Exception exception3) {      
	       }      
	      return "";        //如果都不是，说明输入的内容不属于常见的编码格式。
	   }
	
}
