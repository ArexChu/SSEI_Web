package cn.ecust.ssei.view.action.pipe.pipemaintain.detail;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.BaseAction;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeDetailMaintain;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class PipeDetailMaintainAction extends BaseAction<PipeDetailMaintain> {
	private long pipeMaintainId;
	private String fileDetailName;//文件应当的名称
	private File document;//文件
	private String[] fileNameListString={"pipeThiTestPic.jpg","pipeMetTestPic.jpg","pipePreTestPic.jpg","pipeLeakTestPic.jpg"};
	
	
	public String list() throws Exception {
		PipeDetailMaintain pipeDetailMaintain = pipeMaintainService.getById(pipeMaintainId).getPipeDetailMaintain();
		List<Boolean> menuList = getMenuList(pipeDetailMaintain);
		ActionContext.getContext().put("menuList", menuList);
		ActionContext.getContext().getValueStack().push(pipeDetailMaintain);
		return "list";
	}
	
	
	public String toFileList() throws Exception {
		/**
		 * 需要判断文件的有无
		 */
		List<Boolean> fileBoolean = new ArrayList<Boolean>();
		PipeDetailMaintain pipeDetailMaintain = pipeMaintainService.getById(pipeMaintainId).getPipeDetailMaintain();
		long id = pipeDetailMaintain.getId();
		File file = null;
		for (int i = 0; i < fileNameListString.length; i++) {
			String fileName = fileNameListString[i];
			String path = MyFileUtils.getFilePath(id, fileName, Constant.PIPE_ATTATCHMENT_UPLOAD);
			//拼接文件名称
			String finalFileName = id+"_"+fileName;
			path=path+"/"+finalFileName;
			file =new File(path);
			fileBoolean.add(i, file.exists());
		}
		file =null;
		ActionContext.getContext().put("fileBoolean", fileBoolean);
		model.setId(id);
		return "toFileList";
		
	}
	
	/**
	 * 下载文件
	 * @return
	 * @throws Exception
	 */
	public String downLoad() throws Exception {
		long id =model.getId();
		String fileName = getFileName();
		String path = MyFileUtils.getFilePath(id, fileName, Constant.PIPE_ATTATCHMENT_UPLOAD);
		//拼接文件名称
		
		String finalFileName = id+"_"+fileName;
		path=path+"/"+finalFileName;
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
	 * ajax上传文件
	 * @return
	 * @throws Exception
	 */
	public String upLoad() throws Exception {
		long id =model.getId();
		String fileNama = getFileName();
		MyFileUtils.uploadFile(id, fileNama, document, Constant.PIPE_ATTATCHMENT_UPLOAD);
		return SUCCESS;
	}
	
	/**
	 * @return the pipeMaintainId
	 */
	public long getPipeMaintainId() {
		return pipeMaintainId;
	}


	/**
	 * @param pipeMaintainId the pipeMaintainId to set
	 */
	public void setPipeMaintainId(long pipeMaintainId) {
		this.pipeMaintainId = pipeMaintainId;
	}
	
	private List<Boolean> getMenuList(PipeDetailMaintain pipeDetailMaintain) {
		List<Boolean> list = new ArrayList<Boolean>();
		if (pipeDetailMaintain.getPipeMicroTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (pipeDetailMaintain.getPipeSPDTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (pipeDetailMaintain.getPipeThiTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (pipeDetailMaintain.getPipeHardTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (pipeDetailMaintain.getPipeMetTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (pipeDetailMaintain.getPipePreTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (pipeDetailMaintain.getPipeLeakTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (pipeDetailMaintain.getPipeAssTable()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (pipeDetailMaintain.getPipeVerification()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		return list;
	}
	
	/**
	 * 判断是哪个上传了，获得名称
	 * @return
	 */
	private String getFileName() {
		for (int i = 0; i < fileNameListString.length; i++) {
			if (fileNameListString[i].contains(fileDetailName)) {
				return fileNameListString[i];
			}
		}
		return null;
	}
	
	/**
	 * @return the fileDetailName
	 */
	public String getFileDetailName() {
		return fileDetailName;
	}

	/**
	 * @param fileDetailName the fileDetailName to set
	 */
	public void setFileDetailName(String fileDetailName) {
		this.fileDetailName = fileDetailName;
	}

	/**
	 * @return the document
	 */
	public File getDocument() {
		return document;
	}

	/**
	 * @param document the document to set
	 */
	public void setDocument(File document) {
		this.document = document;
	}

	/**
	 * @return the fileNameListString
	 */
	public String[] getFileNameListString() {
		return fileNameListString;
	}

	/**
	 * @param fileNameListString the fileNameListString to set
	 */
	public void setFileNameListString(String[] fileNameListString) {
		this.fileNameListString = fileNameListString;
	}

	
}
