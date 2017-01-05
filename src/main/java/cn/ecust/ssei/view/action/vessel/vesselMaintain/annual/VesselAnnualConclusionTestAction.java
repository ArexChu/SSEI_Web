package cn.ecust.ssei.view.action.vessel.vesselMaintain.annual;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.BaseAction;
import cn.ecust.ssei.domain.vessel.VesselBasic;
import cn.ecust.ssei.domain.vessel.VesselMaintain;
import cn.ecust.ssei.domain.vessel.annual.VesselAnnualConclusionTest;
import cn.ecust.ssei.domain.vessel.annual.VesselAnnualMaintain;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

import com.opensymphony.xwork2.ActionContext;
@Controller
@Scope("prototype")
public class VesselAnnualConclusionTestAction extends BaseAction<VesselAnnualConclusionTest> {

	private long annualId;
	private long vesselMaintainId;
	
	private String v_M_Next_Ann_Date;
	private String v_M_Bas_Prob;
	private String v_M_Next_Date;
	
	/**
	 * 新增
	 * @return
	 * @throws Exception
	 */
	public String add() throws Exception{
		VesselAnnualMaintain vesselAnnualMaintain = vesselAnnualMaintainService.getById(annualId);
		VesselAnnualConclusionTest vesselAnnualConclusionTest = new VesselAnnualConclusionTest();
		vesselAnnualMaintain.setVesselAnnualConclusionTest(vesselAnnualConclusionTest);
		vesselAnnualMaintainService.update(vesselAnnualMaintain);
		return "toVesselAnnualMaintainList";
	}
	
	public String editUI() throws Exception{
		VesselAnnualMaintain vesselAnnualMaintain = vesselAnnualMaintainService.getById(annualId);
		VesselAnnualConclusionTest vesselAnnualConclusionTest  = vesselAnnualMaintain.getVesselAnnualConclusionTest();
		v_M_Bas_Prob=vesselAnnualMaintain.getVesselMaintain().getV_M_Bas_Prob();
		v_M_Next_Ann_Date=vesselAnnualMaintain.getVesselMaintain().getVesselBasic().getV_M_Next_Ann_Date();
		v_M_Next_Date=vesselAnnualMaintain.getVesselMaintain().getVesselBasic().getV_M_Next_Date();
		ActionContext.getContext().getValueStack().push(vesselAnnualConclusionTest);
		return "saveUI";
	}
	
	public String delete() throws Exception{
		VesselAnnualMaintain vesselAnnualMaintain = vesselAnnualMaintainService.getById(annualId);
		VesselAnnualConclusionTest vesselAnnualConclusionTest  = vesselAnnualMaintain.getVesselAnnualConclusionTest();
		long id = vesselAnnualConclusionTest.getId();
		vesselAnnualMaintain.setVesselAnnualConclusionTest(null);
		vesselAnnualMaintainService.update(vesselAnnualMaintain);
		vesselAnnualConclusionTestService.delete(id);
		return "toVesselAnnualMaintainList";
	}
	
	public String edit() throws Exception{
		VesselAnnualConclusionTest vesselAnnualConclusionTest = vesselAnnualConclusionTestService.getById(model.getId());
		vesselAnnualConclusionTest.setV_Ann_Type(model.getV_Ann_Type());
		vesselAnnualConclusionTest.setV_Ann_Basic(model.getV_Ann_Basic());
		vesselAnnualConclusionTest.setV_Ann_Conclusion(model.getV_Ann_Conclusion());
		vesselAnnualConclusionTest.setV_Ann_Check(model.getV_Ann_Check());
		vesselAnnualConclusionTest.setV_Ann_Level(model.getV_Ann_Level());
		vesselAnnualConclusionTest.setV_Ann_Pre(model.getV_Ann_Pre());
		vesselAnnualConclusionTest.setV_Ann_Med(model.getV_Ann_Med());
		vesselAnnualConclusionTest.setV_Ann_Tem(model.getV_Ann_Tem());
		vesselAnnualConclusionTest.setV_Ann_Explan(model.getV_Ann_Explan());
		vesselAnnualConclusionTest.setV_Ann_Test(model.getV_Ann_Test());
		VesselMaintain vesselMaintain=vesselAnnualConclusionTest.getVesselAnnualMaintain().getVesselMaintain();
		vesselMaintain.setV_M_Bas_Prob(v_M_Bas_Prob);
		VesselBasic vesselBasic = vesselMaintain.getVesselBasic();
		vesselBasic.setV_M_Next_Ann_Date(v_M_Next_Ann_Date);
		vesselBasic.setV_M_Next_Date(v_M_Next_Date);
		vesselAnnualConclusionTestService.update(vesselAnnualConclusionTest);		
		return "toVesselAnnualMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselAnnualMaintain vesselAnnualMaintain = vesselAnnualMaintainService.getById(annualId);
		VesselAnnualConclusionTest vesselAnnualConclusionTest  = vesselAnnualMaintain.getVesselAnnualConclusionTest();
		vesselAnnualConclusionTestService.generateFile(vesselAnnualConclusionTest);	
		return "toVesselAnnualDocumentMenuList";
	}
	
