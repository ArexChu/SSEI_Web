package cn.ecust.ssei.view.action.pipe;

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

import jxl.write.WriteException;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.BaseAction;
import cn.ecust.ssei.domain.Company;
import cn.ecust.ssei.domain.pipe.PipeBasic;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.QueryHelper;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class PipeBasicAction extends BaseAction<PipeBasic>{
	
	private String fileDetailName;//文件应当的名称
	private File document;//文件
	private String[] fileNameListString={"pipeAttachTable.xlsx","pipeBasicPic.jpg","otherPdf.pdf"};
	private String backurl;
	
	private Long companyID;
	
	/** 列表 */
	public String list() throws Exception {
		/**
		 * 1: 满足列表条件
		 * 2：设计单位只能查看设计的管道基础信息,提交和未提交的都可以，不过在显示的时候要注意
		 * 3：使用单位只能看被设计单位提交的信息
		 * 4：使用单位只能查看自己使用的。
		 */
		List<Company> companyList;
		if (isSSEIUser()||isDeUser()) {
			companyList = companyService.findUseCompanies();
		}else {
			companyList = companyService.findByPrivilege(getCurrentUser());
		}
		ActionContext.getContext().put("companyList", companyList);
		QueryHelper queryHelper = getbyCondition();
		queryHelper.preparePageBean(pipeBasciService, pageNum, pageSize);
		return "list";
	}


	
	/** 提交基础信息 */
	public String submit() throws Exception {
		PipeBasic pipeBasic = pipeBasciService.getById(model.getId());
		pipeBasic.setP_submited("2");//设置为提交
		pipeBasciService.update(pipeBasic);
		return "toList";
	}
	
	/** 删除 */
	public String delete() throws Exception {
		pipeBasciService.delete(model.getId());
		return "toList";
	}

	/** 添加页面 */
	public String addUI() throws Exception {
		backLoadAllCompanys();
		return "saveUI";
	}

	/** 添加 */
	public String add() throws Exception {
		if (companyID!=null&&companyID!=0) {
			Company company = companyService.getById(companyID);
			model.setCompany(company);
		}
		if (isSSEIUser()||isDeUser()) {
			model.setP_submited("1");//初始未提交
		}
		else {
			model.setP_submited("2");//初始以提交
		}
		model.setP_checkType("1");//以管道为单位
		pipeBasciService.save(model);
		return "toList";
	}

	/** 修改页面 */
	public String editUI() throws Exception {
		// 准备回显的数据
		backLoadAllCompanys();
		
		
		
		PipeBasic pipeBasic = pipeBasciService.getById(model.getId());
		try {
			companyID=pipeBasic.getCompany().getId();//可能为空
		} catch (Exception e) {
			companyID=null;
		}
		ActionContext.getContext().getValueStack().push(pipeBasic);
		return "saveUI";
	}

	/** 修改 */
	public String edit() throws Exception {
		if (companyID!=null&&companyID!=0) {
			Company company = companyService.getById(companyID);
			model.setCompany(company);
		}
		pipeBasciService.update(model);
		return "toList";
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
	 * 导出excel表格
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public String excelOut() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		QueryHelper queryHelper = getbyCondition();//得到该页面查询条件
		@SuppressWarnings("rawtypes")
		List list =queryHelper.getListInPageBean(pipeBasciService);
		String fname = "管道列表";
	    OutputStream os = response.getOutputStream();//取得输出流
	    response.reset();//清空输出流
	    response.setCharacterEncoding("UTF-8");//设置相应内容的编码格式
	    fname = java.net.URLEncoder.encode(fname,"UTF-8");
	    response.setHeader("Content-Disposition","attachment;filename="+new String(fname.getBytes("UTF-8"),"GBK")+".xls");
	    response.setContentType("application/msexcel");//定义输出类型
	    try {
	    	pipeBasicExcelService.createExcel(os,list);
		} catch (WriteException e) {
			e.printStackTrace();
		}
	    response.flushBuffer();
		
		
		return null;
		
	}
	
	/**
	 * 导入excel表格
	 * @return
	 * @throws Exception
	 */
	public String excelIn() throws Exception {
		pipeBasicExcelService.readExcel(document);
		return SUCCESS;
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
	 * @return the companyID
	 */
	public Long getCompanyID() {
		return companyID;
	}

	/**
	 * @param companyID the companyID to set
	 */
	public void setCompanyID(Long companyID) {
		this.companyID = companyID;
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
	 * @return the backurl
	 */
	public String getBackurl() {
		return backurl;
	}



	/**
	 * @param backurl the backurl to set
	 */
	public void setBackurl(String backurl) {
		this.backurl = backurl;
	}



	private QueryHelper getbyCondition() {

		QueryHelper queryHelper = new QueryHelper(PipeBasic.class, "p").
		addCondition(model.getP_ID()!=null && !model.getP_ID().isEmpty(), "p.p_ID = ?", model.getP_ID()).//
		addCondition(model.getP_Name()!=null && !model.getP_Name().isEmpty(), "p.p_Name = ?", model.getP_Name()).//
		addCondition(companyID!=null,  "p.company.id = ?", companyID).
		addCondition(model.getP_Gra()!=null && !model.getP_Gra().isEmpty(),  "p.p_Gra = ?",  model.getP_Gra()).
		addCondition(model.getP_Sys()!=null && !model.getP_Sys().isEmpty(),  "p.p_Sys = ?",  model.getP_Sys()).
		addCondition(model.getP_Pro_Ma()!=null && !model.getP_Pro_Ma().isEmpty(),  "p.p_Pro_Ma = ?",  model.getP_Pro_Ma()).
		addCondition(model.getP_Ins_Ma()!=null && !model.getP_Ins_Ma().isEmpty(),  "p.p_Ins_Ma = ?",  model.getP_Ins_Ma()).
		addCondition(model.getP_Equ_Name()!=null && !model.getP_Equ_Name().isEmpty(),  "p.p_Equ_Name = ?",  model.getP_Equ_Name()).
		addCondition(model.getP_Out_Rad()!=null && !model.getP_Out_Rad().isEmpty(),  "p.p_Out_Rad = ?",  model.getP_Out_Rad()).
		addCondition(model.getP_Thi()!=null && !model.getP_Thi().isEmpty(),  "p.p_Thi = ?",  model.getP_Thi()).
		addCondition("p.p_checkType = ?",  "1");//以管道为单位
		if (isSSEIUser()) {
		}else {
			if (isDeUser()) {//设计单位
				queryHelper.addCondition("p.p_De_Com=?", getCurrentUser().getCompany().getName());
			}
			if (isHoldUser()) {
				queryHelper.addCondition("p.p_submited=?", "2").addCondition("p.company.id=?", getCurrentUser().getCompany().getId());
			}
		}
		queryHelper.addOrderProperty("p.p_submited", true).addOrderProperty("p.id", false);//未提交的在前，提交的在后，新添加的在前
		return queryHelper;
	}
}
