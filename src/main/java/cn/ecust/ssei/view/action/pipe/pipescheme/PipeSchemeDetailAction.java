package cn.ecust.ssei.view.action.pipe.pipescheme;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.BaseAction;
import cn.ecust.ssei.domain.pipe.PipeBasic;
import cn.ecust.ssei.domain.pipe.PipeMaintain;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeDetailMaintain;
import cn.ecust.ssei.domain.pipe.pipeonlinemaintain.PipeOnlineMaintain;
import cn.ecust.ssei.util.QueryHelper;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class PipeSchemeDetailAction extends BaseAction<PipeMaintain> {
	
	private long basicId;

	public String listRecord() throws Exception {
		new QueryHelper(PipeMaintain.class, "p").//
		addCondition("p.pipeBasic.id=?", basicId).//
		addCondition(model.getM_Prop()!=null && !model.getM_Prop().isEmpty(), "m_Prop=?", model.getM_Prop()).
		addOrderProperty("p.m_Start_Date", false).//
		preparePageBean(pipeMaintainService, pageNum, pageSize);
		return "listRecord";
	}
	
	
	public String listProblem() throws Exception {
		new QueryHelper(PipeMaintain.class, "p").//
		addCondition("p.pipeBasic.id=?", basicId).//
		addCondition(model.getM_Prop()!=null && !model.getM_Prop().isEmpty(), "m_Prop=?", model.getM_Prop()).
		addOrderProperty("p.m_Start_Date", false).//
		preparePageBean(pipeMaintainService, pageNum, pageSize);
		return "listProblem";
	}
	
	
	/** 添加页面 */
	public String addUI() throws Exception {
		return "saveUI";
	}

	/** 添加 */
	public String add() throws Exception {
		PipeBasic pipeBasic = pipeBasciService.getById(basicId);
		model.setPipeBasic(pipeBasic);
		model.setP_finished("1");
		if (model.getM_Prop().equals("在线")) {
			model.setPipeOnlineMaintain(new PipeOnlineMaintain());
		}else {
			model.setPipeDetailMaintain(new PipeDetailMaintain());
		}
		pipeMaintainService.save(model);
		return "toList";
	}

	/** 修改页面 */
	public String editUI() throws Exception {
		PipeMaintain pipeMaintain = pipeMaintainService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(pipeMaintain);
		return "saveUI";
	}

	/** 修改 */
	public String edit() throws Exception {

		return "toList";
	}
	
	/** 删除 */
	public String delete() throws Exception {
		pipeMaintainService.delete(model.getId());
		return "toListRecord";
	}
	
	/**
	 * @return the basicId
	 */
	public long getBasicId() {
		return basicId;
	}

	/**
	 * @param basicId the basicId to set
	 */
	public void setBasicId(long basicId) {
		this.basicId = basicId;
	}
	
	
	

}
