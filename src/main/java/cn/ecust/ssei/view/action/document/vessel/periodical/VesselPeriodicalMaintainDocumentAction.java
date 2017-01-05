package cn.ecust.ssei.view.action.document.vessel.periodical;

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
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.util.Constant;
import cn.ecust.ssei.util.MyFileUtils;
import cn.ecust.ssei.util.jacob.JacobWord;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class VesselPeriodicalMaintainDocumentAction extends BaseAction<VesselPeriodicalMaintain> {
	private long vesselMaintainId;

	public String list() throws Exception {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselMaintainService.getById(vesselMaintainId).getVesselPeriodicalMaintain();
		List<Boolean> menuList = getMenuList(vesselPeriodicalMaintain);
		List<Boolean> fileList = getFileList(vesselPeriodicalMaintain);
		ActionContext.getContext().put("menuList", menuList);
		ActionContext.getContext().put("fileList", fileList);
		ActionContext.getContext().getValueStack().push(vesselPeriodicalMaintain);
		return "list";
	}
	
	private List<Boolean> getMenuList(VesselPeriodicalMaintain vesselPeriodicalMaintain) {
		List<Boolean> list = new ArrayList<Boolean>();
		if (vesselPeriodicalMaintain.getVesselMicroTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselThiTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselThiCheck()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselRadioTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselUltrasonicTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselTOFDTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselMagneticTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselPermTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselSonciTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselMatTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselHardTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselMetTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselSPDTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselPreTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselAirTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselAmmoniaTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselHeTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselAddTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselGlassTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselGraphiteTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselGraphiteLinerTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselGlassSteelTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselGlassSteelLinerTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselPlasticTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselPlasticLinerTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselConclusionTest()!=null) {
			list.add(true);
		}else {
			list.add(false);
		}
		return list;
	}
	
	
	private List<Boolean> getFileList(VesselPeriodicalMaintain vesselPeriodicalMaintain) {
		List<Boolean> list = new ArrayList<Boolean>();
		
		if (vesselPeriodicalMaintain.getVesselMicroTest()!=null) {
			list.add(hasFile("vesselMicroTest",vesselPeriodicalMaintain.getVesselMicroTest().getId()));
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselThiTest()!=null) {
			list.add(hasFile("vesselThiTest",vesselPeriodicalMaintain.getVesselThiTest().getId()));
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselThiCheck()!=null) {
			list.add(hasFile("vesselThiCheck",vesselPeriodicalMaintain.getVesselThiCheck().getId()));
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselRadioTest()!=null) {
			list.add(hasFile("vesselRadioTest",vesselPeriodicalMaintain.getVesselRadioTest().getId()));
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselUltrasonicTest()!=null) {
			list.add(hasFile("vesselUltrasonicTest",vesselPeriodicalMaintain.getVesselUltrasonicTest().getId()));
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselTOFDTest()!=null) {
			list.add(hasFile("vesselTOFDTest",vesselPeriodicalMaintain.getVesselTOFDTest().getId()));
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselMagneticTest()!=null) {
			list.add(hasFile("vesselMagneticTest",vesselPeriodicalMaintain.getVesselMagneticTest().getId()));
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselPermTest()!=null) {
			list.add(hasFile("vesselPermTest",vesselPeriodicalMaintain.getVesselPermTest().getId()));
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselSonciTest()!=null) {
			list.add(hasFile("vesselSonciTest",vesselPeriodicalMaintain.getVesselSonciTest().getId()));
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselMatTest()!=null) {
			list.add(hasFile("vesselMatTest",vesselPeriodicalMaintain.getVesselMatTest().getId()));
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselHardTest()!=null) {
			list.add(hasFile("vesselHardTest",vesselPeriodicalMaintain.getVesselHardTest().getId()));
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselMetTest()!=null) {
			list.add(hasFile("vesselMetTest",vesselPeriodicalMaintain.getVesselMetTest().getId()));
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselSPDTest()!=null) {
			list.add(hasFile("vesselSPDTest",vesselPeriodicalMaintain.getVesselSPDTest().getId()));
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselPreTest()!=null) {
			list.add(hasFile("vesselPreTest",vesselPeriodicalMaintain.getVesselPreTest().getId()));
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselAirTest()!=null) {
			list.add(hasFile("vesselAirTest",vesselPeriodicalMaintain.getVesselAirTest().getId()));
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselAmmoniaTest()!=null) {
			list.add(hasFile("vesselAmmoniaTest",vesselPeriodicalMaintain.getVesselAmmoniaTest().getId()));
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselHeTest()!=null) {
			list.add(hasFile("vesselHeTest",vesselPeriodicalMaintain.getVesselHeTest().getId()));
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselAddTest()!=null) {
			list.add(hasFile("vesselAddTest",vesselPeriodicalMaintain.getVesselAddTest().getId()));
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselGlassTest()!=null) {
			list.add(hasFile("vesselGlassTest",vesselPeriodicalMaintain.getVesselGlassTest().getId()));
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselGraphiteTest()!=null) {
			list.add(hasFile("vesselGraphiteTest",vesselPeriodicalMaintain.getVesselGraphiteTest().getId()));
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselGraphiteLinerTest()!=null) {
			list.add(hasFile("vesselGraphiteLinerTest",vesselPeriodicalMaintain.getVesselGraphiteLinerTest().getId()));
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselGlassSteelTest()!=null) {
			list.add(hasFile("vesselGlassSteelTest",vesselPeriodicalMaintain.getVesselGlassSteelTest().getId()));
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselGlassSteelLinerTest()!=null) {
			list.add(hasFile("vesselGlassSteelLinerTest",vesselPeriodicalMaintain.getVesselGlassSteelLinerTest().getId()));
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselPlasticTest()!=null) {
			list.add(hasFile("vesselPlasticTest",vesselPeriodicalMaintain.getVesselPlasticTest().getId()));
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselPlasticLinerTest()!=null) {
			list.add(hasFile("vesselPlasticLinerTest",vesselPeriodicalMaintain.getVesselPlasticLinerTest().getId()));
		}else {
			list.add(false);
		}
		if (vesselPeriodicalMaintain.getVesselConclusionTest()!=null) {
			list.add(hasFile("vesselConclusionTest",vesselPeriodicalMaintain.getVesselConclusionTest().getId()));
		}else {
			list.add(false);
		}
		list.add(hasFile("vesselBasic",vesselPeriodicalMaintain.getVesselMaintain().getVesselBasic().getId()));
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
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselMaintainService.getById(vesselMaintainId).getVesselPeriodicalMaintain();
		List<File> documentList = getDocumentList(vesselPeriodicalMaintain);
		long id = vesselPeriodicalMaintain.getId();
		String fileRootpath = MyFileUtils.getFilePath(id, "vesselPeriodical", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = id+"_vesselPeriodical.doc";
		String filePath = fileRootpath+"/"+fileName;//最终文档生成的位置
		JacobWord jacobWord = new JacobWord();
		jacobWord.mergeWord(documentList, filePath);
		return "toVesselPeriodicalDocumentMenuList";
	}
	
	public String download()throws Exception {
		VesselPeriodicalMaintain vesselPeriodicalMaintain = vesselMaintainService.getById(vesselMaintainId).getVesselPeriodicalMaintain();
		long id = vesselPeriodicalMaintain.getId();
		String fileRootpath = MyFileUtils.getFilePath(id, "vesselPeriodical", Constant.VESSEL_DOCUMENT_UPLOAD);
		String fileName = id+"_vesselPeriodical.doc";
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
	private List<File> getDocumentList(VesselPeriodicalMaintain vesselPeriodicalMaintain) {
		List<File> docFiles = new ArrayList<File>();
		if (vesselPeriodicalMaintain.getVesselConclusionTest()!=null) {
			addFileToList("vesselConclusionTest",vesselPeriodicalMaintain.getVesselConclusionTest().getId(),docFiles);
		}
		vesselBasicService.generateFile(vesselPeriodicalMaintain.getVesselMaintain());
		addFileToList("vesselBasic",vesselPeriodicalMaintain.getVesselMaintain().getVesselBasic().getId(),docFiles);
		if (vesselPeriodicalMaintain.getVesselMicroTest()!=null) {
			addFileToList("vesselMicroTest",vesselPeriodicalMaintain.getVesselMicroTest().getId(),docFiles);
		}
		if (vesselPeriodicalMaintain.getVesselThiTest()!=null) {
			addFileToList("vesselThiTest",vesselPeriodicalMaintain.getVesselThiTest().getId(),docFiles);
		}
		if (vesselPeriodicalMaintain.getVesselThiCheck()!=null) {
			addFileToList("vesselThiCheck",vesselPeriodicalMaintain.getVesselThiCheck().getId(),docFiles);
		}
		if (vesselPeriodicalMaintain.getVesselRadioTest()!=null) {
			addFileToList("vesselRadioTest",vesselPeriodicalMaintain.getVesselRadioTest().getId(),docFiles);
		}
		if (vesselPeriodicalMaintain.getVesselUltrasonicTest()!=null) {
			addFileToList("vesselUltrasonicTest",vesselPeriodicalMaintain.getVesselUltrasonicTest().getId(),docFiles);
		}
		if (vesselPeriodicalMaintain.getVesselTOFDTest()!=null) {
			addFileToList("vesselTOFDTest",vesselPeriodicalMaintain.getVesselTOFDTest().getId(),docFiles);
		}
		if (vesselPeriodicalMaintain.getVesselMagneticTest()!=null) {
			addFileToList("vesselMagneticTest",vesselPeriodicalMaintain.getVesselMagneticTest().getId(),docFiles);
		}
		if (vesselPeriodicalMaintain.getVesselPermTest()!=null) {
			addFileToList("vesselPermTest",vesselPeriodicalMaintain.getVesselPermTest().getId(),docFiles);
		}
		if (vesselPeriodicalMaintain.getVesselSonciTest()!=null) {
			addFileToList("vesselSonciTest",vesselPeriodicalMaintain.getVesselSonciTest().getId(),docFiles);
		}
		if (vesselPeriodicalMaintain.getVesselMatTest()!=null) {
			addFileToList("vesselMatTest",vesselPeriodicalMaintain.getVesselMatTest().getId(),docFiles);
		}
		if (vesselPeriodicalMaintain.getVesselHardTest()!=null) {
			addFileToList("vesselHardTest",vesselPeriodicalMaintain.getVesselHardTest().getId(),docFiles);
		}
		if (vesselPeriodicalMaintain.getVesselMetTest()!=null) {
			addFileToList("vesselMetTest",vesselPeriodicalMaintain.getVesselMetTest().getId(),docFiles);
		}
		if (vesselPeriodicalMaintain.getVesselSPDTest()!=null) {
			addFileToList("vesselSPDTest",vesselPeriodicalMaintain.getVesselSPDTest().getId(),docFiles);
		}
		if (vesselPeriodicalMaintain.getVesselPreTest()!=null) {
			addFileToList("vesselPreTest",vesselPeriodicalMaintain.getVesselPreTest().getId(),docFiles);
		}
		if (vesselPeriodicalMaintain.getVesselAirTest()!=null) {
			addFileToList("vesselAirTest",vesselPeriodicalMaintain.getVesselAirTest().getId(),docFiles);
		}
		if (vesselPeriodicalMaintain.getVesselAmmoniaTest()!=null) {
			addFileToList("vesselAmmoniaTest",vesselPeriodicalMaintain.getVesselAmmoniaTest().getId(),docFiles);
		}
		if (vesselPeriodicalMaintain.getVesselHeTest()!=null) {
			addFileToList("vesselHeTest",vesselPeriodicalMaintain.getVesselHeTest().getId(),docFiles);
		}
		if (vesselPeriodicalMaintain.getVesselAddTest()!=null) {
			addFileToList("vesselAddTest",vesselPeriodicalMaintain.getVesselAddTest().getId(),docFiles);
		}
		if (vesselPeriodicalMaintain.getVesselGlassTest()!=null) {
			addFileToList("vesselGlassTest",vesselPeriodicalMaintain.getVesselGlassTest().getId(),docFiles);
		}
		if (vesselPeriodicalMaintain.getVesselGraphiteTest()!=null) {
			addFileToList("vesselGraphiteTest",vesselPeriodicalMaintain.getVesselGraphiteTest().getId(),docFiles);
		}
		if (vesselPeriodicalMaintain.getVesselGraphiteLinerTest()!=null) {
			addFileToList("vesselGraphiteLinerTest",vesselPeriodicalMaintain.getVesselGraphiteLinerTest().getId(),docFiles);
		}
		if (vesselPeriodicalMaintain.getVesselGlassSteelTest()!=null) {
			addFileToList("vesselGlassSteelTest",vesselPeriodicalMaintain.getVesselGlassSteelTest().getId(),docFiles);
		}
		if (vesselPeriodicalMaintain.getVesselGlassSteelLinerTest()!=null) {
			addFileToList("vesselGlassSteelLinerTest",vesselPeriodicalMaintain.getVesselGlassSteelLinerTest().getId(),docFiles);
		}
		if (vesselPeriodicalMaintain.getVesselPlasticTest()!=null) {
			addFileToList("vesselPlasticTest",vesselPeriodicalMaintain.getVesselPlasticTest().getId(),docFiles);
		}
		if (vesselPeriodicalMaintain.getVesselPlasticLinerTest()!=null) {
			addFileToList("vesselPlasticLinerTest",vesselPeriodicalMaintain.getVesselPlasticLinerTest().getId(),docFiles);
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
