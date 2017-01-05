package cn.ecust.ssei.view.action.pipe.pipemaintain;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.BaseAction;
import cn.ecust.ssei.domain.Company;
import cn.ecust.ssei.domain.pipe.PipeBasic;
import cn.ecust.ssei.domain.pipe.PipeMonthlyInspection;
import cn.ecust.ssei.util.QueryHelper;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class PipeMonthlyInspectionAction  extends BaseAction<PipeMonthlyInspection>{
	
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
		queryHelper.preparePageBean(pipeMonthlyInspectionService, pageNum, pageSize);
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
		String p_Sys = null;
		if (model.getPipeBasic()!=null) {
			p_Sys = model.getPipeBasic().getP_Sys();
		}
		
		String enCoding = getEncoding(p_Sys);
		if (enCoding.equals("ISO-8859-1")) {
			try {
				p_Sys=new String(p_Sys.getBytes("iso-8859-1"), "utf-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		model.getPipeBasic().setP_Sys(p_Sys);
		QueryHelper queryHelper = new QueryHelper(PipeMonthlyInspection.class, "p").//
				addCondition(p_Sys!=null && !p_Sys.isEmpty(), "p.pipeBasic.p_Sys= ?", p_Sys).//
				addCondition(true, "p.pipeBasic.p_checkType= ?", "2").//
				addCondition(judegeDate, "p.v_Date between ? and ?", startDate,endDate);

		queryHelper.addOrderProperty("p.id", false);
		return queryHelper;
	}
	
	public String delete() throws Exception {
		pipeMonthlyInspectionService.delete(model.getId());
		return "toList";
	}
	
	/** 添加页面 */
	public String addUI() throws Exception {
		String p_Sys="";
		if (model.getPipeBasic()!=null) {
			p_Sys = model.getPipeBasic().getP_Sys();
			try {
				p_Sys = new String(p_Sys.getBytes("iso-8859-1"), "utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} 
		}
		model.getPipeBasic().setP_Sys(p_Sys);
		return "saveUI";
	}
	
	/** 添加 */
	public String add() throws Exception {
		String p_Sys=null ;
		if (model.getPipeBasic()!=null) {
			p_Sys = model.getPipeBasic().getP_Sys();
		}
		PipeBasic pipeBasic=null;
		if (p_Sys!=null) {
			pipeBasic = pipeBasciService.getByPipeSysIdAndType(p_Sys, "2");
		}
		if (pipeBasic!=null) {
			model.setPipeBasic(pipeBasic);
		}
		pipeMonthlyInspectionService.save(model);
		pipeBasic.setP_Sys(new String(p_Sys.getBytes("utf-8"),"iso8859-1"));
		model.setPipeBasic(pipeBasic);
		return "toList";
	}
	
	
	/** 修改页面 */
	public String editUI() throws Exception {
		// 准备回显的数据
		PipeMonthlyInspection pipeMonthlyInspection = pipeMonthlyInspectionService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(pipeMonthlyInspection);
		return "saveUI";
	}

	/** 修改 */
	public String edit() throws Exception {
		String p_Sys=null ;
		if (model.getPipeBasic()!=null) {
			p_Sys = model.getPipeBasic().getP_Sys();
		}
		PipeBasic pipeBasic=null;
		if (p_Sys!=null) {
			pipeBasic = pipeBasciService.getByPipeSysIdAndType(p_Sys, "2");
		}
		if (pipeBasic!=null) {
			model.setPipeBasic(pipeBasic);
		}
		pipeMonthlyInspectionService.update(model);
		pipeBasic.setP_Sys(new String(p_Sys.getBytes("utf-8"),"iso8859-1"));
		model.setPipeBasic(pipeBasic);
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
