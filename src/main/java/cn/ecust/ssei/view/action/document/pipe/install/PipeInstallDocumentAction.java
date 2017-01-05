package cn.ecust.ssei.view.action.document.pipe.install;

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
import cn.ecust.ssei.util.jacob.JacobWord;

import com.opensymphony.xwork2.ActionContext;


@Controller
@Scope("prototype")
public class PipeInstallDocumentAction extends BaseAction<PipeInstall> {
	private Long constructComId;
	private long installId;
	
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
	
	/** 跳向检验项目的页面 */
	public String toFileUI() throws Exception {
		// 准备回显的数据
		PipeInstall pipeInstall = pipeInstallService.getById(model.getId());
		List<Boolean> menuList = getMenuList(pipeInstall);
		List<Boolean> fileList = getFileList(pipeInstall);
		ActionContext.getContext().put("menuList", menuList);
		ActionContext.getContext().put("fileList", fileList);
		ActionContext.getContext().getValueStack().push(pipeInstall);
		return "listFile";
	}
	
	
	public String download()throws Exception {
		long id = model.getId();
		String fileRootpath = MyFileUtils.getFilePath(id, "pipeInstall", Constant.PIPE_DOCUMENT_UPLOAD);
		String fileName = id+"_pipeInstall.doc";
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
	
		private List<Boolean> getFileList(PipeInstall pipeInstall) {
			List<Boolean> list = new ArrayList<Boolean>();
			if (pipeInstall.getPiConclusion()==null) {
				list.add(false);
			}else {
				list.add(hasFile("piConclusion",pipeInstall.getPiConclusion().getId()));
			}
			if (pipeInstall.getPiBasic()==null) {
				list.add(false);
			}else {
				list.add(hasFile("piBasic",pipeInstall.getPiBasic().getId()));
			}
			if (pipeInstall.getPiCheckInf()==null) {
				list.add(false);
			}else {
				list.add(hasFile("piCheckInf",pipeInstall.getPiCheckInf().getId()));
			}
			if (pipeInstall.getPiComInf()==null) {
				list.add(false);
			}else {
				list.add(hasFile("piComInf",pipeInstall.getPiComInf().getId()));
			}
			if (pipeInstall.getPiSafeCheck()==null) {
				list.add(false);
			}else {
				list.add(hasFile("piSafeCheck",pipeInstall.getPiSafeCheck().getId()));
			}
			if (pipeInstall.getPiSafeCheck1()==null) {
				list.add(false);
			}else {
				list.add(hasFile("piSafeCheck1",pipeInstall.getPiSafeCheck1().getId()));
			}
			if (pipeInstall.getPiSafeCheck2()==null) {
				list.add(false);
			}else {
				list.add(hasFile("piSafeCheck2",pipeInstall.getPiSafeCheck2().getId()));
			}
			if (pipeInstall.getPiSafeCheck3()==null) {
				list.add(false);
			}else {
				list.add(hasFile("piSafeCheck3",pipeInstall.getPiSafeCheck3().getId()));
			}
			if (pipeInstall.getPipeCompleteInf()==null) {
				list.add(false);
			}else {
				list.add(hasFile("pipeCompleteInf",pipeInstall.getPipeCompleteInf().getId()));
			}
			if (pipeInstall.getPiLeftProblem()==null) {
				list.add(false);
			}else {
				list.add(hasFile("piLeftProblem",pipeInstall.getPiLeftProblem().getId()));
			}
			if (pipeInstall.getPiReview()==null) {
				list.add(false);
			}else {
				list.add(hasFile("piReview",pipeInstall.getPiReview().getId()));
			}
			list.add(hasFile("pipeInstall",pipeInstall.getId()));
			return list;
		}
		
		
		/**
		 * 按顺序拼接word文档
		 * @return
		 * @throws Exception
		 */
		public String createFinalFile() throws Exception {
			PipeInstall pipeInstall = pipeInstallService.getById(model.getId());
			List<File> documentList = getDocumentList(pipeInstall);
			long id = pipeInstall.getId();
			String fileRootpath = MyFileUtils.getFilePath(id, "pipeInstall", Constant.PIPE_DOCUMENT_UPLOAD);
			String fileName = id+"_pipeInstall.doc";
			String filePath = fileRootpath+"/"+fileName;//最终文档生成的位置
			JacobWord jacobWord = new JacobWord();
			jacobWord.mergeWord(documentList, filePath);
			setInstallId(id);
			return "toPipeInstallDocumentMenuList";
		}
		
		/**
		 * 按顺序将有的文件加入到集合中
		 * @param pipeDetailMaintain
		 * @return
		 */
		private List<File> getDocumentList(PipeInstall pipeInstall) {
			List<File> docFiles = new ArrayList<File>();
			/**
			 * 处理管道基础信息的表
			 */
			pipeInstallService.generateFile(pipeInstall);
			addFileToList("pipeInstallBasic",pipeInstall.getId(),docFiles);
			if (pipeInstall.getPiConclusion()!=null) {
				addFileToList("piConclusion",pipeInstall.getPiConclusion().getId(),docFiles);
			}
			
			if (pipeInstall.getPiBasic()!=null) {
				addFileToList("piBasic",pipeInstall.getPiBasic().getId(),docFiles);
			}
			if (pipeInstall.getPiCheckInf()!=null) {
				addFileToList("piCheckInf",pipeInstall.getPiCheckInf().getId(),docFiles);
			}
			if (pipeInstall.getPiComInf()!=null) {
				addFileToList("piComInf",pipeInstall.getPiComInf().getId(),docFiles);
			}
			if (pipeInstall.getPiSafeCheck()!=null) {
				addFileToList("piSafeCheck",pipeInstall.getPiSafeCheck().getId(),docFiles);
			}
			if (pipeInstall.getPiSafeCheck1()!=null) {
				addFileToList("piSafeCheck1",pipeInstall.getPiSafeCheck1().getId(),docFiles);
			}
			if (pipeInstall.getPiSafeCheck2()!=null) {
				addFileToList("piSafeCheck2",pipeInstall.getPiSafeCheck2().getId(),docFiles);
			}
			if (pipeInstall.getPiSafeCheck3()!=null) {
				addFileToList("piSafeCheck3",pipeInstall.getPiSafeCheck3().getId(),docFiles);
			}
			if (pipeInstall.getPipeCompleteInf()!=null) {
				addFileToList("pipeCompleteInf",pipeInstall.getPipeCompleteInf().getId(),docFiles);
			}
			if (pipeInstall.getPiLeftProblem()!=null) {
				addFileToList("piLeftProblem",pipeInstall.getPiLeftProblem().getId(),docFiles);
			}
			if (pipeInstall.getPiReview()!=null) {
				addFileToList("piReview",pipeInstall.getPiReview().getId(),docFiles);
			}
			return docFiles;
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
	
	private QueryHelper getbyCondition() {
		String pi_ID = model.getPi_ID();
		String pi_Name = model.getPi_Name();
		QueryHelper queryHelper = new QueryHelper(PipeInstall.class, "p").
		addCondition(pi_ID!=null && !pi_ID.isEmpty(), "p.pi_ID = ?", pi_ID).//
		addCondition(pi_Name!=null && !pi_Name.isEmpty(), "p.pi_Name = ?", pi_Name).//
		addCondition(constructComId!=null,  "p.pi_Cons_Com.id = ?", constructComId);
		queryHelper.addOrderProperty("p.id", false);//新添加的在前
		return queryHelper;
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
	 * @return the installId
	 */
	public long getInstallId() {
		return installId;
	}

	/**
	 * @param installId the installId to set
	 */
	public void setInstallId(long installId) {
		this.installId = installId;
	}
	
	
	
}
