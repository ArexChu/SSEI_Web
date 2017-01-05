package cn.ecust.ssei.service.pipe.pipedetailmaintain;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeAssTable;

public interface PipeAssTableService extends DaoSupport<PipeAssTable> {

	void generateFile(PipeAssTable pipeAssTable);
}
