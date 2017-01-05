package cn.ecust.ssei.view.action.pipe.pipemaintain.detail;

import java.io.File;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.PipeDetailBaseAction;
import cn.ecust.ssei.domain.pipe.PipeBasic;
import cn.ecust.ssei.domain.pipe.PipeMaintain;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeDetailMaintain;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeVerification;
import cn.ecust.ssei.util.MyFileUtils;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class PipeVerificationAction  extends PipeDetailBaseAction<PipeVerification> {
	
	private String nextDetailMaintainDate;
	private String m_Bas_Prob;
	
	
	/**
	 * 删除
	 * @return
	 * @throws Exception
	 */
	public String delete() throws Exception{
		long id =preDelete();
		pipeVerficationService.delete(id);
		return "toPipeDetailMaintainList";
	}
	

	public String editUI() throws Exception {
		PipeDetailMaintain pipeDetailMaintain = pipeDetailMaintainService.getById(detailid);
		PipeVerification pipeVerification = pipeDetailMaintain.getPipeVerification();
		nextDetailMaintainDate=pipeDetailMaintain.getPipeMaintain().getPipeBasic().getNextDetailMaintainDate();
		m_Bas_Prob=pipeDetailMaintain.getPipeMaintain().getM_Bas_Prob();
		ActionContext.getContext().getValueStack().push(pipeVerification);
		return "saveUI";
	}

	public String edit() throws Exception{
		PipeVerification pipeVerification = pipeVerficationService.getById(model.getId());
		pipeVerification.setM_Original_Data(model.getM_Original_Data());
		pipeVerification.setM_Rules(model.getM_Rules());
		pipeVerification.setM_Items(model.getM_Items());
		pipeVerification.setM_Gra(model.getM_Gra());
		pipeVerification.setM_Max_Pre(model.getM_Max_Pre());
		pipeVerification.setM_Tem(model.getM_Tem());
		pipeVerification.setM_Med(model.getM_Med());
		pipeVerification.setM_Limit(model.getM_Limit());
		pipeVerification.setM_Reasion(model.getM_Reasion());
		pipeVerification.setM_Others(model.getM_Others());
		pipeVerification.setM_Test_Equ(model.getM_Test_Equ());
		pipeVerification.setM_Test_Remark(model.getM_Test_Remark());
		pipeVerification.setM_Check_Date(model.getM_Check_Date());
		pipeVerification.setM_Test_Date(model.getM_Test_Date());
		PipeMaintain pipeMaintain = pipeVerification.getPipeDetailMaintain().getPipeMaintain();
		pipeMaintain.setM_Bas_Prob(m_Bas_Prob);
		PipeBasic pipeBasic = pipeMaintain.getPipeBasic();
		pipeBasic.setNextDetailMaintainDate(nextDetailMaintainDate);
		pipeMaintainService.update(pipeMaintain);
		return "toPipeDetailMaintainList";
	}
	
	public String generateFile() throws Exception{
		PipeDetailMaintain pipeDetailMaintain = pipeDetailMaintainService.getById(detailid);
		PipeVerification pipeVerification = pipeDetailMaintain.getPipeVerification();
		pipeVerficationService.generateFile(pipeVerification);	
		return "toPipeDetailMaintainDocumentList";
	}
	
	public String download()throws Exception {
		String path = makeSurePath();
		return super.out(path);
	}
	
	public String deleteFile() throws Exception{
		String path = makeSurePath();
		File file = new File(path);
		file.delete();
		return "toPipeDetailMaintainDocumentList";
	}
	
	private String makeSurePath() {
		PipeDetailMaintain pipeDetailMaintain = pipeDetailMaintainService.getById(detailid);
		PipeVerification pipeVerification = pipeDetailMaintain.getPipeVerification();
		String fileRootpath = MyFileUtils.getFilePath(pipeVerification.getId(), "pipeVerification", 3);
		String fileName = pipeVerification.getId()+"_pipeVerification.doc";
		String path = fileRootpath+"/"+fileName;//最终文档生成的位置
		return path;
	}
	
	
	/**
	 * @return the nextDetailMaintainDate
	 */
	public String getNextDetailMaintainDate() {
		return nextDetailMaintainDate;
	}

	/**
	 * @param nextDetailMaintainDate the nextDetailMaintainDate to set
	 */
	public void setNextDetailMaintainDate(String nextDetailMaintainDate) {
		this.nextDetailMaintainDate = nextDetailMaintainDate;
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
