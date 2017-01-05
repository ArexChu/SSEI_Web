package cn.ecust.ssei.rest;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.ecust.ssei.domain.pipe.pipeinstall.PIBasic;
import cn.ecust.ssei.domain.pipe.pipeinstall.PICheckInf;
import cn.ecust.ssei.domain.pipe.pipeinstall.PIComInf;
import cn.ecust.ssei.domain.pipe.pipeinstall.PIConclusion;
import cn.ecust.ssei.domain.pipe.pipeinstall.PILeftProblem;
import cn.ecust.ssei.domain.pipe.pipeinstall.PIReview;
import cn.ecust.ssei.domain.pipe.pipeinstall.PISafeCheck;
import cn.ecust.ssei.domain.pipe.pipeinstall.PISafeCheck1;
import cn.ecust.ssei.domain.pipe.pipeinstall.PISafeCheck2;
import cn.ecust.ssei.domain.pipe.pipeinstall.PISafeCheck3;
import cn.ecust.ssei.domain.pipe.pipeinstall.PipeCompleteInf;
import cn.ecust.ssei.domain.pipe.pipeinstall.PipeInstall;
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
import cn.ecust.ssei.util.BeanUtils;
import cn.itcast.commons.CommonUtils;
@Controller
@RequestMapping("/pipeInstall")   
public class RestFulPipeInstallAction{
	
	@Resource
	private PIBasicService piBasicService;
	@Resource
	private PICheckInfService piCheckInfService;
	@Resource
	private PIComInfService piComInfService;
	@Resource
	private PIConclusionService piConclusionService;
	@Resource
	private PILeftProblemService piLeftProblemService;
	@Resource
	private PipeCompleteInfService pipeCompleteInfService;
	@Resource
	private PIReviewService piReviewService;
	@Resource
	private PISafeCheck1Service piSafeCheck1Service;
	@Resource
	private PISafeCheck2Service piSafeCheck2Service;
	@Resource
	private PISafeCheck3Service piSafeCheck3Service;
	@Resource
	private PISafeCheckService piSafeCheckService;
	@Resource
	private PipeInstallService pipeInstallService;

