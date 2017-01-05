package cn.ecust.ssei.service.pipe.pipedetailmaintain;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeLeakTest;

public interface PipeLeakTestService   extends DaoSupport<PipeLeakTest> {

	void generateFile(PipeLeakTest pipeLeakTest);

}
