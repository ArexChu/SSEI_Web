package cn.ecust.ssei.service.pipe.pipedetailmaintain;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeSPDTest;

public interface PipeSPDTestService  extends DaoSupport<PipeSPDTest>  {

	void generateFile(PipeSPDTest pipeSPDTest);

}
