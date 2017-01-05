package cn.ecust.ssei.view.action.user;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import cn.ecust.ssei.base.BaseAction;
import cn.ecust.ssei.domain.user.Certificates;

@Controller
@Scope("prototype")
public class CertificatesAction extends BaseAction<Certificates> {
	
	private long userId;
	
	/** 列表 */
	public String list() throws Exception {
		List<Certificates> certificates =new ArrayList<Certificates>();
		certificates.addAll(userService.getById(userId).getCertificates());
		ActionContext.getContext().put("certificates", certificates);
		return "list";
	}

	/** 删除 */
	public String delete() throws Exception {
		certificatesService.delete(model.getId());
		return "toList";
	}

	/** 添加页面 */
	public String addUI() throws Exception {
		return "saveUI";
	}

	/** 添加 */
	public String add() throws Exception {
		model.setUser(userService.getById(userId));
		model.setEmailStat(false);
		certificatesService.save(model);
		return "toList";
	}

	/** 修改页面 */
	public String editUI() throws Exception {
		Certificates certificates = certificatesService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(certificates);
		return "saveUI";
	}

	/** 修改 */
	public String edit() throws Exception {
		Certificates certificates = certificatesService.getById(model.getId());
		certificates.setDescription(model.getDescription());
		certificates.setName(model.getName());
		certificates.setFailureData(model.getFailureData());
		certificates.setEmailStat(false);
		certificatesService.update(certificates);
		return "toList";
	}

	/**
	 * @return the userId
	 */
	public long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}		
}
