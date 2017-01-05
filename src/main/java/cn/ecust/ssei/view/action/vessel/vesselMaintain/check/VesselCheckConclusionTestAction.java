package cn.ecust.ssei.view.action.vessel.vesselMaintain.check;

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
import cn.ecust.ssei.domain.vessel.check.VesselCheckConclusionTest;
import cn.ecust.ssei.domain.vessel.check.VesselCheckMaintain;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

import com.opensymphony.xwork2.ActionContext;
@Controller
@Scope("prototype")
public class VesselCheckConclusionTestAction extends BaseAction<VesselCheckConclusionTest> {

	private long checkId;
	private long vesselMaintainId;
	
	private String v_M_Next_Date;
	private String v_M_Bas_Prob;
	
	/**
	 * 新增
	 * @return
	 * @throws Exception
	 */
	public String add() throws Exception{
		VesselCheckMaintain vesselCheckMaintain = vesselCheckMaintainService.getById(checkId);
		VesselCheckConclusionTest vesselCheckConclusionTest = new VesselCheckConclusionTest();
		vesselCheckMaintain.setVesselCheckConclusionTest(vesselCheckConclusionTest);
		vesselCheckMaintainService.update(vesselCheckMaintain);
		return "toVesselCheckMaintainList";
	}
	
	public String editUI() throws Exception{
		VesselCheckMaintain vesselCheckMaintain = vesselCheckMaintainService.getById(checkId);
		VesselCheckConclusionTest vesselCheckConclusionTest  = vesselCheckMaintain.getVesselCheckConclusionTest();
		v_M_Bas_Prob=vesselCheckMaintain.getVesselMaintain().getV_M_Bas_Prob();
		v_M_Next_Date=vesselCheckMaintain.getVesselMaintain().getVesselBasic().getV_M_Next_Date();
		ActionContext.getContext().getValueStack().push(vesselCheckConclusionTest);
		return "saveUI";
	}
	
	public String delete() throws Exception{
		VesselCheckMaintain vesselCheckMaintain = vesselCheckMaintainService.getById(checkId);
		VesselCheckConclusionTest vesselCheckConclusionTest  = vesselCheckMaintain.getVesselCheckConclusionTest();
		long id = vesselCheckConclusionTest.getId();
		vesselCheckMaintain.setVesselCheckConclusionTest(null);
		vesselCheckMaintainService.update(vesselCheckMaintain);
		vesselCheckConclusionTestService.delete(id);
		return "toVesselCheckMaintainList";
	}
	
	public String edit() throws Exception{
		VesselCheckConclusionTest vesselCheckConclusionTest = vesselCheckConclusionTestService.getById(model.getId());
		vesselCheckConclusionTest.setV_Check_Basic(model.getV_Check_Basic());
		vesselCheckConclusionTest.setV_Check_Conclusion(model.getV_Check_Conclusion());
		vesselCheckConclusionTest.setV_Check_Check(model.getV_Check_Check());
		vesselCheckConclusionTest.setV_Check_Level(model.getV_Check_Level());
		vesselCheckConclusionTest.setV_Check_Pre(model.getV_Check_Pre());
		vesselCheckConclusionTest.setV_Check_Med(model.getV_Check_Med());
		vesselCheckConclusionTest.setV_Check_Tem(model.getV_Check_Tem());
		vesselCheckConclusionTest.setV_Check_Explan(model.getV_Check_Explan());
		vesselCheckConclusionTest.setV_Check_Test(model.getV_Check_Test());
		vesselCheckConclusionTest.setV_M_Entrust_Com(model.getV_M_Entrust_Com());
		vesselCheckConclusionTest.setV_M_Entrust_Com_Per(model.getV_M_Entrust_Com_Per());
		VesselMaintain vesselMaintain=vesselCheckConclusionTest.getVesselCheckMaintain().getVesselMaintain();
		vesselMaintain.setV_M_Bas_Prob(v_M_Bas_Prob);
		VesselBasic vesselBasic = vesselMaintain.getVesselBasic();
		vesselBasic.setV_M_Next_Date(v_M_Next_Date);
		vesselCheckConclusionTestService.update(vesselCheckConclusionTest);		
		return "toVesselCheckMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselCheckMaintain vesselCheckMaintain = vesselCheckMaintainService.getById(checkId);
		VesselCheckConclusionTest vesselCheckConclusionTest  = vesselCheckMaintain.getVesselCheckConclusionTest();
		vesselCheckConclusionTestService.generateFile(vesselCheckConclusionTest);	
		return "toVesselCheckDocumentMenuList";
	}
	
	public String download()throws Exception {
		String path = makeSurePath();
		return out(path);
	}

	public String deleteFile() throws Exception{
		String path = makeSurePath();
		File file = new File(path);
		file.delete();
		return "toVesselCheckDocumentMenuList";
	}
	
	private String makeSurePath() {
		VesselCheckMaintain vesselCheckMaintain = vesselCheckMaintainService.getById(checkId);
		VesselCheckConclusionTest vesselCheckConclusionTest  = vesselCheckMaintain.getVesselCheckConclusionTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselCheckConclusionTest.getId(), "vesselCheckConclusionTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselCheckConclusionTest.getId()+"_vesselCheckConclusionTest.doc";
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
	 * @return the checkId
	 */
	public long getCheckId() {
		return checkId;
	}

	/**
	 * @param checkId the checkId to set
	 */
	public void setCheckId(long checkId) {
		this.checkId = checkId;
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
	
}
