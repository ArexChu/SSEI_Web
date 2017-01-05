package cn.ecust.ssei.rest;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.ecust.ssei.domain.pipe.PipeBasic;
import cn.ecust.ssei.domain.pipe.PipeMaintain;
import cn.ecust.ssei.domain.pipe.PipeMonthlyInspection;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeAssTable;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeHardTest;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeLeakTest;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeMetTest;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeMicroTest;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipePreTest;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeSPDTest;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeThiTest;
import cn.ecust.ssei.domain.pipe.pipeonlinemaintain.PipeOnlineSubTest;
import cn.ecust.ssei.domain.pipe.pipeonlinemaintain.PipeOnlineThiTest;
import cn.ecust.ssei.domain.vo.PipeBasicVo;
import cn.ecust.ssei.domain.vo.formatter.PipeBasicFormatter;
import cn.ecust.ssei.service.pipe.PipeBasciService;
import cn.ecust.ssei.service.pipe.PipeMaintainService;
import cn.ecust.ssei.service.pipe.PipeMonthlyInspectionService;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipeAssTableService;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipeHardTestService;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipeLeakTestService;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipeMetTestService;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipeMicroTestService;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipePreTestService;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipeSPDTestService;
import cn.ecust.ssei.service.pipe.pipedetailmaintain.PipeThiTestService;
import cn.ecust.ssei.service.pipe.pipeonlinemaintain.PipeOnlineSubTestService;
import cn.ecust.ssei.service.pipe.pipeonlinemaintain.PipeOnlineThiTestService;
import cn.itcast.commons.CommonUtils;
@Controller
@RequestMapping("/pipe")   
public class RestFulPipeAction{
	
	@Autowired
	private PipeBasciService pipeBasciService;
	@Autowired
	private PipeMaintainService pipeMaintainService;
	@Autowired
	private PipeMicroTestService pipeMicroTestService;
	@Autowired
	private PipeSPDTestService pipeSPDTestService;
	@Autowired
	private PipeThiTestService pipeThiTestService;
	@Autowired
	private PipeHardTestService pipeHardTestService;
	@Autowired
	private PipeMetTestService pipeMetTestService;
	@Autowired
	private PipePreTestService pipePreTestService;
	@Autowired
	private PipeLeakTestService pipeLeakTestService;
	@Autowired
	private PipeAssTableService pipeAssTableService;
	@Autowired
	private PipeOnlineSubTestService pipeOnlineSubTestService;
	@Autowired
	private PipeOnlineThiTestService pipeOnlineThiTestService;
	@Autowired
	private PipeMonthlyInspectionService pipeMonthlyInspectionService;


	private PipeMaintain pipeMaintain = new PipeMaintain();
	
	/**
	 * 上传压力管道基础信息
	 */
	 @RequestMapping(value="/updatePipeInfo", method=RequestMethod.POST)
	 public void updateVesselInfo(HttpServletRequest request, HttpServletResponse response) {
		 try {
			PipeBasicVo pipeBasicVo = CommonUtils.toBean(request.getParameterMap(), PipeBasicVo.class);
			PipeBasic pipeBasicTemp = PipeBasicFormatter.formatter(pipeBasicVo);
		 	String mid = request.getParameter("scan_Tag_ID") ;
		 	PipeBasic pipeBasic = pipeBasciService.getByPipeSysIdAndType(mid, "2");
		 	pipeBasicTemp.setId(pipeBasic.getId());
		 	pipeBasicTemp.setCompany(pipeBasic.getCompany());
		 	pipeBasicTemp.setP_checkType("2");
		 	pipeBasicTemp.setP_submited("2");
		 	pipeBasicTemp.setP_Pre_date(pipeBasic.getP_Pre_date());
		 	pipeBasicTemp.setP_Pre_Id(pipeBasic.getP_Pre_Id());
		 	pipeBasciService.update(pipeBasicTemp);
			printData(response, "success");
		} catch (Exception e) {
			e.printStackTrace();
			printData(response, "error");
		}
	 }
	
	
	/**
	 * 上传管道宏观检验信息
	 */
	 @RequestMapping(value="/updatePipeMacroTest", method=RequestMethod.POST)
	 public void updatePipeMacroTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			PipeMicroTest pipeMicroTest = CommonUtils.toBean(request.getParameterMap(), PipeMicroTest.class);
			prePrecess(request);
			pipeMicroTest.setId(pipeMaintain.getPipeDetailMaintain().getPipeMicroTest().getId());
			pipeMicroTestService.update(pipeMicroTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }
	 
	 
 	/**
	 * 上传管道安全保护装置检验信息
	 */
	 @RequestMapping(value="/updatePipeSPDTest", method=RequestMethod.POST)
	 public void updatePipeSPDTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			PipeSPDTest pipesSpdTest = CommonUtils.toBean(request.getParameterMap(), PipeSPDTest.class);
			prePrecess(request);
			pipesSpdTest.setId(pipeMaintain.getPipeDetailMaintain().getPipeSPDTest().getId());
			pipeSPDTestService.update(pipesSpdTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }
	 
	 
	 /**
	 * 上传管道测厚检查检验信息
	 */
	 @RequestMapping(value="/updatePipeThiCheck", method=RequestMethod.POST)
	 public void updatePipeThiTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			PipeThiTest pipeThiTest = CommonUtils.toBean(request.getParameterMap(), PipeThiTest.class);
			prePrecess(request);
			pipeThiTest.setId(pipeMaintain.getPipeDetailMaintain().getPipeThiTest().getId());
			String value = request.getParameter("p_Thi_Value");
			String realValue = adapterTheValue(value,4);
			pipeThiTest.setP_Thi_Value(realValue);
			pipeThiTestService.update(pipeThiTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }
	 
