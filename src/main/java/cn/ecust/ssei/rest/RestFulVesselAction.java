package cn.ecust.ssei.rest;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.ecust.ssei.domain.vessel.VesselBasic;
import cn.ecust.ssei.domain.vessel.VesselMaintain;
import cn.ecust.ssei.domain.vessel.VesselMonthlyInspection;
import cn.ecust.ssei.domain.vessel.annual.VesselAnnualConclusionTest;
import cn.ecust.ssei.domain.vessel.annual.VesselAnnualTest;
import cn.ecust.ssei.domain.vessel.check.VesselCheckConclusionTest;
import cn.ecust.ssei.domain.vessel.check.VesselCheckTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselAddTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselAirTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselAmmoniaTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselConclusionTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselGlassSteelLinerTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselGlassSteelTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselGlassTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselGraphiteLinerTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselGraphiteTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselHardTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselHeTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselMagneticTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselMatTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselMetTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselMicroTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselPermTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselPlasticLinerTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselPlasticTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselPreTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselRadioTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselSPDTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselSonciTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselTOFDTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselThiCheck;
import cn.ecust.ssei.domain.vessel.periodical.VesselThiTest;
import cn.ecust.ssei.domain.vessel.periodical.VesselUltrasonicTest;
import cn.ecust.ssei.domain.vo.VesselBasicVo;
import cn.ecust.ssei.domain.vo.formatter.VesselBasicFormatter;
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
import cn.itcast.commons.CommonUtils;
@Controller
@RequestMapping("/vessel")   
public class RestFulVesselAction{
	
	@Resource
	private VesselAnnualMaintainService vesselAnnualMaintainService;
	@Resource
	private VesselAnnualTestService vesselAnnualTestService;
	@Resource
	private VesselAnnualConclusionTestService vesselAnnualConclusionTestService;
	@Resource
	private VesselCheckMaintainService vesselCheckMaintainService;
	@Resource
	private VesselCheckTestService vesselCheckTestService;
	@Resource
	private VesselCheckConclusionTestService vesselCheckConclusionTestService;
	@Resource
	private VesselAddTestService vesselAddTestService;
	@Resource
	private VesselAmmoniaTestService vesselAmmoniaTestService;
	@Resource
	private VesselConclusionTestService vesselConclusionTestService;
	@Resource
	private VesselGlassSteelLinerTestService vesselGlassSteelLinerTestService;
	@Resource
	private VesselGlassSteelTestService vesselGlassSteelTestService;
	@Resource
	private VesselGlassTestService vesselGlassTestService;
	@Resource
	private VesselGraphiteLinerTestService vesselGraphiteLinerTestService;
	@Resource
	private VesselGraphiteTestService vesselGraphiteTestService;
	@Resource
	private VesselHardTestService vesselHardTestService;
	@Resource
	private VesselHeTestService vesselHeTestService;
	@Resource
	private VesselMagneticTestService vesselMagneticTestService;
	@Resource
	private VesselMatTestService vesselMatTestService;
	@Resource
	private VesselMetTestService vesselMetTestService;
	@Resource
	private VesselMicroTestService vesselMicroTestService;
	@Resource
	private VesselPeriodicalMaintainService 	vesselPeriodicalMaintainService;
	@Resource
	private VesselPermTestService vesselPermTestService;
	@Resource
	private VesselPlasticLinerTestService vesselPlasticLinerTestService;
	@Resource
	private VesselPlasticTestService vesselPlasticTestService;
	@Resource
	private VesselPreTestService vesselPreTestService;
	@Resource
	private VesselRadioTestService vesselRadioTestService;
	@Resource
	private VesselSonciTestService vesselSonciTestService;
	@Resource
	private VesselSPDTestService vesselSPDTestService;;
	@Resource
	private VesselThiCheckService vesselThiCheckService;
	@Resource
	private VesselThiTestService vesselThiTestService;
	@Resource
	private VesselTOFDTestService vesselTOFDTestService;
	@Resource
	private VesselUltrasonicTestService vesselUltrasonicTestService;
	@Resource
	private VesselBasicService vesselBasicService;
	@Resource
	private VesselMaintainService vesselMaintainService;
	@Resource
	private VesselAirTestService vesselAirTestService;
	@Resource
	private VesselMonthlyInspectionService vesselMonthlyInspectionService;
	
	
	private VesselMaintain vesselMaintain = new VesselMaintain();
	
