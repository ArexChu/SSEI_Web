package cn.ecust.ssei.view.action.pipe;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.BaseAction;
import cn.ecust.ssei.domain.Company;
import cn.ecust.ssei.domain.PageBean;
import cn.ecust.ssei.domain.pipe.PipeBasic;

import com.opensymphony.xwork2.ActionContext;


@Controller
@Scope("prototype")
public class PipeExpireAction extends BaseAction<PipeBasic>  {
	
	private Long companyId;	
	
	public String list() throws Exception {
		List<Company> companyList = companyService.findAll();
		ActionContext.getContext().put("companyList", companyList);
		PageBean pageBean = pipeBasciService.getPageBean(pageNum, pageSize, companyId);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "list";
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