	 /**
	 * 上传管道硬度检查检验信息
	 */
	 @RequestMapping(value="/updatePipeHardTest", method=RequestMethod.POST)
	 public void updatePipeHardTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			PipeHardTest pipeHardTest = CommonUtils.toBean(request.getParameterMap(), PipeHardTest.class);
			prePrecess(request);
			pipeHardTest.setId(pipeMaintain.getPipeDetailMaintain().getPipeHardTest().getId());
			pipeHardTestService.update(pipeHardTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	 
	 
	 
	 /**
	 * 上传管道金相检查检验信息
	 */
	 @RequestMapping(value="/updatePipeMetTest", method=RequestMethod.POST)
	 public void updatePipeMetTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			PipeMetTest pipeMetTest = CommonUtils.toBean(request.getParameterMap(), PipeMetTest.class);
			prePrecess(request);
			pipeMetTest.setId(pipeMaintain.getPipeDetailMaintain().getPipeMetTest().getId());
			pipeMetTestService.update(pipeMetTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }
	 
	 /**
	 * 上传管道压力检查检验信息
	 */
	 @RequestMapping(value="/updatePipePreTest", method=RequestMethod.POST)
	 public void updatePipePreTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			PipePreTest pipePreTest = CommonUtils.toBean(request.getParameterMap(), PipePreTest.class);
			prePrecess(request);
			pipePreTest.setId(pipeMaintain.getPipeDetailMaintain().getPipePreTest().getId());
			pipePreTestService.update(pipePreTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	 
	 
	 
	 /**
	 * 上传管道压力泄漏性试验检验信息
	 */
	 @RequestMapping(value="/updatePipeLeakTest", method=RequestMethod.POST)
	 public void updatePipeLeakTest(HttpServletRequest request, HttpServletResponse response) {
		 try {
			PipeLeakTest pipeLeakTest = CommonUtils.toBean(request.getParameterMap(), PipeLeakTest.class);
			prePrecess(request);
			pipeLeakTest.setId(pipeMaintain.getPipeDetailMaintain().getPipeLeakTest().getId());
			pipeLeakTestService.update(pipeLeakTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }		 
	 

	 /**
	 * 上传管道等级评定结果汇总表信息
	 */
	 @RequestMapping(value="/updatePipeAssTable", method=RequestMethod.POST)
	 public void updatePipeAssTable(HttpServletRequest request, HttpServletResponse response) {
		 try {
			PipeAssTable pipeAssTable = CommonUtils.toBean(request.getParameterMap(), PipeAssTable.class);
			prePrecess(request);
			pipeAssTable.setId(pipeMaintain.getPipeDetailMaintain().getPipeAssTable().getId());
			pipeAssTableService.update(pipeAssTable);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }		 
	 
	 
	 /**
	 * 上传在用工业管道在线检验记录（1）
	 */
	 @RequestMapping(value="/updatePipeOnlineSubCheck", method=RequestMethod.POST)
	 public void updatePipeOnlineSubCheck(HttpServletRequest request, HttpServletResponse response) {
		 try {
			PipeOnlineSubTest pipeOnlineSubTest = CommonUtils.toBean(request.getParameterMap(), PipeOnlineSubTest.class);
			prePrecess(request);
			pipeOnlineSubTest.setId(pipeMaintain.getPipeOnlineMaintain().getPipeOnlineSubTest().getId());
			pipeOnlineSubTestService.update(pipeOnlineSubTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	 
	 
	 /**
	 * 上传在用工业管道在线检验记录（2）
	 */
	 @RequestMapping(value="/updatePipeOnlineThiCheck", method=RequestMethod.POST)
	 public void updatePipeOnlineThiCheck(HttpServletRequest request, HttpServletResponse response) {
		 try {
			PipeOnlineThiTest pipeOnlineThiTest = CommonUtils.toBean(request.getParameterMap(), PipeOnlineThiTest.class);
			prePrecess(request);
			pipeOnlineThiTest.setId(pipeMaintain.getPipeOnlineMaintain().getPipeOnlineThiTest().getId());
			pipeOnlineThiTestService.update(pipeOnlineThiTest);
			printData(response, "success");
		} catch (Exception e) {
			printData(response, "error");
		}
	 }	
	 
	 /**
	 * 上传月度检验
	 */
	 @RequestMapping(value="/updatePipeMonthlyCheck", method=RequestMethod.POST)
	 public void updatePipeMonthlyInspection(HttpServletRequest request, HttpServletResponse response) {
		 try {
			PipeMonthlyInspection pipeMonthlyInspection = CommonUtils.toBean(request.getParameterMap(), PipeMonthlyInspection.class);
			String p_Sys = request.getParameter("scan_Tag_ID");
			PipeBasic pipeBasic = pipeBasciService.getByPipeSysIdAndType(p_Sys, "2");
			pipeMonthlyInspection.setPipeBasic(pipeBasic);
			pipeMonthlyInspectionService.save(pipeMonthlyInspection);
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
 		if (pipeMaintain.getM_ID()!=mid) {
 			pipeMaintain = pipeMaintainService.findByMaintainId(mid);
		}
 	};
 	
}