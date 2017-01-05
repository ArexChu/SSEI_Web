package cn.ecust.ssei.view.action.pipe.pipemaintain.online;

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
import cn.ecust.ssei.domain.pipe.pipeonlinemaintain.PipeOnlineMaintain;
import cn.ecust.ssei.domain.pipe.pipeonlinemaintain.PipeOnlineThiTest;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

import com.opensymphony.xwork2.ActionContext;
@Controller
@Scope("prototype")
public class PipeOnlineThiTestAction extends BaseAction<PipeOnlineThiTest> {

	private long onlineid;
	private long pipeMaintainId;
	
	/**
	 * 新增
	 * @return
	 * @throws Exception
	 */
	public String add() throws Exception{
		PipeOnlineMaintain pipeOnlineMaintain = pipeOnlineMaintainService.getById(onlineid);
		PipeOnlineThiTest pipeOnlineThiTest = new PipeOnlineThiTest();
		pipeOnlineMaintain.setPipeOnlineThiTest(pipeOnlineThiTest);
		pipeOnlineMaintainService.update(pipeOnlineMaintain);
		return "toPipeOnlineMaintainList";
	}
	
	public String editUI() throws Exception{
		PipeOnlineMaintain pipeOnlineMaintain = pipeOnlineMaintainService.getById(onlineid);
		PipeOnlineThiTest pipeOnlineThiTest = pipeOnlineMaintain.getPipeOnlineThiTest();
		ActionContext.getContext().getValueStack().push(pipeOnlineThiTest);
		return "saveUI";
	}
	
	public String delete() throws Exception{
		PipeOnlineMaintain pipeOnlineMaintain = pipeOnlineMaintainService.getById(onlineid);
		PipeOnlineThiTest pipeOnlineThiTest = pipeOnlineMaintain.getPipeOnlineThiTest();
		long id = pipeOnlineThiTest.getId();
		pipeOnlineMaintain.setPipeOnlineThiTest(null);
		pipeOnlineMaintainService.update(pipeOnlineMaintain);
		pipeOnlineThiTestService.delete(id);
		return "toPipeOnlineMaintainList";
	}
	
	public String edit() throws Exception{
		pipeOnlineThiTestService.update(model);
		return "toPipeOnlineMaintainList";
	}
	
	public String generateFile() throws Exception{
		PipeOnlineMaintain pipeOnlineMaintain = pipeOnlineMaintainService.getById(onlineid);
		PipeOnlineThiTest pipeOnlineThiTest = pipeOnlineMaintain.getPipeOnlineThiTest();
		pipeOnlineThiTestService.generateFile(pipeOnlineThiTest);	
		return "toPipeOnlineMaintainDocumentList";
	}
	
	public String download()throws Exception {
		String path = makeSurePath();
		return out(path);
	}

	public String deleteFile() throws Exception{
		String path = makeSurePath();
		File file = new File(path);
		file.delete();
		return "toPipeOnlineMaintainDocumentList";
	}
	
	private String makeSurePath() {
		PipeOnlineMaintain pipeOnlineMaintain = pipeOnlineMaintainService.getById(onlineid);
		PipeOnlineThiTest pipeOnlineThiTest = pipeOnlineMaintain.getPipeOnlineThiTest();
		String fileRootpath = MyFileUtils.getFilePath(pipeOnlineThiTest.getId(), "pipeOnlineThiTest", Constant.PIPE_DOCUMENT_UPLOAD);
		String fileName = pipeOnlineThiTest.getId()+"_pipeOnlineThiTest.doc";
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
	 * @return the onlineid
	 */
	public long getOnlineid() {
		return onlineid;
	}
	/**
	 * @param onlineid the onlineid to set
	 */
	public void setOnlineid(long onlineid) {
		this.onlineid = onlineid;
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
	
	
	
}
