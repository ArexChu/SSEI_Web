package cn.ecust.ssei.view.action;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import cn.ecust.ssei.base.BaseAction;
import cn.ecust.ssei.domain.Company;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.QueryHelper;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class CompanyAction extends BaseAction<Company> {

	private String detailName;//显示PDF的具体名称	
	private File[] pdf;
	private  String[] pdfFileName;
	public static String[] pdfName={"operationRules.pdf","recordRules.pdf","maintainRules.pdf","userRules.pdf","dangerRules.pdf","reportRules.pdf","emergencyRules.pdf"};
	
	/** 列表 */
	public String list() throws Exception {
		// 准备分页信息
		if (isSSEIUser()) {
			new QueryHelper(Company.class, "c").
			addCondition(model.getType()!=0, "c.type=?", model.getType()).
			addCondition(model.getName()!=null && !model.getName().isEmpty(), "c.name like ? ", "%"+model.getName()+"%").
			preparePageBean(companyService, pageNum, pageSize);
		}else {
			new QueryHelper(Company.class, "c").
			addCondition("c.id=?", getCurrentUser().getCompany().getId()).
			preparePageBean(companyService, pageNum, pageSize);
			List<Company> companyList = new ArrayList<Company>();
			companyList.add(companyService.getById(getCurrentUser().getCompany().getId()));
			ActionContext.getContext().put("companyList", companyList);
		}
		return "list";
	}

	/** 删除 */
	public String delete() throws Exception {
		companyService.delete(model.getId());
		return "toList";
	}

	/** 添加页面 */
	public String addUI() throws Exception {
		return "saveUI";
	}

	/** 添加 */
	public String add() throws Exception {
		companyService.save(model);
		return "toList";
	}

	/** 修改页面 */
	public String editUI() throws Exception {
		// 准备回显的数据
		Company company = companyService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(company);
		return "saveUI";
	}

	/** 修改 */
	public String edit() throws Exception {
		//Company company = companyService.getById(model.getId());
		companyService.update(model);
		return "toList";
	}
	
	/** 调到上传规章制度页面 */
	public String ruleUI() throws Exception {
		//需要确定规章制度的有无，扫描此时到底有没有对应的文件
		List<Boolean> fileBoolean = new ArrayList<Boolean>();
		String uploadPath = MyFileUtils.getCompanyPath();
		File file;
		for (int i = 0; i < pdfName.length; i++) {
			String filePath = uploadPath + "\\" +model.getId()+"_"+ pdfName[i];
			//System.out.println(filePath);
			file =new File(filePath);
			fileBoolean.add(i, file.exists());
		}
		file =null;
		ActionContext.getContext().put("fileBoolean", fileBoolean);
		return "rule";
	}
	
	
	
	/**上传规章制度 */
	public String rule() throws Exception {
		
		//通过配置文件得到上传的路径
		String uploadPath = MyFileUtils.getCompanyPath();
		if(pdf!=null){
			File savedir = new File(uploadPath);
			if(!savedir.exists()) savedir.mkdirs();
			for(int i = 0 ; i<pdf.length ; i++){
				//校验文件的后缀名,校验文件是否是我们需要的命名,
				if (MyFileUtils.validateContentType(pdfFileName[i],"pdf")&& MyFileUtils.validateFileName(pdfFileName[i],pdfName)) {
					//拼接文件名称
					String fileName = model.getId()+"_"+pdfFileName[i];
					File savefile = new File(savedir, fileName);
					FileUtils.copyFile(pdf[i], savefile);
				}
			}
		}	
		return "toRules";
	}
	
	/**
	 * 显示pdf文件在页面上
	 * @return
	 * @throws Exception
	 */
	public String showPDF() throws Exception {
		String uploadPath = MyFileUtils.getCompanyPath();
		String filePath = uploadPath + "\\" +model.getId()+"_"+ detailName+".pdf";
		ServletActionContext.getRequest().setAttribute("filePath", filePath);
		return "showPDF";		
	}
	
	
	/**
	 * @return the pdf
	 */
	public File[] getPdf() {
		return pdf;
	}

	/**
	 * @param pdf the pdf to set
	 */
	public void setPdf(File[] pdf) {
		this.pdf = pdf;
	}

	/**
	 * @return the pdfFileName
	 */
	public String[] getPdfFileName() {
		return pdfFileName;
	}

	/**
	 * @param pdfFileName the pdfFileName to set
	 */
	public void setPdfFileName(String[] pdfFileName) {
		this.pdfFileName = pdfFileName;
	}

	/**
	 * @return the detailName
	 */
	public String getDetailName() {
		return detailName;
	}

	/**
	 * @param detailName the detailName to set
	 */
	public void setDetailName(String detailName) {
		this.detailName = detailName;
	}

	

}
