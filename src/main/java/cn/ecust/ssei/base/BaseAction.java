package cn.ecust.ssei.base;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import cn.ecust.ssei.domain.Company;
import cn.ecust.ssei.domain.user.User;
import cn.ecust.ssei.domain.vo.formatter.CompanyFormatter;
import cn.ecust.ssei.service.CompanyService;
import cn.ecust.ssei.service.PrivilegeService;
import cn.ecust.ssei.service.pipe.PipeBasciService;
import cn.ecust.ssei.service.pipe.PipeBasicExcelService;
import cn.ecust.ssei.service.pipe.PipeMaintainService;
import cn.ecust.ssei.service.pipe.PipeMonthlyInspectionService;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipeAssTableService;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipeDetailMaintainService;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipeHardTestService;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipeLeakTestService;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipeMetTestService;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipeMicroTestService;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipePreTestService;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipeSPDTestService;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipeThiTestService;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipeVerficationService;
import cn.ecust.ssei.service.pipe.pipeinstall.PIBasicService;
import cn.ecust.ssei.service.pipe.pipeinstall.PICheckInfService;
import cn.ecust.ssei.service.pipe.pipeinstall.PIComInfService;
import cn.ecust.ssei.service.pipe.pipeinstall.PIConclusionService;
import cn.ecust.ssei.service.pipe.pipeinstall.PILeftProblemService;
import cn.ecust.ssei.service.pipe.pipeinstall.PIReviewService;
import cn.ecust.ssei.service.pipe.pipeinstall.PISafeCheck1Service;
import cn.ecust.ssei.service.pipe.pipeinstall.PISafeCheck2Service;
import cn.ecust.ssei.service.pipe.pipeinstall.PISafeCheck3Service;
import cn.ecust.ssei.service.pipe.pipeinstall.PISafeCheckService;
import cn.ecust.ssei.service.pipe.pipeinstall.PipeCompleteInfService;
import cn.ecust.ssei.service.pipe.pipeinstall.PipeInstallService;
import cn.ecust.ssei.service.pipe.pipeonlinemaintain.PipeOnlineMaintainService;
import cn.ecust.ssei.service.pipe.pipeonlinemaintain.PipeOnlineSubTestService;
import cn.ecust.ssei.service.pipe.pipeonlinemaintain.PipeOnlineThiTestService;
import cn.ecust.ssei.service.user.CertificatesService;
import cn.ecust.ssei.service.user.RoleService;
import cn.ecust.ssei.service.user.UserService;
import cn.ecust.ssei.service.vessel.VesselBasicExcelService;
import cn.ecust.ssei.service.vessel.VesselBasicService;
import cn.ecust.ssei.service.vessel.VesselMaintainService;
import cn.ecust.ssei.service.vessel.VesselMonthlyInspectionService;
import cn.ecust.ssei.service.vessel.annual.VesselAnnualConclusionTestService;
import cn.ecust.ssei.service.vessel.annual.VesselAnnualMaintainService;
import cn.ecust.ssei.service.vessel.annual.VesselAnnualTestService;
import cn.ecust.ssei.service.vessel.check.VesselCheckConclusionTestService;
import cn.ecust.ssei.service.vessel.check.VesselCheckMaintainService;
import cn.ecust.ssei.service.vessel.check.VesselCheckTestService;
import cn.ecust.ssei.service.vessel.periodical.VesselAddTestService;
import cn.ecust.ssei.service.vessel.periodical.VesselAirTestService;
import cn.ecust.ssei.service.vessel.periodical.VesselAmmoniaTestService;
import cn.ecust.ssei.service.vessel.periodical.VesselConclusionTestService;
import cn.ecust.ssei.service.vessel.periodical.VesselGlassSteelLinerTestService;
import cn.ecust.ssei.service.vessel.periodical.VesselGlassSteelTestService;
import cn.ecust.ssei.service.vessel.periodical.VesselGlassTestService;
import cn.ecust.ssei.service.vessel.periodical.VesselGraphiteLinerTestService;
import cn.ecust.ssei.service.vessel.periodical.VesselGraphiteTestService;
import cn.ecust.ssei.service.vessel.periodical.VesselHardTestService;
import cn.ecust.ssei.service.vessel.periodical.VesselHeTestService;
import cn.ecust.ssei.service.vessel.periodical.VesselMagneticTestService;
import cn.ecust.ssei.service.vessel.periodical.VesselMatTestService;
import cn.ecust.ssei.service.vessel.periodical.VesselMetTestService;
import cn.ecust.ssei.service.vessel.periodical.VesselMicroTestService;
import cn.ecust.ssei.service.vessel.periodical.VesselPeriodicalMaintainService;
import cn.ecust.ssei.service.vessel.periodical.VesselPermTestService;
import cn.ecust.ssei.service.vessel.periodical.VesselPlasticLinerTestService;
import cn.ecust.ssei.service.vessel.periodical.VesselPlasticTestService;
import cn.ecust.ssei.service.vessel.periodical.VesselPreTestService;
import cn.ecust.ssei.service.vessel.periodical.VesselRadioTestService;
import cn.ecust.ssei.service.vessel.periodical.VesselSPDTestService;
import cn.ecust.ssei.service.vessel.periodical.VesselSonciTestService;
import cn.ecust.ssei.service.vessel.periodical.VesselTOFDTestService;
import cn.ecust.ssei.service.vessel.periodical.VesselThiCheckService;
import cn.ecust.ssei.service.vessel.periodical.VesselThiTestService;
import cn.ecust.ssei.service.vessel.periodical.VesselUltrasonicTestService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public abstract class BaseAction<T> extends ActionSupport implements ModelDriven<T> {

	// =============== ModelDriven的支持 ==================

	protected T model;

	public BaseAction() {
		try {
			// 通过反射获取model的真实类型
			ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
			@SuppressWarnings("unchecked")
			Class<T> clazz = (Class<T>) pt.getActualTypeArguments()[0];
			// 通过反射创建model的实例
			model = clazz.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public T getModel() {
		return model;
	}

	// =============== Service实例的声明 ==================
	@Resource
	protected UserService userService;
	@Resource
	protected CompanyService companyService;
	@Resource
	protected CertificatesService certificatesService;
	@Resource
	protected RoleService roleService;
	@Resource
	protected PrivilegeService privilegeService;
	@Resource
	protected PipeBasciService pipeBasciService;
	@Resource
	protected PipeMaintainService pipeMaintainService;
	@Resource
	protected PipeInstallService pipeInstallService;
	@Resource
	protected PipeDetailMaintainService pipeDetailMaintainService;
	@Resource
	protected PipeOnlineMaintainService pipeOnlineMaintainService;
	@Resource
	protected PipeAssTableService pipeAssTableService;
	@Resource
	protected PipeHardTestService  pipeHardTestService;
	@Resource
	protected PipeLeakTestService pipeLeakTestService;
	@Resource
	protected PipeMetTestService pipeMetTestService;
	@Resource
	protected PipeMicroTestService pipeMicroTestService;
	@Resource
	protected PipePreTestService pipePreTestService;
	@Resource
	protected PipeSPDTestService pipeSPDTestService;
	@Resource
	protected PipeThiTestService pipeThiTestService;
	@Resource
	protected PIBasicService piBasicService;
	@Resource
	protected PICheckInfService piCheckInfService;
	@Resource
	protected PIComInfService piComInfService;
	@Resource
	protected PIConclusionService piConclusionService;
	@Resource
	protected PILeftProblemService piLeftProblemService;
	@Resource
	protected PipeCompleteInfService pipeCompleteInfService;
	@Resource
	protected PIReviewService piReviewService;
	@Resource
	protected PISafeCheck1Service piSafeCheck1Service;
	@Resource
	protected PISafeCheck2Service piSafeCheck2Service;
	@Resource
	protected PISafeCheck3Service piSafeCheck3Service;
	@Resource
	protected PISafeCheckService piSafeCheckService;
	@Resource
	protected PipeVerficationService pipeVerficationService;
	@Resource
	protected PipeBasicExcelService pipeBasicExcelService;
	@Resource
	protected VesselBasicExcelService vesselBasicExcelService;
	@Resource
	protected PipeOnlineSubTestService pipeOnlineSubTestService;
	@Resource
	protected PipeOnlineThiTestService pipeOnlineThiTestService;
	@Resource
	protected VesselAnnualMaintainService vesselAnnualMaintainService;
	@Resource
	protected VesselAnnualTestService vesselAnnualTestService;
	@Resource
	protected VesselAnnualConclusionTestService vesselAnnualConclusionTestService;
	@Resource
	protected VesselCheckMaintainService vesselCheckMaintainService;
	@Resource
	protected VesselCheckTestService vesselCheckTestService;
	@Resource
	protected VesselCheckConclusionTestService vesselCheckConclusionTestService;
	@Resource
	protected VesselAddTestService vesselAddTestService;
	@Resource
	protected VesselAmmoniaTestService vesselAmmoniaTestService;
	@Resource
	protected VesselConclusionTestService vesselConclusionTestService;
	@Resource
	protected VesselGlassSteelLinerTestService vesselGlassSteelLinerTestService;
	@Resource
	protected VesselGlassSteelTestService vesselGlassSteelTestService;
	@Resource
	protected VesselGlassTestService vesselGlassTestService;
	@Resource
	protected VesselGraphiteLinerTestService vesselGraphiteLinerTestService;
	@Resource
	protected VesselGraphiteTestService vesselGraphiteTestService;
	@Resource
	protected VesselHardTestService vesselHardTestService;
	@Resource
	protected VesselHeTestService vesselHeTestService;
	@Resource
	protected VesselMagneticTestService vesselMagneticTestService;
	@Resource
	protected VesselMatTestService vesselMatTestService;
	@Resource
	protected VesselMetTestService vesselMetTestService;
	@Resource
	protected VesselMicroTestService vesselMicroTestService;
	@Resource
	protected VesselPeriodicalMaintainService 	vesselPeriodicalMaintainService;
	@Resource
	protected VesselPermTestService vesselPermTestService;
	@Resource
	protected VesselPlasticLinerTestService vesselPlasticLinerTestService;
	@Resource
	protected VesselPlasticTestService vesselPlasticTestService;
	@Resource
	protected VesselPreTestService vesselPreTestService;
	@Resource
	protected VesselRadioTestService vesselRadioTestService;
	@Resource
	protected VesselSonciTestService vesselSonciTestService;
	@Resource
	protected VesselSPDTestService vesselSPDTestService;;
	@Resource
	protected VesselThiCheckService vesselThiCheckService;
	@Resource
	protected VesselThiTestService vesselThiTestService;
	@Resource
	protected VesselTOFDTestService vesselTOFDTestService;
	@Resource
	protected VesselUltrasonicTestService vesselUltrasonicTestService;
	@Resource
	protected VesselBasicService vesselBasicService;
	@Resource
	protected VesselMaintainService vesselMaintainService;
	@Resource
	protected VesselAirTestService vesselAirTestService;
	@Resource
	protected VesselMonthlyInspectionService vesselMonthlyInspectionService;
	@Resource
	protected PipeMonthlyInspectionService pipeMonthlyInspectionService;
	
	/**
	 * 获取当前登录的用户
	 * 
	 * @return
	 */
	protected User getCurrentUser() {
		return (User) ActionContext.getContext().getSession().get("user");
	}
	
	protected void backLoadAllCompanys(){
			
		List<Company> companyList = companyService.findAll();
		List<Company> useCompanyList = companyService.findUseCompanies();
		ActionContext.getContext().put("companyList", CompanyFormatter.formatterToVoList(companyList));
		ActionContext.getContext().put("useCompanyList",CompanyFormatter.formatterToVoList(useCompanyList));
		
	}
	
	
	/**
	 * 判断当前登录的用户是否为特检院用户
	 * 
	 * @return
	 */
	protected boolean isSSEIUser() {
		User user  =getCurrentUser();
		return (user.getLoginName().equals("admin")||user.getCompany().getType()==3);
	}
	/**
	 * 判断当前登录的用户是否为设计机构人员
	 * 
	 * @return
	 */
	protected boolean isDeUser() {
		User user  =getCurrentUser();
		return (user.getCompany().getType()==2);
	}
	/**
	 * 判断当前登录的用户是否为使用机构人员
	 * 
	 * @return
	 */
	protected boolean isHoldUser() {
		User user  =getCurrentUser();
		return (user.getCompany().getType()==1);
	}

	// ============== 分页用的参数 =============

	protected int pageNum = 1; // 当前页
	protected int pageSize = 5; // 每页显示多少条记录

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	
	

}