	public String download()throws Exception {
		String path = makeSurePath();
		return out(path);
	}

	public String deleteFile() throws Exception{
		String path = makeSurePath();
		File file = new File(path);
		file.delete();
		return "toVesselAnnualDocumentMenuList";
	}
	
	private String makeSurePath() {
		VesselAnnualMaintain vesselAnnualMaintain = vesselAnnualMaintainService.getById(annualId);
		VesselAnnualConclusionTest vesselAnnualConclusionTest  = vesselAnnualMaintain.getVesselAnnualConclusionTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselAnnualConclusionTest.getId(), "vesselAnnualConclusionTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselAnnualConclusionTest.getId()+"_vesselAnnualConclusionTest.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	public String out(String path) {
		HttpServletResponse response = ServletActionContext.getResponse();
		    try {
		      // path是指欲下载的文件的路径。
		      File file = new File(path);
		      // 取得文件名。
		      String filename = file.getName();
		      // 以流的形式下载文件
		      InputStream fis = new BufferedInputStream(new FileInputStream(path));
		      byte[] buffer = new byte[fis.available()];
		      fis.read(buffer);
		      fis.close();
		      //清空response
		      response.reset();
		      //设置response的Header
		      String filenameString = new String(filename.getBytes("gbk"),"iso-8859-1");
		      response.addHeader("Content-Disposition", "attachment;filename=" + filenameString);
		      response.addHeader("Content-Length", "" + file.length());
		      OutputStream toClient = new BufferedOutputStream(response.getOutputStream());
		      response.setContentType("application/octet-stream");
		      toClient.write(buffer);
		      toClient.flush();
		      toClient.close();
		    } catch (IOException ex) {
		      return null;
		    }
		    return null;
	}

	/**
	 * @return the annualId
	 */
	public long getAnnualId() {
		return annualId;
	}

	/**
	 * @param annualId the annualId to set
	 */
	public void setAnnualId(long annualId) {
		this.annualId = annualId;
	}

	/**
	 * @return the vesselMaintainId
	 */
	public long getVesselMaintainId() {
		return vesselMaintainId;
	}

	/**
	 * @param vesselMaintainId the vesselMaintainId to set
	 */
	public void setVesselMaintainId(long vesselMaintainId) {
		this.vesselMaintainId = vesselMaintainId;
	}

	

	/**
	 * @return the v_M_Next_Ann_Date
	 */
	public String getV_M_Next_Ann_Date() {
		return v_M_Next_Ann_Date;
	}

	/**
	 * @param v_M_Next_Ann_Date the v_M_Next_Ann_Date to set
	 */
	public void setV_M_Next_Ann_Date(String v_M_Next_Ann_Date) {
		this.v_M_Next_Ann_Date = v_M_Next_Ann_Date;
	}

	/**
	 * @return the v_M_Bas_Prob
	 */
	public String getV_M_Bas_Prob() {
		return v_M_Bas_Prob;
	}

	/**
	 * @param v_M_Bas_Prob the v_M_Bas_Prob to set
	 */
	public void setV_M_Bas_Prob(String v_M_Bas_Prob) {
		this.v_M_Bas_Prob = v_M_Bas_Prob;
	}

	/**
	 * @return the v_M_Next_Date
	 */
	public String getV_M_Next_Date() {
		return v_M_Next_Date;
	}

	/**
	 * @param v_M_Next_Date the v_M_Next_Date to set
	 */
	public void setV_M_Next_Date(String v_M_Next_Date) {
		this.v_M_Next_Date = v_M_Next_Date;
	}
	
	
	
}
