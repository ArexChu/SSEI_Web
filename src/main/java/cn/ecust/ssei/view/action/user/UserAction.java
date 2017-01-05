package cn.ecust.ssei.view.action.user;

import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.BaseAction;
import cn.ecust.ssei.domain.Company;
import cn.ecust.ssei.domain.user.Role;
import cn.ecust.ssei.domain.user.User;
import cn.ecust.ssei.util.QueryHelper;
import cn.ecust.ssei.util.TypeHelper;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class UserAction extends BaseAction<User> {

	private Long companyID;
	private long roleID;
	private List<String> userTypes;
	private List<String> projectTypes;
	private String userTypeSearch;
	private String projectTypeSearch;
	private String oldPassword;
	
	
	/** 列表 */
	public String list() throws Exception {
		//准备单位信息
		List<Company> companyList = companyService.findByPrivilege(getCurrentUser());
		ActionContext.getContext().put("companyList", companyList);
		// 准备分页信息
		QueryHelper queryHelper = new QueryHelper(User.class, "u").
		addCondition(model.getName()!=null, "u.name like ?", "%"+model.getName()+"%").//
		addCondition(companyID!=null,  "u.company.id = ?", companyID).
		addCondition(userTypeSearch!=null&&!userTypeSearch.isEmpty(), "u.userType like ?", "%"+userTypeSearch+"%").//
		addCondition(projectTypeSearch!=null&&!projectTypeSearch.isEmpty(), "u.projectType like ?", "%"+projectTypeSearch+"%");
		if (!isSSEIUser()) {
			queryHelper.addCondition("u.company.id=?", getCurrentUser().getCompany().getId());
		}
		queryHelper.preparePageBean(userService, pageNum, pageSize);
		return "list";
		
	}
	

	/** 删除 */
	public String delete() throws Exception {
		userService.delete(model.getId());
		return "toList";
	}

	/** 添加页面 */
	public String addUI() throws Exception {
		// 准备数据, CompantList
		List<Company> companyList = companyService.findByPrivilege(getCurrentUser());
		List<Role> roleList = roleService.findByPrivilege(getCurrentUser());;
		ActionContext.getContext().put("companyList", companyList);
		ActionContext.getContext().put("roleList", roleList);
		return "saveUI";
	}

	/** 添加 */
	public String add() throws Exception {
		
		String md5Digest = DigestUtils.md5Hex("ssei");
		model.setCompany(companyService.getById(companyID));
		model.setRole(roleService.getById(roleID));
		model.setPassword(md5Digest);
		model.setUserType(TypeHelper.listToString(userTypes, ","));
		model.setProjectType(TypeHelper.listToString(projectTypes, ","));		
		// 保存到数据库
		userService.save(model);
		return "toList";
	}

	/** 修改页面 */
	public String editUI() throws Exception {
		// 准备数据, companyList
		List<Company> companyList = companyService.findByPrivilege(getCurrentUser());
		ActionContext.getContext().put("companyList", companyList);
		// 准备数据, User
		User user = userService.getById(model.getId());
		List<Role> roleList=roleService.findByPrivilege(getCurrentUser());
		ActionContext.getContext().put("roleList", roleList);
		setUserTypes(TypeHelper.stringToList(user.getUserType(), ","));
		setProjectTypes(TypeHelper.stringToList(user.getProjectType(), ","));
		if (user.getRole()!=null) {
			roleID = user.getRole().getId();
		}
		if (user.getCompany()!=null) {
			companyID = user.getCompany().getId();
		}
		ActionContext.getContext().getValueStack().push(user);
		return "saveUI";
	}

	/** 修改 */
	public String edit() throws Exception {
		// 1，从数据库中取出原对象
		User user = userService.getById(model.getId());
		// 2，设置要修改的属性
		user.setLoginName(model.getLoginName());
		user.setName(model.getName());
		user.setCompany(companyService.getById(companyID));
		user.setE_Mail(model.getE_Mail());
		user.setIdentityCard(model.getIdentityCard());
		user.setSex(model.getSex());
		user.setTelephone(model.getTelephone());
		user.setRole(roleService.getById(roleID));
		user.setUserType(TypeHelper.listToString(userTypes, ","));
		user.setProjectType(TypeHelper.listToString(projectTypes, ","));	
		// 3，更新到数据库
		userService.update(user);
		return "toList";
	}

	/** 初始化密码为ssei */
	public String initPassword() throws Exception {
		// 1，从数据库中取出原对象
		User user = userService.getById(model.getId());

		// 2，设置要修改的属性（要使用MD5摘要）
		String md5Digest = DigestUtils.md5Hex("ssei");
		user.setPassword(md5Digest);

		// 3，更新到数据库
		userService.update(user);

		return "toList";
	}

	/** 登录页面 */
	
	public String loginUI() throws Exception {
		return "loginUI";
	}

	/** 登录 */
	public String login() throws Exception {
		/**
		 * 由于客户端的ajax校验并不能完全的拦截校验码，所以这里要在判断一次
		 */
		String verifyCode = model.getVerifyCode();
		String vcode = (String) ActionContext.getContext().getSession().get("vCode");
		boolean b = verifyCode.equalsIgnoreCase(vcode);
		if (b==false) {
			addFieldError("verifyCode", "校验码错误！");
			ActionContext.getContext().put("user", model);
			return "loginUI";
		}else {

			User user = userService.findByLoginNameAndPassword(model.getLoginName(), model.getPassword());
			if (user == null) {
				addFieldError("login", "用户名或密码不正确");
				ActionContext.getContext().put("user", model);
				return "loginUI";	
			} else {
				// 登录用户
				ActionContext.getContext().getSession().put("user", user);
				// 获取用户名保存到cookie中
				String loginNmae = user.getLoginName();
				loginNmae = URLEncoder.encode(loginNmae, "utf-8");
				Cookie cookie = new Cookie("loginNmae", loginNmae);
				cookie.setMaxAge(60 * 60 * 24 * 10);//保存10天
				HttpServletResponse resp = ServletActionContext.getResponse();				
				resp.addCookie(cookie);
				return "toIndex";
			}	
		}				
	}
	
	public String passwordUI() throws Exception{
		
		return "password";
	}
	
	public String password() throws Exception{
		User user = (User) ActionContext.getContext().getSession().get("user");

			User user1 = userService.findByLoginNameAndPassword(user.getLoginName(), oldPassword);
			if (user1 == null) {
				addFieldError("login", "密码不正确");
				ActionContext.getContext().put("user", model);
				return "password";	
			}else {
				String md5Digest = DigestUtils.md5Hex(model.getPassword());
				user1.setPassword(md5Digest);
				userService.update(user1);
				return "toLogout";
			}
	
	}
	
	
	/** 注销 */
	public String logout() throws Exception {
		ActionContext.getContext().getSession().remove("user");
		return "loginUI";
	}
	

	
	
	/**
	 * ajax校验验证码
	 * @return
	 * @throws Exception
	 */
	public void verifyCode()throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse(); 
		HttpServletRequest request = ServletActionContext.getRequest();
		response.setCharacterEncoding("UTF-8"); 
		/*
		 * 1. 获取输入框中的验证码
		 */
		String verifyCode = model.getVerifyCode();
		/*
		 * 2. 获取图片上真实的校验码
		 */
		String vcode = (String) request.getSession().getAttribute("vCode");
		/*
		 * 3. 进行忽略大小写比较，得到结果
		 */
		boolean b = verifyCode.equalsIgnoreCase(vcode);
		/*
		 * 4. 发送给客户端
		 */
		response.getWriter().println(b);
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
	 * @return the roleID
	 */
	public long getRoleID() {
		return roleID;
	}


	/**
	 * @param roleID the roleID to set
	 */
	public void setRoleID(long roleID) {
		this.roleID = roleID;
	}


	/**
	 * @return the userTypes
	 */
	public List<String> getUserTypes() {
			return userTypes;		
	}


	/**
	 * @param userTypes the userTypes to set
	 */
	public void setUserTypes(List<String> userTypes) {
			this.userTypes = userTypes;
	}


	/**
	 * @return the projectTypes
	 */
	public List<String> getProjectTypes() {
		return projectTypes;
	}


	/**
	 * @param projectTypes the projectTypes to set
	 */
	public void setProjectTypes(List<String> projectTypes) {
			this.projectTypes = projectTypes;
	}


	/**
	 * @return the userTypeSearch
	 */
	public String getUserTypeSearch() {
		return userTypeSearch;
	}


	/**
	 * @param userTypeSearch the userTypeSearch to set
	 */
	public void setUserTypeSearch(String userTypeSearch) {
		this.userTypeSearch = userTypeSearch;
	}


	/**
	 * @return the projectTypeSearch
	 */
	public String getProjectTypeSearch() {
		return projectTypeSearch;
	}


	/**
	 * @param projectTypeSearch the projectTypeSearch to set
	 */
	public void setProjectTypeSearch(String projectTypeSearch) {
		this.projectTypeSearch = projectTypeSearch;
	}


	/**
	 * @return the oldPassword
	 */
	public String getOldPassword() {
		return oldPassword;
	}


	/**
	 * @param oldPassword the oldPassword to set
	 */
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	
	
	
	
	
}
