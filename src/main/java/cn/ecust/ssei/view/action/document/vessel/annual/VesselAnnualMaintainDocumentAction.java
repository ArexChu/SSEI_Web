package cn.ecust.ssei.view.action.document.vessel.annual;

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
import cn.ecust.ssei.domain.vessel.annual.VesselAnnualMaintain;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobWord;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class VesselAnnualMaintainDocumentAction extends BaseAction<VesselAnnualMaintain> {
	private long vesselMaintainId;

	public String list() throws Exception {
		VesselAnnualMaintain vesselAnnualMaintain = vesselMaintainService.getById(vesselMaintainId).getVesselAnnualMaintain();
		List<Boolean> menuList = getMenuList(vesselAnnualMaintain);
		List<Boolean> fileList = getFileList(vesselAnnualMaintain);
		ActionContext.getContext().put("menuList", menuList);
		ActionContext.getContext().put("fileList", fileList);
		ActionContext.getContext().getValueStack().push(vesselAnnualMaintain);
		return "list";
	}
	
	private List<Boolean> getMenuList(VesselAnnualMaintain vesselAnnualMaintain) {
		List<Boolean> list = new ArrayList<Boolean>();
		if (vesselAnnualMaintain.getVesselAnnualConclusionTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselAnnualMaintain.getVesselAnnualTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		return list;
	}
	
	
	private List<Boolean> getFileList(VesselAnnualMaintain vesselAnnualMaintain) {
		List<Boolean> list = new ArrayList<Boolean>();
		
		if (vesselAnnualMaintain.getVesselAnnualConclusionTest()!=null) {
			list.add(hasFile("vesselAnnualConclusionTest",vesselAnnualMaintain.getVesselAnnualConclusionTest().getId()));
		}else {
			list.add(false);
		}
		if (vesselAnnualMaintain.getVesselAnnualTest()!=null) {
			list.add(hasFile("vesselAnnualTest",vesselAnnualMaintain.getVesselAnnualTest().getId()));
		}else {
			list.add(false);
		}
		list.add(hasFile("vesselAnnual",vesselAnnualMaintain.getId()));
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
		VesselAnnualMaintain vesselAnnualMaintain = vesselMaintainService.getById(vesselMaintainId).getVesselAnnualMaintain();
		List<File> documentList = getDocumentList(vesselAnnualMaintain);
		long id = vesselAnnualMaintain.getId();
		String fileRootpath = MyFileUtils.getFilePath(id, "vesselAnnual", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = id+"_vesselAnnual.doc";
		String filePath = fileRootpath+"/"+fileName;//最终文档生成的位置
		JacobWord jacobWord = new JacobWord();
		jacobWord.mergeWord(documentList, filePath);
		return "toVesselAnnualDocumentMenuList";
	}
	
	public String download()throws Exception {
		VesselAnnualMaintain vesselAnnualMaintain = vesselMaintainService.getById(vesselMaintainId).getVesselAnnualMaintain();
		long id = vesselAnnualMaintain.getId();
		String fileRootpath = MyFileUtils.getFilePath(id, "vesselAnnual", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = id+"_vesselAnnual.doc";
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
	private List<File> getDocumentList(VesselAnnualMaintain vesselAnnualMaintain) {
		List<File> docFiles = new ArrayList<File>();
		if (vesselAnnualMaintain.getVesselAnnualConclusionTest()!=null) {
			addFileToList("vesselAnnualConclusionTest",vesselAnnualMaintain.getVesselAnnualConclusionTest().getId(),docFiles);
		}
		if (vesselAnnualMaintain.getVesselAnnualTest()!=null) {
			addFileToList("vesselAnnualTest",vesselAnnualMaintain.getVesselAnnualTest().getId(),docFiles);
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
