package cn.ecust.ssei.service.pipe.pipeinstall;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.pipe.pipeinstall.PipeCompleteInf;

public interface PipeCompleteInfService extends DaoSupport<PipeCompleteInf> {
	void generateFile(PipeCompleteInf pipeCompleteInf);
}