	private PipeInstall pipeInstall = new PipeInstall();

	
	 /**
	 * 工业管道安装安全质量监督检验结论记录
	 */
	 @RequestMapping(value="/updatePipeInstallConclusion", method=RequestMethod.POST)
	 public void updatePipeInstallConclusion(HttpServletRequest request, HttpServletResponse response) {
		 try {
			PIConclusion piConclusion = CommonUtils.toBean(request.getParameterMap(), PIConclusion.class);
			prePrecess(request);
			piConclusion.setId(pipeInstall.getPiConclusion().getId());
			piConclusionService.update(piConclusion);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	

	 /**
	 * 监督检验的工业管道基本情况记录
	 */
	 @RequestMapping(value="/updatePipeInstallBasic", method=RequestMethod.POST)
	 public void updatePipeInstallBasic(HttpServletRequest request, HttpServletResponse response) {
		 try {
			PIBasic piBasic = CommonUtils.toBean(request.getParameterMap(), PIBasic.class);
			prePrecess(request);
			piBasic.setId(pipeInstall.getPiBasic().getId());
			piBasicService.update(piBasic);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	

	 /**
	 * 监督检验的工作内容及工作基本情况记录
	 */
	 @RequestMapping(value="/updatePipeInstallCheckInf", method=RequestMethod.POST)
	 public void updatePipeInstallCheckInf(HttpServletRequest request, HttpServletResponse response) {
		 try {
			PICheckInf piCheckInf = CommonUtils.toBean(request.getParameterMap(), PICheckInf.class);
			prePrecess(request);
			piCheckInf.setId(pipeInstall.getPiCheckInf().getId());
			piCheckInfService.update(piCheckInf);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	
	 /**
	 * 对相关单位安全质量管理行为的评价记录
	 */
	 @RequestMapping(value="/updatePipeInstallComInf", method=RequestMethod.POST)
	 public void updatePipeInstallComInf(HttpServletRequest request, HttpServletResponse response) {
		 try {
			PIComInf piComInf = CommonUtils.toBean(request.getParameterMap(), PIComInf.class);
			prePrecess(request);
			piComInf.setId(pipeInstall.getPiComInf().getId());
			piComInfService.update(piComInf);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	 
	 /**
	 * 工业管道安装安全质量监督检验记录(工业管道元件及焊接材料的材质审查记录)
	 */
	 @RequestMapping(value="/updatePISafeCheck", method=RequestMethod.POST)
	 public void updatePISafeCheck(HttpServletRequest request, HttpServletResponse response) {
		 try {
			prePrecess(request);
			PISafeCheck piSafeCheck =pipeInstall.getPiSafeCheck();
			String pi_Wel_Ma = request.getParameter("pi_Wel_Ma");
			pi_Wel_Ma = pi_Wel_Ma.replace("null", "");
			if (pi_Wel_Ma!=null&&!pi_Wel_Ma.isEmpty()) {
				String[] array = pi_Wel_Ma.split(";");
				int length = array.length>10?10: array.length;
				for (int i = 0; i < length; i++) {
					String name =  "pi_Wel_Ma_"+(i+1);
					BeanUtils.invokeSet(piSafeCheck, name, array[i]);
				}
			}
			piSafeCheck.setPi_SafeChe_Remark(request.getParameter("pi_SafeChe_Remark"));
			piSafeCheck.setPi_SafeChe_Per(request.getParameter("pi_SafeChe_Per"));
			piSafeCheck.setPi_SafeChe_Date(request.getParameter("pi_SafeChe_Date"));
			piSafeCheckService.update(piSafeCheck);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	 
	 /**
		 * 工业管道安装安全质量监督检验记录(工业管道焊接质量抽查记录)
		 */
		 @RequestMapping(value="/updatePISafeCheck1", method=RequestMethod.POST)
		 public void updatePISafeCheck1(HttpServletRequest request, HttpServletResponse response) {
			 try {
				prePrecess(request);
				PISafeCheck piSafeCheck =pipeInstall.getPiSafeCheck();
				String pi_Wel_Qua = request.getParameter("pi_Wel_Qua");
				pi_Wel_Qua = pi_Wel_Qua.replace("null", "");
				if (pi_Wel_Qua!=null&&!pi_Wel_Qua.isEmpty()) {
					String[] array = pi_Wel_Qua.split(";");
					int length = array.length>8?8: array.length;
					for (int i = 0; i < length; i++) {
						String name =  "pi_Wel_Qua_"+(i+1);
						BeanUtils.invokeSet(piSafeCheck, name, array[i]);
					}
				}
				piSafeCheck.setPi_SafeChe_Remark(request.getParameter("pi_SafeChe1_Remark"));
				piSafeCheck.setPi_SafeChe_Per(request.getParameter("pi_SafeChe1_Per"));
				piSafeCheck.setPi_SafeChe_Date(request.getParameter("pi_SafeChe1_Date"));
				piSafeCheckService.update(piSafeCheck);
				printData(response, "success");
			} catch (Exception e) {
				printData(response, "error");
			}
		 }	
	 
	 /**
	 * 工业管道安装安全质量监督检验记录(续一)工业管道补偿器和热传导支承件安装质量抽查记录
	 */
	 @RequestMapping(value="/updatePISafeCheck2", method=RequestMethod.POST)
	 public void updatePISafeCheck2(HttpServletRequest request, HttpServletResponse response) {
		 try {
			prePrecess(request);
			PISafeCheck1 piSafeCheck1 =pipeInstall.getPiSafeCheck1();
			String pi_Compen = request.getParameter("pi_Compen");
			pi_Compen = pi_Compen.replace("null", "");
			if (pi_Compen!=null&&!pi_Compen.isEmpty()) {
				String[] array = pi_Compen.split(";");
				int length = array.length>5?5: array.length;
				for (int i = 0; i < length; i++) {
					String name =  "pi_Compen_"+(i+1);
					BeanUtils.invokeSet(piSafeCheck1, name, array[i]);
				}
			}
			piSafeCheck1.setPi_SafeChe1_Remark(request.getParameter("pi_SafeChe2_Remark"));
			piSafeCheck1.setPi_SafeChe1_Per(request.getParameter("pi_SafeChe2_Per"));
			piSafeCheck1.setPi_SafeChe1_Date(request.getParameter("pi_SafeChe2_Date"));
			piSafeCheck1Service.update(piSafeCheck1);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	 
	 /**
	 * 工业管道安装安全质量监督检验记录(续一)工业管道附属设施和设备安装质量抽查记录
	 */
	 @RequestMapping(value="/updatePISafeCheck3", method=RequestMethod.POST)
	 public void updatePISafeCheck3(HttpServletRequest request, HttpServletResponse response) {
		 try {
			prePrecess(request);
			PISafeCheck1 piSafeCheck1 =pipeInstall.getPiSafeCheck1();
			String pi_Appurt = request.getParameter("pi_Appurt");
			pi_Appurt = pi_Appurt.replace("null", "");
			if (pi_Appurt!=null&&!pi_Appurt.isEmpty()) {
				String[] array = pi_Appurt.split(";");
				int length = array.length>5?5: array.length;
				for (int i = 0; i < length; i++) {
					String name =  "pi_Appurt_"+(i+1);
					BeanUtils.invokeSet(piSafeCheck1, name, array[i]);
				}
			}
			piSafeCheck1.setPi_SafeChe1_Remark(request.getParameter("pi_SafeChe3_Remark"));
			piSafeCheck1.setPi_SafeChe1_Per(request.getParameter("pi_SafeChe3_Per"));
			piSafeCheck1.setPi_SafeChe1_Date(request.getParameter("pi_SafeChe3_Date"));
			piSafeCheck1Service.update(piSafeCheck1);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	 
	 /**
	 * 工业管道安装安全质量监督检验记录(续一)工业管道附属设施和设备安装质量抽查记录
	 */
	 @RequestMapping(value="/updatePISafeCheck4", method=RequestMethod.POST)
	 public void updatePISafeCheck4(HttpServletRequest request, HttpServletResponse response) {
		 try {
			prePrecess(request);
			PISafeCheck1 piSafeCheck1 =pipeInstall.getPiSafeCheck1();
			String pi_Cross = request.getParameter("pi_Cross");
			pi_Cross = pi_Cross.replace("null", "");
			if (pi_Cross!=null&&!pi_Cross.isEmpty()) {
				String[] array = pi_Cross.split(";");
				int length = array.length>5?5: array.length;
				for (int i = 0; i < length; i++) {
					String name =  "pi_Cross_"+(i+1);
					BeanUtils.invokeSet(piSafeCheck1, name, array[i]);
				}
			}
			piSafeCheck1.setPi_SafeChe1_Remark(request.getParameter("pi_SafeChe4_Remark"));
			piSafeCheck1.setPi_SafeChe1_Per(request.getParameter("pi_SafeChe4_Per"));
			piSafeCheck1.setPi_SafeChe1_Date(request.getParameter("pi_SafeChe4_Date"));
			piSafeCheck1Service.update(piSafeCheck1);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	 
	 /**
	 * 工业管道安装安全质量监督检验记录(续2) 工业管道防腐、绝热施工质量抽查记录
	 */
	 @RequestMapping(value="/updatePISafeCheck5", method=RequestMethod.POST)
	 public void updatePISafeCheck5(HttpServletRequest request, HttpServletResponse response) {
		 try {
				prePrecess(request);
				PISafeCheck2 piSafeCheck2 =pipeInstall.getPiSafeCheck2();
				String pi_InsPro = request.getParameter("pi_InsPro");
				pi_InsPro = pi_InsPro.replace("null", "");
				if (pi_InsPro!=null&&!pi_InsPro.isEmpty()) {
					String[] array = pi_InsPro.split(";");
					int length = array.length>10?10: array.length;
					for (int i = 0; i < length; i++) {
						String name =  "pi_InsPro_"+(i+1);
						BeanUtils.invokeSet(piSafeCheck2, name, array[i]);
					}
				}
				piSafeCheck2.setPi_SafeChe2_Remark(request.getParameter("pi_SafeChe5_Remark"));
				piSafeCheck2.setPi_SafeChe2_Per(request.getParameter("pi_SafeChe5_Per"));
				piSafeCheck2.setPi_SafeChe2_Date(request.getParameter("pi_SafeChe5_Date"));
				piSafeCheck2Service.update(piSafeCheck2);
				printData(response, "success");
			} catch (Exception e) {
				printData(response, "error");
			}
	 }
	 
	 /**
	 * 工业管道安装安全质量监督检验记录(续2) 工业管道通球、扫线、干燥质量审查记录
	 */
	 @RequestMapping(value="/updatePISafeCheck6", method=RequestMethod.POST)
	 public void updatePISafeCheck6(HttpServletRequest request, HttpServletResponse response) {
		 try {
				prePrecess(request);
				PISafeCheck2 piSafeCheck2 =pipeInstall.getPiSafeCheck2();
				String pi_Dry = request.getParameter("pi_Dry");
				pi_Dry = pi_Dry.replace("null", "");
				if (pi_Dry!=null&&!pi_Dry.isEmpty()) {
					String[] array = pi_Dry.split(";");
					int length = array.length>8?8: array.length;
					for (int i = 0; i < length; i++) {
						String name =  "pi_Dry_"+(i+1);
						BeanUtils.invokeSet(piSafeCheck2, name, array[i]);
					}
				}
				piSafeCheck2.setPi_SafeChe2_Remark(request.getParameter("pi_SafeChe6_Remark"));
				piSafeCheck2.setPi_SafeChe2_Per(request.getParameter("pi_SafeChe6_Per"));
				piSafeCheck2.setPi_SafeChe2_Date(request.getParameter("pi_SafeChe6_Date"));
				piSafeCheck2Service.update(piSafeCheck2);
				printData(response, "success");
			} catch (Exception e) {
				printData(response, "error");
			}
	 }
	 
	 
	 /**
	 * 工业管道安装安全质量监督检验记录(续3) 工业管道强度试验、泄漏性试验记录
	 */
	 @RequestMapping(value="/updatePISafeCheck7", method=RequestMethod.POST)
	 public void updatePISafeCheck7(HttpServletRequest request, HttpServletResponse response) {
		 try {
				prePrecess(request);
				PISafeCheck3 piSafeCheck3 =pipeInstall.getPiSafeCheck3();
				String pi_Leak = request.getParameter("pi_Leak");
				pi_Leak = pi_Leak.replace("null", "");
				if (pi_Leak!=null&&!pi_Leak.isEmpty()) {
					String[] array = pi_Leak.split(";");
					int length = array.length>8?8: array.length;
					for (int i = 0; i < length; i++) {
						String name =  "pi_Leak_"+(i+1);
						BeanUtils.invokeSet(piSafeCheck3, name, array[i]);
					}
				}
				piSafeCheck3.setPi_SafeChe3_Remark(request.getParameter("pi_SafeChe7_Remark"));
				piSafeCheck3.setPi_SafeChe3_Per(request.getParameter("pi_SafeChe7_Per"));
				piSafeCheck3.setPi_SafeChe3_Date(request.getParameter("pi_SafeChe7_Date"));
				piSafeCheck3Service.update(piSafeCheck3);
				printData(response, "success");
			} catch (Exception e) {
				printData(response, "error");
			}
	 }
	 
	 /**
	 * 工业管道安装安全质量监督检验记录(续3)工业管道安全保护装置检查记录
	 */
	 @RequestMapping(value="/updatePISafeCheck8", method=RequestMethod.POST)
	 public void updatePISafeCheck8(HttpServletRequest request, HttpServletResponse response) {
		 try {
				prePrecess(request);
				PISafeCheck3 piSafeCheck3 =pipeInstall.getPiSafeCheck3();
				String pi_SafeEqu = request.getParameter("pi_SafeEqu");
				pi_SafeEqu = pi_SafeEqu.replace("null", "");
				if (pi_SafeEqu!=null&&!pi_SafeEqu.isEmpty()) {
					String[] array = pi_SafeEqu.split(";");
					int length = array.length>8?8: array.length;
					for (int i = 0; i < length; i++) {
						String name =  "pi_SafeEqu_"+(i+1);
						BeanUtils.invokeSet(piSafeCheck3, name, array[i]);
					}
				}
				piSafeCheck3.setPi_SafeChe3_Remark(request.getParameter("pi_SafeChe8_Remark"));
				piSafeCheck3.setPi_SafeChe3_Per(request.getParameter("pi_SafeChe8_Per"));
				piSafeCheck3.setPi_SafeChe3_Date(request.getParameter("pi_SafeChe8_Date"));
				piSafeCheck3Service.update(piSafeCheck3);
				printData(response, "success");
			} catch (Exception e) {
				printData(response, "error");
			}
	 }
	 
	 /**
	 * 工业管道安装竣工资料审查报告记录
	 */
	 @RequestMapping(value="/updatePipeCompleteInf", method=RequestMethod.POST)
	 public void updatePipeCompleteInf(HttpServletRequest request, HttpServletResponse response) {
		 try {
			PipeCompleteInf pipeCompleteInf = CommonUtils.toBean(request.getParameterMap(), PipeCompleteInf.class);
			prePrecess(request);
			pipeCompleteInf.setId(pipeInstall.getPipeCompleteInf().getId());
			pipeCompleteInfService.update(pipeCompleteInf);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }
	
	 
	 /**
	 * 遗留质量问题的处理意见记录
	 */
	 @RequestMapping(value="/updatePILeftProblem", method=RequestMethod.POST)
	 public void updatePILeftProblem(HttpServletRequest request, HttpServletResponse response) {
		 try {
			PILeftProblem piLeftProblem = CommonUtils.toBean(request.getParameterMap(), PILeftProblem.class);
			prePrecess(request);
			piLeftProblem.setId(pipeInstall.getPiLeftProblem().getId());
			piLeftProblemService.update(piLeftProblem);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }
	
	 /**
	 * 压力管道底片复审记录表
	 */
	 @RequestMapping(value="/updatePIReview", method=RequestMethod.POST)
	 public void updatePIReview(HttpServletRequest request, HttpServletResponse response) {
		 try {
			PIReview piReview = CommonUtils.toBean(request.getParameterMap(), PIReview.class);
			prePrecess(request);
			piReview.setId(pipeInstall.getPiReview().getId());
			piReviewService.update(piReview);
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
 	
 	private void prePrecess(HttpServletRequest request){
 		String pi_id = request.getParameter("scan_Mission_ID");
 		if (pipeInstall.getPi_ID()!=pi_id) {
 			pipeInstall = pipeInstallService.findByPIId(pi_id);
		}
 	};
 	
}