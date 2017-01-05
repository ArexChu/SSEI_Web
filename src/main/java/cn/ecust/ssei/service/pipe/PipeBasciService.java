package cn.ecust.ssei.service.pipe;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.PageBean;
import cn.ecust.ssei.domain.pipe.PipeBasic;
import cn.ecust.ssei.domain.pipe.PipeMaintain;

public interface PipeBasciService extends DaoSupport<PipeBasic>{

	PipeBasic getByPipeId(String id);
	
	void generateFile(PipeMaintain pipeMaintain);

	PageBean getPageBean(int pageNum, int pageSize, Long companyId);

	PipeBasic getByPipeSysIdAndType(String p_Sys_ID, String type);

}
