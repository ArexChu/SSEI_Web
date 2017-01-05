package cn.ecust.ssei.view.action.pipe.install;

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
import cn.ecust.ssei.domain.Company;
import cn.ecust.ssei.domain.pipe.pipeinstall.PipeInstall;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.QueryHelper;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class PipeInstallAction extends BaseAction<PipeInstall> {
	private Long constructComId;
	
	private String fileDetailName;//文件应当的名称
	private File document;//文件
	private String[] fileNameListString={"PIleakDoc.rar","PIsafeCheckDoc.rar"};
	
	
	
	public String list() throws Exception {
		List<Company> companyList;
		if (isSSEIUser()||isDeUser()) {
			companyList = companyService.findAll();
		}else {
			companyList = companyService.findByPrivilege(getCurrentUser());
		}
		ActionContext.getContext().put("companyList", companyList);
		QueryHelper queryHelper = getbyCondition();
		queryHelper.preparePageBean(pipeBasciService, pageNum, pageSize);
		return "list";
	}

	/** 添加页面 */
	public String addUI() throws Exception {
		List<Company> companyList = companyService.findAll();
		ActionContext.getContext().put("companyList", companyList);
		return "saveUI";
	}
	
	/** 添加 */
	public String add() throws Exception {
		model.setPi_finished("1");
		pipeInstallService.save(model);
		return "toList";
	}
	
	/** 修改页面 */
	public String editUI() throws Exception {
		// 准备回显的数据
		List<Company> companyList = companyService.findAll();
		ActionContext.getContext().put("companyList", companyList);
		PipeInstall pipeInstall = pipeInstallService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(pipeInstall);
		return "saveUI";
	}
	
	/** 跳向检验项目的页面 */
	public String toMenuUI() throws Exception {
		// 准备回显的数据
		PipeInstall pipeInstall = pipeInstallService.getById(model.getId());
		List<Boolean> menuList = getMenuList(pipeInstall);
		ActionContext.getContext().put("menuList", menuList);
		ActionContext.getContext().getValueStack().push(pipeInstall);
		return "listMenu";
	}
	
	public String toFileList() throws Exception {
		/**
		 * 需要判断文件的有无
		 */
		List<Boolean> fileBoolean = new ArrayList<Boolean>();
		long id =model.getId();
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
		return "toFileList";
		
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
	
	private List<Boolean> getMenuList(PipeInstall pipeInstall) {
		List<Boolean> list = new ArrayList<Boolean>();
		if (pipeInstall.getPiConclusion()==null) {
			list.add(false);
		}else {
			list.add(true);
		}
		if (pipeInstall.getPiBasic()==null) {
			list.add(false);
		}else {
			list.add(true);
		}
		if (pipeInstall.getPiCheckInf()==null) {
			list.add(false);
		}else {
			list.add(true);
		}
		if (pipeInstall.getPiComInf()==null) {
			list.add(false);
		}else {
			list.add(true);
		}
		if (pipeInstall.getPiSafeCheck()==null) {
			list.add(false);
		}else {
			list.add(true);
		}
		if (pipeInstall.getPiSafeCheck1()==null) {
			list.add(false);
		}else {
			list.add(true);
		}
		if (pipeInstall.getPiSafeCheck2()==null) {
			list.add(false);
		}else {
			list.add(true);
		}
		if (pipeInstall.getPiSafeCheck3()==null) {
			list.add(false);
		}else {
			list.add(true);
		}
		if (pipeInstall.getPipeCompleteInf()==null) {
			list.add(false);
		}else {
			list.add(true);
		}
		if (pipeInstall.getPiLeftProblem()==null) {
			list.add(false);
		}else {
			list.add(true);
		}
		if (pipeInstall.getPiReview()==null) {
			list.add(false);
		}else {
			list.add(true);
		}	
		return list;
	}

	/** 修改 */
	public String edit() throws Exception {
		pipeInstallService.update(model);
		return "toList";
	}
	
	/** 删除 */
	public String delete() throws Exception {
		pipeInstallService.delete(model.getId());
		return "toList";
	}
	
	public String listMenu() throws Exception {
		return "listMenu";
	}
	
	private QueryHelper getbyCondition() {
		String pi_ID = model.getPi_ID();
		String pi_Name = model.getPi_Name();
		String pi_finished = model.getPi_finished();
		QueryHelper queryHelper = new QueryHelper(PipeInstall.class, "p").
		addCondition(pi_ID!=null && !pi_ID.isEmpty(), "p.pi_ID = ?", pi_ID).//
		addCondition(pi_finished!=null && !pi_finished.isEmpty(), "p.pi_finished = ?", pi_finished).//
		addCondition(pi_Name!=null && !pi_Name.isEmpty(), "p.pi_Name = ?", pi_Name).//
		addCondition(constructComId!=null,  "p.pi_Cons_Com.id = ?", constructComId);
		queryHelper.addOrderProperty("p.pi_finished", true);
		queryHelper.addOrderProperty("p.id", false);//新添加的在前
		return queryHelper;
	}
	
	
	public String updateStatus() throws Exception {
		PipeInstall pipeInstall = pipeInstallService.getById(model.getId());
		pipeInstall.setPi_finished("2");
		pipeInstallService.update(pipeInstall);
		return "toList";
	}

	/**
	 * @return the constructComId
	 */
	public Long getConstructComId() {
		return constructComId;
	}

	/**
	 * @param constructComId the constructComId to set
	 */
	public void setConstructComId(Long constructComId) {
		this.constructComId = constructComId;
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
