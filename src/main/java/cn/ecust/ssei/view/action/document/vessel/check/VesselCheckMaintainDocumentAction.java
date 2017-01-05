package cn.ecust.ssei.view.action.document.vessel.check;

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
import cn.ecust.ssei.domain.vessel.check.VesselCheckMaintain;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobWord;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class VesselCheckMaintainDocumentAction extends BaseAction<VesselCheckMaintain> {
	private long vesselMaintainId;

	public String list() throws Exception {
		VesselCheckMaintain vesselCheckMaintain = vesselMaintainService.getById(vesselMaintainId).getVesselCheckMaintain();
		List<Boolean> menuList = getMenuList(vesselCheckMaintain);
		List<Boolean> fileList = getFileList(vesselCheckMaintain);
		ActionContext.getContext().put("menuList", menuList);
		ActionContext.getContext().put("fileList", fileList);
		ActionContext.getContext().getValueStack().push(vesselCheckMaintain);
		return "list";
	}
	
	private List<Boolean> getMenuList(VesselCheckMaintain vesselCheckMaintain) {
		List<Boolean> list = new ArrayList<Boolean>();
		if (vesselCheckMaintain.getVesselCheckConclusionTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselCheckMaintain.getVesselCheckTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		return list;
	}
	
	
	private List<Boolean> getFileList(VesselCheckMaintain vesselCheckMaintain) {
		List<Boolean> list = new ArrayList<Boolean>();
		
		if (vesselCheckMaintain.getVesselCheckConclusionTest()!=null) {
			list.add(hasFile("vesselCheckConclusionTest",vesselCheckMaintain.getVesselCheckConclusionTest().getId()));
		}else {
			list.add(false);
		}
		if (vesselCheckMaintain.getVesselCheckTest()!=null) {
			list.add(hasFile("vesselCheckTest",vesselCheckMaintain.getVesselCheckTest().getId()));
		}else {
			list.add(false);
		}
		list.add(hasFile("vesselCheck",vesselCheckMaintain.getId()));
		return list;
	}

	/**
	 * 判断有无指定文件
	 * @param string
	 * @param id
	 * @return
	 */
	private Boolean hasFile(String string, long id) {
		String fileRootpath = MyFileUtils.getFilePath(id, string, Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = id+"_"+string+".doc";
		String filePath = fileRootpath+"/"+fileName;//最终文档生成的位置
		File file =new File(filePath);	
		return file.exists();
	}
	
	/**
	 * 判断有无指定文件,并将其加入list中
	 * @param string
	 * @param id
	 */
	private void addFileToList(String string, long id,List<File> list) {
		String fileRootpath = MyFileUtils.getFilePath(id, string, Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = id+"_"+string+".doc";
		String filePath = fileRootpath+"/"+fileName;//最终文档生成的位置
		File file =new File(filePath);	
		if (file.exists()) {
			list.add(file);
		}
	}
	
	
	/**
	 * 按顺序拼接word文档
	 * @return
	 * @throws Exception
	 */
	public String createFinalFile() throws Exception {
		VesselCheckMaintain vesselCheckMaintain = vesselMaintainService.getById(vesselMaintainId).getVesselCheckMaintain();
		List<File> documentList = getDocumentList(vesselCheckMaintain);
		long id = vesselCheckMaintain.getId();
		String fileRootpath = MyFileUtils.getFilePath(id, "vesselCheck", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = id+"_vesselCheck.doc";
		String filePath = fileRootpath+"/"+fileName;//最终文档生成的位置
		JacobWord jacobWord = new JacobWord();
		jacobWord.mergeWord(documentList, filePath);
		return "toVesselCheckDocumentMenuList";
	}
	
	public String download()throws Exception {
		VesselCheckMaintain vesselCheckMaintain = vesselMaintainService.getById(vesselMaintainId).getVesselCheckMaintain();
		long id = vesselCheckMaintain.getId();
		String fileRootpath = MyFileUtils.getFilePath(id, "vesselCheck", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = id+"_vesselCheck.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
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
	 * 按顺序将有的文件加入到集合中
	 * @param pipeDetailMaintain
	 * @return
	 */
	private List<File> getDocumentList(VesselCheckMaintain vesselCheckMaintain) {
		List<File> docFiles = new ArrayList<File>();
		if (vesselCheckMaintain.getVesselCheckConclusionTest()!=null) {
			addFileToList("vesselCheckConclusionTest",vesselCheckMaintain.getVesselCheckConclusionTest().getId(),docFiles);
		}
		if (vesselCheckMaintain.getVesselCheckTest()!=null) {
			addFileToList("vesselCheckTest",vesselCheckMaintain.getVesselCheckTest().getId(),docFiles);
		}
		return docFiles;
		
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
