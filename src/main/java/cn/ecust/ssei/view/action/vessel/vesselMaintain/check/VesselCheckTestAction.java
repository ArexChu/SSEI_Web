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
import cn.ecust.ssei.domain.vessel.check.VesselCheckMaintain;
import cn.ecust.ssei.domain.vessel.check.VesselCheckTest;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

import com.opensymphony.xwork2.ActionContext;
@Controller
@Scope("prototype")
public class VesselCheckTestAction extends BaseAction<VesselCheckTest> {

	private long checkId;
	private long vesselMaintainId;
	
	/**
	 * 新增
	 * @return
	 * @throws Exception
	 */
	public String add() throws Exception{
		VesselCheckMaintain vesselCheckMaintain = vesselCheckMaintainService.getById(checkId);
		VesselCheckTest vesselCheckTest = new VesselCheckTest();
		vesselCheckMaintain.setVesselCheckTest(vesselCheckTest);
		vesselCheckMaintainService.update(vesselCheckMaintain);
		return "toVesselCheckMaintainList";
	}
	
	public String editUI() throws Exception{
		VesselCheckMaintain vesselCheckMaintain = vesselCheckMaintainService.getById(checkId);
		VesselCheckTest vesselCheckTest =vesselCheckMaintain.getVesselCheckTest();
		ActionContext.getContext().getValueStack().push(vesselCheckTest);
		return "saveUI";
	}
	
	public String delete() throws Exception{
		VesselCheckMaintain vesselCheckMaintain = vesselCheckMaintainService.getById(checkId);
		VesselCheckTest vesselCheckTest =vesselCheckMaintain.getVesselCheckTest();
		long id = vesselCheckTest.getId();
		vesselCheckMaintain.setVesselCheckTest(null);
		vesselCheckMaintainService.update(vesselCheckMaintain);
		vesselCheckTestService.delete(id);
		return "toVesselCheckMaintainList";
	}
	
	public String edit() throws Exception{
		vesselCheckTestService.update(model);
		return "toVesselCheckMaintainList";
	}
	
	public String generateFile() throws Exception{
		VesselCheckMaintain vesselCheckMaintain = vesselCheckMaintainService.getById(checkId);
		VesselCheckTest vesselCheckTest =vesselCheckMaintain.getVesselCheckTest();
		vesselCheckTestService.generateFile(vesselCheckTest);	
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
		VesselCheckTest vesselCheckTest =vesselCheckMaintain.getVesselCheckTest();
		String fileRootpath = MyFileUtils.getFilePath(vesselCheckTest.getId(), "vesselCheckTest", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = vesselCheckTest.getId()+"_vesselCheckTest.doc";
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

}
