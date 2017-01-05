//package cn.ecust.ssei.util;
//
//import javax.annotation.Resource;
//import org.hibernate.Session;
////import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//import cn.ecust.ssei.domain.Privilege;
////import cn.ecust.ssei.domain.Privilege;
//
//
//
//@Component
//public class Installer {
//
//	@Resource
//	private SessionFactory sessionFactory;
//
//	/**
//	 * 执行安装
//	 */
//	@Transactional
//	public void install() {
//		Session session = sessionFactory.getCurrentSession();
//
//		// ==============================================================
//		// 保存超级管理员用户
////		User user = new User();
////		user.setLoginName("admin");
////		user.setName("超级管理员");
////		user.setPassword(DigestUtils.md5Hex("admin"));
////		session.save(user); // 保存
//
//		// ==============================================================
//		// 保存权限数据
//		Privilege menu, menu1, menu2, menu3,menu4,menu5,menu6,menu7;
//
//		
//		menu = new Privilege("系统管理", null, null);
//		menu1 = new Privilege("角色管理", "/role_list", menu);
//		menu2 = new Privilege("公司管理", "/company_list", menu);
//		menu3 = new Privilege("用户管理", "/user_list", menu);
//		session.save(menu);
//		session.save(menu1);
//		session.save(menu2);
//		session.save(menu3);
////		
////		/**
////		 * 
////		 */
//		session.save(new Privilege("角色删除", "/role_delete", menu1));
//		session.save(new Privilege("角色添加", "/role_add", menu1));
//		session.save(new Privilege("角色修改", "/role_edit", menu1));
//		session.save(new Privilege("权限设置", "/role_setPrivilege", menu1));
//
//		session.save(new Privilege("公司列表", "/company_list", menu2));
//		session.save(new Privilege("公司删除", "/company_delete", menu2));
//		session.save(new Privilege("公司添加", "/company_add", menu2));
//		session.save(new Privilege("公司修改", "/company_edit", menu2));
//		session.save(new Privilege("规章制度", "/company_ruleUI", menu2));
//
//		session.save(new Privilege("用户删除", "/user_delete", menu3));
//		session.save(new Privilege("用户添加", "/user_add", menu3));
//		session.save(new Privilege("密码初始化", "/user_initPassword", menu3));
//////		
//////		
//		menu=new Privilege("管道管理", null, null);
//		menu1=new Privilege("基本信息", "/pipeBasic_list", menu);
//		menu2=new Privilege("管道安装", "/pipeInstall_list", menu);
//		menu3=new Privilege("管道系统", "/pipeScheme_list", menu);
//		menu4=new Privilege("检验准备", "/pipeScheme_listDetail", menu);
//		menu5=new Privilege("检验记录", "/pipeMaintain_list", menu);
//		//menu7=new Privilege("问题记载", "/pipeScheme_listDetail", menu);
//		session.save(menu);
//		session.save(menu1);
//		session.save(menu2);
//		session.save(menu3);
//		session.save(menu4);
//		session.save(menu5);
//		//session.save(menu7);
////		
//		session.save(new Privilege("管道添加", "/pipeBasic_add", menu1));
//		session.save(new Privilege("管道删除", "/pipeBasic_delete", menu1));
//		session.save(new Privilege("管道修改", "/pipeBasic_edit", menu1));
//		session.save(new Privilege("管道附件", "/pipeBasic_toFileList", menu1));
//		session.save(new Privilege("管道提交", "/pipeBasic_submit", menu1));
//		session.save(new Privilege("excel导入", "/pipeBasic_excelIn", menu1));
//		session.save(new Privilege("excel导出", "/pipeBasic_excelOut", menu1));
////
//		session.save(new Privilege("管道安装添加", "/pipeInstall_add", menu2));
//		session.save(new Privilege("管道安装删除", "/pipeInstall_delete", menu2));
//		session.save(new Privilege("管道安装修改", "/pipeInstall_edit", menu2));
//		session.save(new Privilege("管道安装项目", "/pipeInstall_toMenu", menu2));
//		session.save(new Privilege("管道安装附件", "/pipeInstall_toFileList", menu2));
////		
//		
//		session.save(new Privilege("管道系统添加", "/pipeScheme_add", menu3));
//		session.save(new Privilege("管道系统删除", "/pipeScheme_delete", menu3));
//		session.save(new Privilege("管道系统修改", "/pipeScheme_edit", menu3));
//		session.save(new Privilege("管道系统附件", "/pipeScheme_toFileList", menu3));
//		session.save(new Privilege("月度检验", "/pipeMonthlyInspection_list", menu3));
//		
//		
//		session.save(new Privilege("历次检验记录", "/pipeSchemeDetail_listRecord", menu4));
//		session.save(new Privilege("问题记载", "/pipeSchemeDetail_listProblem", menu4));
//		session.save(new Privilege("企业资料审查", "/pipeInvestigation_Company", menu4));
//		session.save(new Privilege("设备资料审查（等同于管道修改）", "/pipeBasic_edit", menu4));
//		session.save(new Privilege("新增检验记录", "/pipeSchemeDetail_add", menu4));
//
//		
//		session.save(new Privilege("在线检验管理", "/pipeOnlineMaintain_list", menu5));
//		session.save(new Privilege("全面检验管理", "/pipeDetailMaintain_list", menu5));
//		session.save(new Privilege("在线检验附件管理", "/pipeOnlineMaintain_toFileList", menu5));
//		session.save(new Privilege("全面检验附件管理", "/pipeDetailMaintain_toFileList", menu5));
//		session.save(new Privilege("检验删除", "/pipeMaintain_delete", menu5));
//
//
//
//		
//		menu=new Privilege("容器管理", null, null);
//		menu1=new Privilege("基本信息", "/vesselBasic_list", menu);
//		menu2=new Privilege("检验准备", "/vesselInvestigation_list", menu);
//		menu3=new Privilege("检验记录", "/vesselMaintain_list", menu);
//		////menu4=new Privilege("问题记载", "/vesselSchemeDetail_listDetail", menu);
//		session.save(menu);
//		session.save(menu1);
//		session.save(menu2);
//		session.save(menu3);
//		session.save(menu4);
//		
//		session.save(new Privilege("容器添加", "/vesselBasic_add", menu1));
//		session.save(new Privilege("容器删除", "/vesselBasic_delete", menu1));
//		session.save(new Privilege("容器修改", "/vesselBasic_edit", menu1));
//		session.save(new Privilege("容器月度检验", "/vesselMonthlyInspection_list", menu1));
//		session.save(new Privilege("容器附件", "/vesselBasic_toFileList", menu1));
//		session.save(new Privilege("excel导入", "/vesselBasic_excelIn", menu1));
//		session.save(new Privilege("excel导出", "/vesselBasic_excelOut", menu1));
//		
//		session.save(new Privilege("新增检验记录", "/vesselSchemeDetail_add", menu2));
//		session.save(new Privilege("企业资料审查", "/vesselInvestigation_Company", menu2));
//		session.save(new Privilege("设备资料审查（等同于容器修改）", "/vesselBasic_edit", menu2));
//		
//		session.save(new Privilege("定期检验管理", "/vesselPeriodicalMaintain_list", menu3));
//		session.save(new Privilege("年度检验管理", "/vesselAnnualMaintain_list", menu3));
//		session.save(new Privilege("验收检验管理", "/vesselCheckMaintain_list", menu3));
//		session.save(new Privilege("定期检验附件管理", "/vesselPeriodicalMaintain_toFileList", menu3));
//		session.save(new Privilege("年度检验附件管理", "/vesselAnnualMaintain_toFileList", menu3));
//		session.save(new Privilege("验收检验附件管理", "/vesselCheckMaintain_toFileList", menu3));
//		session.save(new Privilege("检验删除", "/vesselMaintain_delete", menu3));
//		
//		session.save(new Privilege("历次检验记录", "/vesselSchemeDetail_listRecord", menu2));
//		session.save(new Privilege("问题记载", "/vesselSchemeDetail_listProblem", menu2));
//		
//		menu=new Privilege("检验记录管理", null, null);
//		menu1=new Privilege("管道安装", "/pipeInstallDocument_list", menu);
//		menu2=new Privilege("管道管理", "/pipeMaintainDocument_list", menu);
//		menu3=new Privilege("容器管理", "/vesselMaintainDocument_list", menu);
////		
////		
////		
////		
//		session.save(menu);
//		session.save(menu1);
//		session.save(menu2);
//		session.save(menu3);
//		
//		
//		menu=new Privilege("到期提醒", null, null);
//		menu1=new Privilege("管道到期", "/pipeExpire_list", menu);
//		menu2=new Privilege("容器到期", "/vesselExpire_list", menu);
//		session.save(menu);
//		session.save(menu1);
//		session.save(menu2);
//
//	}
//
//	@SuppressWarnings("resource")
//	public static void main(String[] args) {
//		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Installer installer = (Installer) ac.getBean("installer");
//		installer.install();
//	}
//}
