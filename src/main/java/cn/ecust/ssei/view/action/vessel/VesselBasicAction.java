package cn.ecust.ssei.view.action.vessel;

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
import cn.ecust.ssei.domain.vessel.VesselBasic;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.QueryHelper;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class VesselBasicAction extends BaseAction<VesselBasic> {
	private String fileDetailName;//文件应当的名称
	private File document;//文件
	private String[] fileNameListString={"vesselFinishPic.pdf","qualificationCertificate.pdf","productQuality.pdf","certificateInspection.pdf","vesselDesign.pdf"};
	private String backurl;
	
	private Long companyID;//该字段是查询时使用的
	
	/** 列表 */
	public String list() throws Exception {
		/**
		 * 1: 满足列表条件
		 * 2：设计单位只能查看设计的管道基础信息
		 */
		List<Company> companyList;
		if (isSSEIUser()||isDeUser()) {
			companyList = companyService.findUseCompanies();
		}else {
			companyList = companyService.findByPrivilege(getCurrentUser());
		}
		ActionContext.getContext().put("companyList", companyList);
		QueryHelper queryHelper = getbyCondition();
		queryHelper.preparePageBean(vesselBasicService, pageNum, pageSize);
		return "list";
	}
	
	
	/** 删除 */
	public String delete() throws Exception {
		VesselBasic vesselBasic = vesselBasicService.getById(model.getId());
		vesselBasic.setV_Use_Com(null);
		vesselBasic.setV_De_Com(null);
		vesselBasic.setV_Man_Com(null);
		vesselBasic.setV_Install_Com(null);
		vesselBasicService.update(vesselBasic);
		vesselBasicService.delete(model.getId());
		return "toList";
	}

	/** 添加页面 */
	public String addUI() throws Exception {
		backLoadAllCompanys();
		return "saveUI";
	}

	/** 添加 */
	public String add() throws Exception {
		Company v_Use_Com = companyService.getById(model.getV_Use_Com().getId());
		Company v_De_Com = companyService.getById(model.getV_De_Com().getId());
		Company v_Man_Com = companyService.getById(model.getV_Man_Com().getId());
		Company v_Install_Com = companyService.getById(model.getV_Install_Com().getId());
		model.setV_Use_Com(v_Use_Com);
		model.setV_De_Com(v_De_Com);
		model.setV_Man_Com(v_Man_Com);
		model.setV_Install_Com(v_Install_Com);
		vesselBasicService.save(model);
		return "toList";
	}

	/** 修改页面 */
	public String editUI() throws Exception {
		// 准备回显的数据
		backLoadAllCompanys();
		VesselBasic vesselBasic = vesselBasicService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(vesselBasic);
		return "saveUI";
	}

	/** 修改 */
	public String edit() throws Exception {
		Company v_Use_Com = companyService.getById(model.getV_Use_Com().getId());
		Company v_De_Com = companyService.getById(model.getV_De_Com().getId());
		Company v_Man_Com = companyService.getById(model.getV_Man_Com().getId());
		Company v_Install_Com = companyService.getById(model.getV_Install_Com().getId());
		model.setV_Use_Com(v_Use_Com);
		model.setV_De_Com(v_De_Com);
		model.setV_Man_Com(v_Man_Com);
		model.setV_Install_Com(v_Install_Com);
		vesselBasicService.update(model);
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
			String path = MyFileUtils.getFilePath(id, fileName, Constant.VESSEL_ATTATCHMENT_UPLOAD);
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
		MyFileUtils.uploadFile(id, fileNama, document, Constant.VESSEL_ATTATCHMENT_UPLOAD);
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
	 * 下载文件
	 * @return
	 * @throws Exception
	 */
	public String downLoad() throws Exception {
		long id =model.getId();
		String fileName = getFileName();
		String path = MyFileUtils.getFilePath(id, fileName, Constant.VESSEL_ATTATCHMENT_UPLOAD);
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
		List list =queryHelper.getListInPageBean(vesselBasicService);
		String fname = "容器列表";
	    OutputStream os = response.getOutputStream();//取得输出流
	    response.reset();//清空输出流
	    response.setCharacterEncoding("UTF-8");//设置相应内容的编码格式
	    fname = java.net.URLEncoder.encode(fname,"UTF-8");
	    response.setHeader("Content-Disposition","attachment;filename="+new String(fname.getBytes("UTF-8"),"GBK")+".xls");
	    response.setContentType("application/msexcel");//定义输出类型
	    try {
	    	vesselBasicExcelService.createExcel(os,list);
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
		vesselBasicExcelService.readExcel(document);
		return SUCCESS;
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
	
	
	
	


	/**
	 * @return the companyID
	 */
	public long getCompanyID() {
		return companyID;
	}


	/**
	 * @param companyID the companyID to set
	 */
	public void setCompanyID(long companyID) {
		this.companyID = companyID;
	}


	private QueryHelper getbyCondition() {
		String v_Product_ID = model.getV_Product_ID();
		String v_Name = model.getV_Name();
		String v_Type = model.getV_Type();
		String v_Use_Addr = model.getV_Use_Addr();
		String v_Mainbody_Str = model.getV_Mainbody_Str();
		
		QueryHelper queryHelper = new QueryHelper(VesselBasic.class, "v").
		addCondition(v_Product_ID!=null && !v_Product_ID.isEmpty(), "v.v_Product_ID = ?", v_Product_ID).
		addCondition(v_Name!=null && !v_Name.isEmpty(), "v.v_Name = ?", v_Name).
		addCondition(v_Type!=null && !v_Type.isEmpty(), "v.v_Type = ?", v_Type).
		addCondition(v_Use_Addr!=null && !v_Use_Addr.isEmpty(), "v.v_Use_Addr like ?", "%"+v_Use_Addr+"%").
		addCondition(v_Mainbody_Str!=null && !v_Mainbody_Str.isEmpty(), "v.v_Mainbody_Str like ?", "%"+v_Mainbody_Str+"%").
		addCondition(v_Product_ID!=null && !v_Product_ID.isEmpty(), "v.v_Product_ID = ?", v_Product_ID).
		addCondition(companyID!=null,  "v.v_Use_Com.id = ?", companyID);
		if (isSSEIUser()) {
		}else {
			if (isDeUser()) {//设计单位
				queryHelper.addCondition("v.v_De_Com.id=?", getCurrentUser().getCompany().getId());
			}
			if (isHoldUser()) {
				queryHelper.addCondition("v.v_Use_Com.id=?", getCurrentUser().getCompany().getId());
			}
		}
		queryHelper.addOrderProperty("v.id", false);//新添加的在前
		return queryHelper;
	}
	


}
