package cn.ecust.ssei.view.action.document.pipe.online;

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
import cn.ecust.ssei.domain.pipe.pipeonlinemaintain.PipeOnlineMaintain;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobWord;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class PipeOnlineMaintainDocumentAction extends BaseAction<PipeOnlineMaintain> {
	private long pipeMaintainId;

	public String list() throws Exception {
		PipeOnlineMaintain pipeOnlineMaintain = pipeMaintainService.getById(pipeMaintainId).getPipeOnlineMaintain();
		List<Boolean> menuList = getMenuList(pipeOnlineMaintain);
		List<Boolean> fileList = getFileList(pipeOnlineMaintain);
		ActionContext.getContext().put("menuList", menuList);
		ActionContext.getContext().put("fileList", fileList);
		ActionContext.getContext().getValueStack().push(pipeOnlineMaintain);
		return "list";
	}
	
	
	private List<Boolean> getFileList(PipeOnlineMaintain pipeOnlineMaintain) {
		List<Boolean> list = new ArrayList<Boolean>();
		
		
		if (pipeOnlineMaintain.getPipeOnlineThiTest()!=null) {
			list.add(hasFile("pipeOnlineThiTest",pipeOnlineMaintain.getPipeOnlineThiTest().getId()));
		}else {
			list.add(false);
		}
		
		if (pipeOnlineMaintain.getPipeOnlineSubTest()!=null) {
			list.add(hasFile("pipeOnlineSubTest",pipeOnlineMaintain.getPipeOnlineSubTest().getId()));
		}else {
			list.add(false);
		}
		list.add(hasFile("pipeOnline",pipeOnlineMaintain.getId()));
		
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
		PipeOnlineMaintain pipeOnlineMaintain = pipeMaintainService.getById(pipeMaintainId).getPipeOnlineMaintain();
		List<File> documentList = getDocumentList(pipeOnlineMaintain);
		long id = pipeOnlineMaintain.getId();
		String fileRootpath = MyFileUtils.getFilePath(id, "pipeOnline", Constant.PIPE_DOCUMENT_UPLOAD);
		String fileName = id+"_pipeOnline.doc";
		String filePath = fileRootpath+"/"+fileName;//最终文档生成的位置
		JacobWord jacobWord = new JacobWord();
		jacobWord.mergeWord(documentList, filePath);
		return "toPipeOnlineMaintainDocumentList";
	}
	
	public String download()throws Exception {
		PipeOnlineMaintain pipeOnlineMaintain = pipeMaintainService.getById(pipeMaintainId).getPipeOnlineMaintain();
		long id = pipeOnlineMaintain.getId();
		String fileRootpath = MyFileUtils.getFilePath(id, "pipeOnline", Constant.PIPE_DOCUMENT_UPLOAD);
		String fileName = id+"_pipeOnline.doc";
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
	private List<File> getDocumentList(PipeOnlineMaintain pipeOnlineMaintain) {
		List<File> docFiles = new ArrayList<File>();

		if (pipeOnlineMaintain.getPipeOnlineThiTest()!=null) {
			addFileToList("pipeOnlineThiTest",pipeOnlineMaintain.getPipeOnlineThiTest().getId(),docFiles);
		}
		if (pipeOnlineMaintain.getPipeOnlineSubTest()!=null) {
			addFileToList("pipeOnlineSubTest",pipeOnlineMaintain.getPipeOnlineSubTest().getId(),docFiles);
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
	
	private List<Boolean> getMenuList(PipeOnlineMaintain pipeOnlineMaintain) {
		List<Boolean> list = new ArrayList<Boolean>();
		if (pipeOnlineMaintain.getPipeOnlineThiTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (pipeOnlineMaintain.getPipeOnlineSubTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		return list;
	}
	
}
