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
import cn.ecust.ssei.domain.vessel.VesselBasic;
import cn.ecust.ssei.domain.vo.PipeBasicVo;
import cn.ecust.ssei.domain.vo.VesselBasicVo;
import cn.ecust.ssei.domain.vo.formatter.PipeBasicFormatter;
import cn.ecust.ssei.domain.vo.formatter.VesselBasicFormatter;
import cn.ecust.ssei.service.pipe.PipeBasciService;
import cn.ecust.ssei.service.vessel.VesselBasicService;

import com.google.gson.Gson;

@Controller
@RequestMapping("/load") 
public class RestFulGetInfoAction {
		
	@Autowired
	private VesselBasicService vesselBasicService;
	
	@Autowired
	private PipeBasciService pipeBasciService;
	
	/**
	 * 下载容器基本信息
	 */
	 @RequestMapping(value="/vesselBasic", method=RequestMethod.POST)
	 public void getVesselBasciValue(HttpServletRequest request, HttpServletResponse response) {
		 Gson gson = new Gson();
		 String vessv_Product_ID = request.getParameter("vesselId");
		 try {
			 VesselBasic vesselBasic = vesselBasicService.getByProductId(vessv_Product_ID);
			 VesselBasicVo vesselBasicVo = VesselBasicFormatter.formatterToVo(vesselBasic);
			 String str = gson.toJson(vesselBasicVo);			 
			printData(response, str);
		} catch (Exception e) {
			printData(response, "error");
		}
	 }
	 
		/**
		 * 下载管道基本信息
		 */
		 @RequestMapping(value="/pipeBasic", method=RequestMethod.POST)
		 public void getPipeBasicValue(HttpServletRequest request, HttpServletResponse response) {
			 Gson gson = new Gson();
			 String p_Sys_ID = request.getParameter("pipeId");//其实获取的是管道系统的编号
			 try {
				 PipeBasic pipeBasic = pipeBasciService.getByPipeSysIdAndType(p_Sys_ID,"2");//2表示以管道系统为单位
				 PipeBasicVo pipeBasicVo = PipeBasicFormatter.formatterToVo(pipeBasic);
				 String str = gson.toJson(pipeBasicVo);			 
				printData(response, str);
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
	 
}
