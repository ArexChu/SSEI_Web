package cn.ecust.ssei.service.pipe.pipedetailmaintain;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeHardTest;

public interface PipeHardTestService  extends DaoSupport<PipeHardTest> {

	void generateFile(PipeHardTest pipeHardTest);

}
