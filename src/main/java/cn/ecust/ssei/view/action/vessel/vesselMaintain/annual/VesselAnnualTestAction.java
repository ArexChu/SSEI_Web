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
import cn.ecust.ssei.domain.vessel.annual.VesselAnnualMaintain;
import cn.ecust.ssei.domain.vessel.annual.VesselAnnualTest;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

import com.opensymphony.xwork2.ActionContext;
@Controller
@Scope("prototype")
public class VesselAnnualTestAction extends BaseAction<VesselAnnualTest> {

	private long annualId;
	private long vesselMaintainId;
	
	/**
	 * 新增
	 * @return
	 * @throws Exception
	 */
	public String add() throws Exception{
		VesselAnnualMaintain vesselAnnualMaintain = vesselAnnualMaintainService.getById(annualId);
		VesselAnnualTest vesselAnnualTest = new VesselAnnualTest();
		vesselAnnualMaintain.setVesselAnnualTest(vesselAnnualTest);
		vesselAnnualMaintainService.update(vesselAnnualMaintain);
		return "toVesselAnnualMaintainList";
	}
	
	public String editUI() throws Exception{
		VesselAnnualMaintain vesselAnnualMaintain = vesselAnnualMaintainService.getById(annualId);
		VesselAnnualTest vesselAnnualTest =vesselAnnualMaintain.getVesselAnnualTest();
		ActionContext.getContext().getValueStack().push(vesselAnnualTest);
		return "saveUI";
	}
	
	public String delete() throws Exception{
		VesselAnnualMaintain vesselAnnualMaintain = vesselAnnualMaintainService.getById(annualId);
		VesselAnnualTest vesselAnnualTest =vesselAnnualMaintain.getVesselAnnualTest();
		long id = vesselAnnualTest.getId();
		vesselAnnualMaintain.setVesselAnnualTest(null);
		vesselAnnualMaintainService.update(vesselAnnualMaintain);
		vesselAnnualTestService.delete(id);
		return "toVesselAnnualMaintainList";
	}
	
	public String edit() throws Exception{
		vesselAnnualTestService.update(model);
		return "toVesselAnnualMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselAnnualMaintain vesselAnnualMaintain = vesselAnnualMaintainService.getById(annualId);
		VesselAnnualTest vesselAnnualTest =vesselAnnualMaintain.getVesselAnnualTest();
		vesselAnnualTestService.generateFile(vesselAnnualTest);	
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
		VesselAnnualTest vesselAnnualTest =vesselAnnualMaintain.getVesselAnnualTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselAnnualTest.getId(), "vesselAnnualTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselAnnualTest.getId()+"_vesselAnnualTest.doc";
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

}
