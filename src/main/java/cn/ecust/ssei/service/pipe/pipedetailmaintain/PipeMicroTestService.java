package cn.ecust.ssei.service.pipe.pipedetailmaintain;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeMicroTest;

public interface PipeMicroTestService  extends DaoSupport<PipeMicroTest>  {

	void generateFile(PipeMicroTest pipeMicroTest);
}
