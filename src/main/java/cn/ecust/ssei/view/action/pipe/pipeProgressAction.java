package cn.ecust.ssei.view.action.pipe;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ecust.ssei.base.BaseAction;
import cn.ecust.ssei.domain.pipe.PipeMaintain;

@Controller
@Scope("prototype")
public class pipeProgressAction  extends BaseAction<PipeMaintain>{
	
	/** 列表 */
	public String list() throws Exception {
		return null;
	}


}
