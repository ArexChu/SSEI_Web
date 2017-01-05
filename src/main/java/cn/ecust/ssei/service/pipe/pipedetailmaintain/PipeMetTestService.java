package cn.ecust.ssei.service.pipe.pipedetailmaintain;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeMetTest;

public interface PipeMetTestService  extends DaoSupport<PipeMetTest>  {

	void generateFile(PipeMetTest pipeMetTest);

}
