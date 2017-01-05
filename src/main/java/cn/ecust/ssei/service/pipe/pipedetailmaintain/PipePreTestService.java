package cn.ecust.ssei.service.pipe.pipedetailmaintain;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipePreTest;

public interface PipePreTestService  extends DaoSupport<PipePreTest> {

	void generateFile(PipePreTest pipePreTest);

}
