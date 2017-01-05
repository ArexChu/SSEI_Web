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
import cn.ecust.ssei.domain.pipe.PipeBasic;
import cn.ecust.ssei.domain.pipe.PipeMaintain;
import cn.ecust.ssei.domain.pipe.pipeonlinemaintain.PipeOnlineMaintain;
import cn.ecust.ssei.domain.pipe.pipeonlinemaintain.PipeOnlineSubTest;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class PipeOnlineSubTestAction extends BaseAction<PipeOnlineSubTest> {
	
	private long onlineid;
	private long pipeMaintainId;
	
	private String nextOnlineMaintainDate;
	private String m_Bas_Prob;
	
	
	
	/**
	 * 新增
	 * @return
	 * @throws Exception
	 */
	public String add() throws Exception{
		PipeOnlineMaintain pipeOnlineMaintain = pipeOnlineMaintainService.getById(onlineid);
		PipeOnlineSubTest pipeOnlineSubTest = new PipeOnlineSubTest();
		pipeOnlineMaintain.setPipeOnlineSubTest(pipeOnlineSubTest);
		pipeOnlineMaintainService.update(pipeOnlineMaintain);
		return "toPipeOnlineMaintainList";
	}
	
	public String editUI() throws Exception{
		PipeOnlineMaintain pipeOnlineMaintain = pipeOnlineMaintainService.getById(onlineid);
		PipeOnlineSubTest pipeOnlineSubTest = pipeOnlineMaintain.getPipeOnlineSubTest();
		nextOnlineMaintainDate=pipeOnlineMaintain.getPipeMaintain().getPipeBasic().getNextOnlineMaintainDate();
		m_Bas_Prob=pipeOnlineMaintain.getPipeMaintain().getM_Bas_Prob();
		ActionContext.getContext().getValueStack().push(pipeOnlineSubTest);
		return "saveUI";
	}
	
	public String delete() throws Exception{
		PipeOnlineMaintain pipeOnlineMaintain = pipeOnlineMaintainService.getById(onlineid);
		PipeOnlineSubTest pipeOnlineSubTest = pipeOnlineMaintain.getPipeOnlineSubTest();
		long id = pipeOnlineSubTest.getId();
		pipeOnlineMaintain.setPipeOnlineSubTest(null);
		pipeOnlineMaintainService.update(pipeOnlineMaintain);
		pipeOnlineSubTestService.delete(id);
		return "toPipeOnlineMaintainList";
	}
	
	public String edit() throws Exception{
		PipeOnlineMaintain pipeOnlineMaintain = pipeOnlineMaintainService.getById(onlineid);
		PipeOnlineSubTest pipeOnlineSubTest = pipeOnlineMaintain.getPipeOnlineSubTest();
		pipeOnlineSubTest.setM_OL_Prep(model.getM_OL_Prep());
		pipeOnlineSubTest.setM_OL_Check(model.getM_OL_Check());
		pipeOnlineSubTest.setP_Other(model.getP_Other());
		pipeOnlineSubTest.setP_Wel(model.getP_Wel());
		pipeOnlineSubTest.setP_Leak(model.getP_Leak());
		pipeOnlineSubTest.setP_Ins(model.getP_Ins());
		pipeOnlineSubTest.setP_Pro(model.getP_Pro());
		pipeOnlineSubTest.setP_Vib(model.getP_Vib());
		pipeOnlineSubTest.setP_Hanger(model.getP_Hanger());
		pipeOnlineSubTest.setP_Valve(model.getP_Valve());
		pipeOnlineSubTest.setP_Exp(model.getP_Exp());
		pipeOnlineSubTest.setP_Fla(model.getP_Fla());
		pipeOnlineSubTest.setP_Str(model.getP_Str());
		pipeOnlineSubTest.setP_Ide(model.getP_Ide());
		pipeOnlineSubTest.setP_Fla_Res(model.getP_Fla_Res());
		pipeOnlineSubTest.setP_Gro_Res(model.getP_Gro_Res());
		pipeOnlineSubTest.setP_Thi(model.getP_Thi());
		pipeOnlineSubTest.setM_OL_Pre(model.getM_OL_Pre());
		pipeOnlineSubTest.setM_OL_Tem(model.getM_OL_Tem());
		pipeOnlineSubTest.setM_OL_Valve(model.getM_OL_Valve());
		pipeOnlineSubTest.setM_OL_Rup(model.getM_OL_Rup());
		pipeOnlineSubTest.setM_OL_Others(model.getM_OL_Others());
		pipeOnlineSubTest.setM_OL_Bug(model.getM_OL_Bug());
		pipeOnlineSubTest.setM_OL_Bug_Sol(model.getM_OL_Bug_Sol());
		pipeOnlineSubTest.setM_OL_Result(model.getM_OL_Result());
		pipeOnlineSubTest.setM_Test_Date(model.getM_Test_Date());
		pipeOnlineSubTest.setM_Check_Date(model.getM_Check_Date());
		PipeMaintain pipeMaintain = pipeOnlineMaintain.getPipeMaintain();
		pipeMaintain.setM_Bas_Prob(m_Bas_Prob);
		PipeBasic pipeBasic = pipeMaintain.getPipeBasic();
		pipeBasic.setNextOnlineMaintainDate(nextOnlineMaintainDate);
		pipeMaintainService.update(pipeMaintain);
		return "toPipeOnlineMaintainList";
	}
	
	public String generateFile() throws Exception{
		PipeOnlineMaintain pipeOnlineMaintain = pipeOnlineMaintainService.getById(onlineid);
		PipeOnlineSubTest pipeOnlineSubTest = pipeOnlineMaintain.getPipeOnlineSubTest();
		pipeOnlineSubTestService.generateFile(pipeOnlineSubTest);	
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
		PipeOnlineSubTest pipeOnlineSubTest = pipeOnlineMaintain.getPipeOnlineSubTest();
		String fileRootpath = MyFileUtils.getFilePath(pipeOnlineSubTest.getId(), "pipeOnlineSubTest", Constant.PIPE_DOCUMENT_UPLOAD);
		String fileName = pipeOnlineSubTest.getId()+"_pipeOnlineSubTest.doc";
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



	/**
	 * @return the nextOnlineMaintainDate
	 */
	public String getNextOnlineMaintainDate() {
		return nextOnlineMaintainDate;
	}

	/**
	 * @param nextOnlineMaintainDate the nextOnlineMaintainDate to set
	 */
	public void setNextOnlineMaintainDate(String nextOnlineMaintainDate) {
		this.nextOnlineMaintainDate = nextOnlineMaintainDate;
	}

	/**
	 * @return the m_Bas_Prob
	 */
	public String getM_Bas_Prob() {
		return m_Bas_Prob;
	}

	/**
	 * @param m_Bas_Prob the m_Bas_Prob to set
	 */
	public void setM_Bas_Prob(String m_Bas_Prob) {
		this.m_Bas_Prob = m_Bas_Prob;
	}
	
	
	


}
