package cn.ecust.ssei.service.pipe.pipedetailmaintain;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeThiTest;

public interface PipeThiTestService  extends DaoSupport<PipeThiTest>  {

	void generateFile(PipeThiTest pipeThiTest);
}