	/**
	 * 上传压力容器基础信息
	 */
	 @RequestMapping(value="/updateVesselInfo", method=RequestMethod.POST)
	 public void updateVesselInfo(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselBasicVo vesselBasicVo = CommonUtils.toBean(request.getParameterMap(), VesselBasicVo.class);
			VesselBasic vesselBasicTemp = VesselBasicFormatter.formatter(vesselBasicVo);
		 	String mid = request.getParameter("scan_Tag_ID") ;
		 	VesselBasic vesselBasic = vesselBasicService.getByVesselId(mid);
		 	vesselBasicTemp.setId(vesselBasic.getId());
		 	vesselBasicTemp.setV_Use_Com(vesselBasic.getV_Use_Com());
		 	vesselBasicTemp.setV_De_Com(vesselBasic.getV_De_Com());
		 	vesselBasicTemp.setV_Man_Com(vesselBasic.getV_Man_Com());
		 	vesselBasicTemp.setV_Install_Com(vesselBasic.getV_Install_Com());
			vesselBasicService.update(vesselBasicTemp);
			printData(response, "success");
		} catch (Exception e) {
			e.printStackTrace();
			printData(response, "error");
		}
	 }
	
	
	/**
	 * 压力容器验收检查记录
	 */
	 @RequestMapping(value="/updateVesselCheckConclusion", method=RequestMethod.POST)
	 public void updateVesselCheckConclusion(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselCheckConclusionTest vesselCheckConclusionTest = CommonUtils.toBean(request.getParameterMap(), VesselCheckConclusionTest.class);
			prePrecess(request);
			vesselCheckConclusionTest.setId(vesselMaintain.getVesselCheckMaintain().getVesselCheckConclusionTest().getId());
			vesselCheckConclusionTestService.update(vesselCheckConclusionTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }
	 
	 
	/**
	 * 资料审查及外观检查记录
	 */
	 @RequestMapping(value="/updateVesselCheckTest", method=RequestMethod.POST)
	 public void updateVesselCheckTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselCheckTest vesselCheckTest = CommonUtils.toBean(request.getParameterMap(), VesselCheckTest.class);
			prePrecess(request);
			vesselCheckTest.setId(vesselMaintain.getVesselCheckMaintain().getVesselCheckTest().getId());
			vesselCheckTestService.update(vesselCheckTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }

	/**
	 * 压力容器年度检查结论记录
	 */
	 @RequestMapping(value="/updateVesselAnnualConclusion", method=RequestMethod.POST)
	 public void updateVesselAnnualConclusion(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselAnnualConclusionTest vesselAnnualConclusionTest = CommonUtils.toBean(request.getParameterMap(), VesselAnnualConclusionTest.class);
			prePrecess(request);
			vesselAnnualConclusionTest.setId(vesselMaintain.getVesselAnnualMaintain().getVesselAnnualConclusionTest().getId());
			String v_next_periodic_check = request.getParameter("v_next_periodic_check");
			String v_next_annual_check = request.getParameter("v_next_annual_check");
			VesselBasic vesselBasic = vesselMaintain.getVesselBasic();
			vesselBasic.setV_M_Next_Ann_Date(v_next_annual_check);
			vesselBasic.setV_M_Next_Date(v_next_periodic_check);
			vesselBasicService.update(vesselBasic);
			vesselAnnualConclusionTestService.update(vesselAnnualConclusionTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }
	 
	 
	/**
	 * 压力容器年度检查记录附页
	 */
	 @RequestMapping(value="/updateVesselAnnualTest", method=RequestMethod.POST)
	 public void updateVesselAnnualTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselAnnualTest vesselAnnualTest = CommonUtils.toBean(request.getParameterMap(), VesselAnnualTest.class);
			prePrecess(request);
			vesselAnnualTest.setId(vesselMaintain.getVesselAnnualMaintain().getVesselAnnualTest().getId());
			vesselAnnualTestService.update(vesselAnnualTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }

	 /**
	 * 压力容器宏观检验记录
	 */
	 @RequestMapping(value="/updateVesselMacroTest", method=RequestMethod.POST)
	 public void updateVesselMacroTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselMicroTest vesselMicroTest = CommonUtils.toBean(request.getParameterMap(), VesselMicroTest.class);
			prePrecess(request);
			vesselMicroTest.setId(vesselMaintain.getVesselPeriodicalMaintain().getVesselMicroTest().getId());
			vesselMicroTestService.update(vesselMicroTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }
	 
	 /**
	 * 壁厚测定记录
	 */
	 @RequestMapping(value="/updateVesselThiTest", method=RequestMethod.POST)
	 public void updateVesselThiTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselThiTest vesselThiTest = CommonUtils.toBean(request.getParameterMap(), VesselThiTest.class);
			prePrecess(request);
			String value = request.getParameter("v_Thi_Value");
			String realValue = adapterTheValue(value,5);
			vesselThiTest.setV_Thi_Value(realValue);
			vesselThiTest.setId(vesselMaintain.getVesselPeriodicalMaintain().getVesselThiTest().getId());
			vesselThiTestService.update(vesselThiTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }
	 
	 /**
	 * 壁厚校核记录
	 */
	 @RequestMapping(value="/updateVesselThiCheck", method=RequestMethod.POST)
	 public void updateVesselThiCheck(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselThiCheck vesselThiCheck = CommonUtils.toBean(request.getParameterMap(), VesselThiCheck.class);
			prePrecess(request);
			vesselThiCheck.setId(vesselMaintain.getVesselPeriodicalMaintain().getVesselThiCheck().getId());
			vesselThiCheckService.update(vesselThiCheck);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	 
	 
	 /**
	 * 射线检测记录
	 */
	 @RequestMapping(value="/updateVesselRayDetect", method=RequestMethod.POST)
	 public void updateVesselRadioTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselRadioTest vesselRadioTest = CommonUtils.toBean(request.getParameterMap(), VesselRadioTest.class);
			prePrecess(request);
			vesselRadioTest.setId(vesselMaintain.getVesselPeriodicalMaintain().getVesselRadioTest().getId());
			vesselRadioTestService.update(vesselRadioTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	 	 

	 /**
	 * 超声检测记录
	 */
	 @RequestMapping(value="/updateVesselUltrasonicTest", method=RequestMethod.POST)
	 public void updateVesselUltrasonicTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselUltrasonicTest vesselUltrasonicTest = CommonUtils.toBean(request.getParameterMap(), VesselUltrasonicTest.class);
			prePrecess(request);
			vesselUltrasonicTest.setId(vesselMaintain.getVesselPeriodicalMaintain().getVesselUltrasonicTest().getId());
			vesselUltrasonicTestService.update(vesselUltrasonicTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	 	
	 
	 /**
	 * 衍射时差法（TOFD）超声检测记录
	 */
	 @RequestMapping(value="/updateVesselTOFDTest", method=RequestMethod.POST)
	 public void updateVesselTOFDTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselTOFDTest vesselTOFDTest = CommonUtils.toBean(request.getParameterMap(), VesselTOFDTest.class);
			prePrecess(request);
			vesselTOFDTest.setId(vesselMaintain.getVesselPeriodicalMaintain().getVesselTOFDTest().getId());
			vesselTOFDTestService.update(vesselTOFDTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	
	 /**
	 * 磁粉检测记录
	 */
	 @RequestMapping(value="/updateVesselMagneticTest", method=RequestMethod.POST)
	 public void updateVesselMagneticTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselMagneticTest vesselMagneticTest = CommonUtils.toBean(request.getParameterMap(), VesselMagneticTest.class);
			prePrecess(request);
			vesselMagneticTest.setId(vesselMaintain.getVesselPeriodicalMaintain().getVesselMagneticTest().getId());
			vesselMagneticTestService.update(vesselMagneticTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	 
	 /**
	 * 渗透检测记录
	 */
	 @RequestMapping(value="/updateVesselPermTest", method=RequestMethod.POST)
	 public void updateVesselPermTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselPermTest vesselPermTest = CommonUtils.toBean(request.getParameterMap(), VesselPermTest.class);
			prePrecess(request);
			vesselPermTest.setId(vesselMaintain.getVesselPeriodicalMaintain().getVesselPermTest().getId());
			vesselPermTestService.update(vesselPermTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	 
	 
	 /**
	 * 声发射检测记录
	 */
	 @RequestMapping(value="/updateVesselSonciTest", method=RequestMethod.POST)
	 public void updateVesselSonciTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselSonciTest vesselSonciTest = CommonUtils.toBean(request.getParameterMap(), VesselSonciTest.class);
			prePrecess(request);
			vesselSonciTest.setId(vesselMaintain.getVesselPeriodicalMaintain().getVesselSonciTest().getId());
			vesselSonciTestService.update(vesselSonciTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	 
	 
	 /**
	 * 材料成分分析记录
	 */
	 @RequestMapping(value="/updateVesselMatTest", method=RequestMethod.POST)
	 public void updateVesselMatTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselMatTest vesselMatTest = CommonUtils.toBean(request.getParameterMap(), VesselMatTest.class);
			prePrecess(request);
			String v_Mat_Ele_1 = request.getParameter("v_Mat_Ele_1");
			String v_Mat_Ele_2 = request.getParameter("v_Mat_Ele_2");
			String v_Mat_Ele_3 = request.getParameter("v_Mat_Ele_3");
			String v_Mat_Ele_4 = request.getParameter("v_Mat_Ele_4");
			String v_Mat_Ele_5 = request.getParameter("v_Mat_Ele_5");
			String v_Mat_Ele_6 = request.getParameter("v_Mat_Ele_6");
			String v_Mat_Ele_7 = request.getParameter("v_Mat_Ele_7");
			String v_Mat_Ele_8 = request.getParameter("v_Mat_Ele_8");
			String v_Mat_Ele = ","+v_Mat_Ele_1+","+v_Mat_Ele_2+","+v_Mat_Ele_3+","+v_Mat_Ele_4+","+v_Mat_Ele_5+","+v_Mat_Ele_6+","+v_Mat_Ele_7+","+v_Mat_Ele_8;
			vesselMatTest.setV_Mat_Ele(v_Mat_Ele);
			vesselMatTest.setId(vesselMaintain.getVesselPeriodicalMaintain().getVesselMatTest().getId());
			vesselMatTestService.update(vesselMatTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	 
	 
	 /**
	 * 硬度检测记录
	 */
	 @RequestMapping(value="/updateVesselHardTest", method=RequestMethod.POST)
	 public void updateVesselHardTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselHardTest vesselHardTest = CommonUtils.toBean(request.getParameterMap(), VesselHardTest.class);
			prePrecess(request);
			vesselHardTest.setId(vesselMaintain.getVesselPeriodicalMaintain().getVesselHardTest().getId());
			vesselHardTestService.update(vesselHardTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	 
	 
	 /**
	 * 	金相分析记录
	 */
	 @RequestMapping(value="/updateVesselMetTest", method=RequestMethod.POST)
	 public void updateVesselMetTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselMetTest vesselMetTest = CommonUtils.toBean(request.getParameterMap(), VesselMetTest.class);
			prePrecess(request);
			vesselMetTest.setId(vesselMaintain.getVesselPeriodicalMaintain().getVesselMetTest().getId());
			vesselMetTestService.update(vesselMetTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	 
	 /**
	 * 	安全附件检验记录
	 */
	 @RequestMapping(value="/updateVesselSPDTest", method=RequestMethod.POST)
	 public void updateVesselSPDTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselSPDTest vesselSPDTest = CommonUtils.toBean(request.getParameterMap(), VesselSPDTest.class);
			prePrecess(request);
			vesselSPDTest.setId(vesselMaintain.getVesselPeriodicalMaintain().getVesselSPDTest().getId());
			vesselSPDTestService.update(vesselSPDTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	 
	 
	 /**
	 * 	耐压试验记录
	 */
	 @RequestMapping(value="/updateVesselPreTest", method=RequestMethod.POST)
	 public void updateVesselPreTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselPreTest vesselPreTest = CommonUtils.toBean(request.getParameterMap(), VesselPreTest.class);
			prePrecess(request);
			vesselPreTest.setId(vesselMaintain.getVesselPeriodicalMaintain().getVesselPreTest().getId());
			vesselPreTestService.update(vesselPreTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	 
	 
	 /**
	 * 	气密性试验记录
	 */
	 @RequestMapping(value="/updateVesselAirTest", method=RequestMethod.POST)
	 public void updateVesselAirTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselAirTest vesselAirTest = CommonUtils.toBean(request.getParameterMap(), VesselAirTest.class);
			prePrecess(request);
			vesselAirTest.setId(vesselMaintain.getVesselPeriodicalMaintain().getVesselAirTest().getId());
			vesselAirTestService.update(vesselAirTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	 
	 
	 /**
	 * 	氨检漏试验记录
	 */
	 @RequestMapping(value="/updateVesselAmmoniaTest", method=RequestMethod.POST)
	 public void updateVesselAmmoniaTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselAmmoniaTest vesselAmmoniaTest = CommonUtils.toBean(request.getParameterMap(), VesselAmmoniaTest.class);
			prePrecess(request);
			vesselAmmoniaTest.setId(vesselMaintain.getVesselPeriodicalMaintain().getVesselAmmoniaTest().getId());
			vesselAmmoniaTestService.update(vesselAmmoniaTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	 
	 /**
	 * 	氦、卤素检漏试验记录
	 */
	 @RequestMapping(value="/updateVesselHeTest", method=RequestMethod.POST)
	 public void updateVesselHeTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselHeTest vesselHeTest = CommonUtils.toBean(request.getParameterMap(), VesselHeTest.class);
			prePrecess(request);
			vesselHeTest.setId(vesselMaintain.getVesselPeriodicalMaintain().getVesselHeTest().getId());
			vesselHeTestService.update(vesselHeTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	 
	 
	 /**
	 * 	附加检验记录
	 */
	 @RequestMapping(value="/updateVesselAddTest", method=RequestMethod.POST)
	 public void updateVesselAddTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselAddTest vesselAddTest = CommonUtils.toBean(request.getParameterMap(), VesselAddTest.class);
			prePrecess(request);
			vesselAddTest.setId(vesselMaintain.getVesselPeriodicalMaintain().getVesselAddTest().getId());
			vesselAddTestService.update(vesselAddTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	 
	 
	 /**
	 * 	
	 */
	 @RequestMapping(value="/updateVesselPlasticLinerTest", method=RequestMethod.POST)
	 public void updateVesselPlasticLinerTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselPlasticLinerTest vesselPlasticLinerTest = CommonUtils.toBean(request.getParameterMap(), VesselPlasticLinerTest.class);
			prePrecess(request);
			vesselPlasticLinerTest.setId(vesselMaintain.getVesselPeriodicalMaintain().getVesselPlasticLinerTest().getId());
			vesselPlasticLinerTestService.update(vesselPlasticLinerTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	 
	 
	 /**
	 * 	
	 */
	 @RequestMapping(value="/updateVesselPlasticTest", method=RequestMethod.POST)
	 public void updateVesselPlasticTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselPlasticTest vesselPlasticTest = CommonUtils.toBean(request.getParameterMap(), VesselPlasticTest.class);
			prePrecess(request);
			vesselPlasticTest.setId(vesselMaintain.getVesselPeriodicalMaintain().getVesselPlasticTest().getId());
			vesselPlasticTestService.update(vesselPlasticTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	 
	 
	 /**
	 * 	
	 */
	 @RequestMapping(value="/updateVesselGlassSteelLinerTest", method=RequestMethod.POST)
	 public void updateVesselGlassSteelLinerTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselGlassSteelLinerTest vesselGlassSteelLinerTest = CommonUtils.toBean(request.getParameterMap(), VesselGlassSteelLinerTest.class);
			prePrecess(request);
			vesselGlassSteelLinerTest.setId(vesselMaintain.getVesselPeriodicalMaintain().getVesselGlassSteelLinerTest().getId());
			vesselGlassSteelLinerTestService.update(vesselGlassSteelLinerTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	 
	 
	 /**
	 * 	
	 */
	 @RequestMapping(value="/updateVesselGlassSteelTest", method=RequestMethod.POST)
	 public void updateVesselGlassSteelTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselGlassSteelTest vesselGlassSteelTest = CommonUtils.toBean(request.getParameterMap(), VesselGlassSteelTest.class);
			prePrecess(request);
			vesselGlassSteelTest.setId(vesselMaintain.getVesselPeriodicalMaintain().getVesselGlassSteelTest().getId());
			vesselGlassSteelTestService.update(vesselGlassSteelTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	 
	 
	 /**
	 * 	
	 */
	 @RequestMapping(value="/updateVesselGlassTest", method=RequestMethod.POST)
	 public void updateVesselGlassTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselGlassTest vesselGlassTest = CommonUtils.toBean(request.getParameterMap(), VesselGlassTest.class);
			prePrecess(request);
			vesselGlassTest.setId(vesselMaintain.getVesselPeriodicalMaintain().getVesselGlassTest().getId());
			vesselGlassTestService.update(vesselGlassTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	 
	 
	 /**
	 * 	
	 */
	 @RequestMapping(value="/updateVesselGraphiteLinerTest", method=RequestMethod.POST)
	 public void updateVesselGraphiteLinerTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselGraphiteLinerTest vesselGraphiteLinerTest = CommonUtils.toBean(request.getParameterMap(), VesselGraphiteLinerTest.class);
			prePrecess(request);
			vesselGraphiteLinerTest.setId(vesselMaintain.getVesselPeriodicalMaintain().getVesselGraphiteLinerTest().getId());
			vesselGraphiteLinerTestService.update(vesselGraphiteLinerTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	
	 
	 /**
	 * 	
	 */
	 @RequestMapping(value="/updateVesselGraphiteTest", method=RequestMethod.POST)
	 public void updateVesselGraphiteTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselGraphiteTest vesselGraphiteTest = CommonUtils.toBean(request.getParameterMap(), VesselGraphiteTest.class);
			prePrecess(request);
			vesselGraphiteTest.setId(vesselMaintain.getVesselPeriodicalMaintain().getVesselGraphiteTest().getId());
			vesselGraphiteTestService.update(vesselGraphiteTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	
	 /**
	 * 	
	 */
	 @RequestMapping(value="/updateVesselConclusionTest", method=RequestMethod.POST)
	 public void updateVesselConclusionTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselConclusionTest vesselConclusionTest = CommonUtils.toBean(request.getParameterMap(), VesselConclusionTest.class);
			prePrecess(request);
			vesselConclusionTest.setId(vesselMaintain.getVesselPeriodicalMaintain().getVesselConclusionTest().getId());
			vesselConclusionTestService.update(vesselConclusionTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	 
	 /**
	 * 上传月度检验
	 */
	 @RequestMapping(value="/updateVesselMonthlyCheck", method=RequestMethod.POST)
	 public void updateVesselMonthlyCheck(HttpServletRequest request, HttpServletResponse response) {
		 try {
			VesselMonthlyInspection vesselMonthlyInspection = CommonUtils.toBean(request.getParameterMap(), VesselMonthlyInspection.class);
			String v_Product_Id = request.getParameter("scan_Tag_ID");
			VesselBasic vesselBasic = vesselBasicService.getByProductId(v_Product_Id);
			vesselMonthlyInspection.setVesselBasic(vesselBasic);
			vesselMonthlyInspectionService.save(vesselMonthlyInspection);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	 
	 
 	private void printData(HttpServletResponse response, String msg) {
        try {
         response.setContentType("text/html;charset=utf-8");
            response.setCharacterEncoding("UTF-8");
            PrintWriter out = new PrintWriter(new OutputStreamWriter(response.getOutputStream(), "UTF-8"));
            out.println(msg);
            out.close();
        } catch (Exception e) {  
            e.printStackTrace();  
        }
    }
 	
	private String adapterTheValue(String value, int col) {
		String[] array = value.split(";");
		String realValue="";
		for (int i = 0; i < array.length; i++) {
			if ((i+1)%col==0) {
				realValue+=array[i]+";";
			}else {
				realValue+=array[i]+",";
			}
		}
		realValue=realValue.substring(0, realValue.length()-1);
		return realValue;
	}
 	
 	private void prePrecess(HttpServletRequest request){
 		String mid = request.getParameter("scan_Mission_ID");
 		if (vesselMaintain.getV_M_Massion_ID()!=mid) {
 			vesselMaintain = vesselMaintainService.findByMissionId(mid);
		}
 	};
 	
}