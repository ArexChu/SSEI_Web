package cn.ecust.ssei.view.action.document.pipe.detail;

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
import cn.ecust.ssei.util.jacob.JacobWord;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class PipeDetailMaintainDocumentAction extends BaseAction<PipeDetailMaintain> {
	private long pipeMaintainId;

	public String list() throws Exception {
		PipeDetailMaintain pipeDetailMaintain = pipeMaintainService.getById(pipeMaintainId).getPipeDetailMaintain();
		List<Boolean> menuList = getMenuList(pipeDetailMaintain);
		List<Boolean> fileList = getFileList(pipeDetailMaintain);
		ActionContext.getContext().put("menuList", menuList);
		ActionContext.getContext().put("fileList", fileList);
		ActionContext.getContext().getValueStack().push(pipeDetailMaintain);
		return "list";
	}
	
	
	private List<Boolean> getFileList(PipeDetailMaintain pipeDetailMaintain) {
		List<Boolean> list = new ArrayList<Boolean>();
		
		
		if (pipeDetailMaintain.getPipeMicroTest()!=null) {
			list.add(hasFile("pipeMicroTest",pipeDetailMaintain.getPipeMicroTest().getId()));
		}else {
			list.add(false);
		}
		
		if (pipeDetailMaintain.getPipeSPDTest()!=null) {
			list.add(hasFile("pipeSPDTest",pipeDetailMaintain.getPipeSPDTest().getId()));
		}else {
			list.add(false);
		}
		
		if (pipeDetailMaintain.getPipeThiTest()!=null) {
			list.add(hasFile("pipeThiTest",pipeDetailMaintain.getPipeThiTest().getId()));
		}else {
			list.add(false);
		}
		
		if (pipeDetailMaintain.getPipeHardTest()!=null) {
			list.add(hasFile("pipeHardTest",pipeDetailMaintain.getPipeHardTest().getId()));
		}else {
			list.add(false);
		}
		
		if (pipeDetailMaintain.getPipeMetTest()!=null) {
			list.add(hasFile("pipeMetTest",pipeDetailMaintain.getPipeMetTest().getId()));
		}else {
			list.add(false);
		}
		
		if (pipeDetailMaintain.getPipePreTest()!=null) {
			list.add(hasFile("pipePreTest",pipeDetailMaintain.getPipePreTest().getId()));
		}else {
			list.add(false);
		}
		
		if (pipeDetailMaintain.getPipeLeakTest()!=null) {
			list.add(hasFile("pipeLeakTest",pipeDetailMaintain.getPipeLeakTest().getId()));
		}else {
			list.add(false);
		}
		
		if (pipeDetailMaintain.getPipeAssTable()!=null) {
			list.add(hasFile("pipeAssTable",pipeDetailMaintain.getPipeAssTable().getId()));
		}else {
			list.add(false);
		}
		
		if (pipeDetailMaintain.getPipeVerification()!=null) {
			list.add(hasFile("pipeVerification",pipeDetailMaintain.getPipeVerification().getId()));
		}else {
			list.add(false);
		}
		
		list.add(hasFile("pipeDetail",pipeDetailMaintain.getId()));
		
		return list;
	}

	/**
	 * 判断有无指定文件
	 * @param string
	 * @param id
	 * @return
	 */
	private Boolean hasFile(String string, long id) {
		String fileRootpath = MyFileUtils.getFilePath(id, string, Constant.PIPE_DOCUMENT_UPLOAD);
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
		String fileRootpath = MyFileUtils.getFilePath(id, string, Constant.PIPE_DOCUMENT_UPLOAD);
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
		PipeDetailMaintain pipeDetailMaintain = pipeMaintainService.getById(pipeMaintainId).getPipeDetailMaintain();
		List<File> documentList = getDocumentList(pipeDetailMaintain);
		long id = pipeDetailMaintain.getId();
		String fileRootpath = MyFileUtils.getFilePath(id, "pipeDetail", Constant.PIPE_DOCUMENT_UPLOAD);
		String fileName = id+"_pipeDetail.doc";
		String filePath = fileRootpath+"/"+fileName;//最终文档生成的位置
		JacobWord jacobWord = new JacobWord();
		jacobWord.mergeWord(documentList, filePath);
		return "toPipeDetailMaintainDocumentList";
	}
	
	public String download()throws Exception {
		PipeDetailMaintain pipeDetailMaintain = pipeMaintainService.getById(pipeMaintainId).getPipeDetailMaintain();
		long id = pipeDetailMaintain.getId();
		String fileRootpath = MyFileUtils.getFilePath(id, "pipeDetail", Constant.PIPE_DOCUMENT_UPLOAD);
		String fileName = id+"_pipeDetail.doc";
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
	private List<File> getDocumentList(PipeDetailMaintain pipeDetailMaintain) {
		List<File> docFiles = new ArrayList<File>();
		/**
		 * 处理管道基础信息的表
		 */
		pipeBasciService.generateFile(pipeDetailMaintain.getPipeMaintain());
		if (pipeDetailMaintain.getPipeVerification()!=null) {
			addFileToList("pipeVerification",pipeDetailMaintain.getPipeVerification().getId(),docFiles);
		}
		if (pipeDetailMaintain.getPipeAssTable()!=null) {
			addFileToList("pipeAssTable",pipeDetailMaintain.getPipeAssTable().getId(),docFiles);
		}
		addFileToList("pipeBasic",pipeDetailMaintain.getPipeMaintain().getPipeBasic().getId(),docFiles);
		if (pipeDetailMaintain.getPipeMicroTest()!=null) {
			addFileToList("pipeMicroTest",pipeDetailMaintain.getPipeMicroTest().getId(),docFiles);
		}
		if (pipeDetailMaintain.getPipeSPDTest()!=null) {
			addFileToList("pipeSPDTest",pipeDetailMaintain.getPipeSPDTest().getId(),docFiles);
		}
		if (pipeDetailMaintain.getPipeThiTest()!=null) {
			addFileToList("pipeThiTest",pipeDetailMaintain.getPipeThiTest().getId(),docFiles);
		}
		if (pipeDetailMaintain.getPipeHardTest()!=null) {
			addFileToList("pipeHardTest",pipeDetailMaintain.getPipeHardTest().getId(),docFiles);
		}
		if (pipeDetailMaintain.getPipeMetTest()!=null) {
			addFileToList("pipeMetTest",pipeDetailMaintain.getPipeMetTest().getId(),docFiles);
		}
		if (pipeDetailMaintain.getPipePreTest()!=null) {
			addFileToList("pipePreTest",pipeDetailMaintain.getPipePreTest().getId(),docFiles);
		}
		if (pipeDetailMaintain.getPipeLeakTest()!=null) {
			addFileToList("pipeLeakTest",pipeDetailMaintain.getPipeLeakTest().getId(),docFiles);
		}
		return docFiles;
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
	
}
