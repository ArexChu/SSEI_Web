package cn.ecust.ssei.service.pipe.pipedetailmaintain;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeVerification;

public interface PipeVerficationService  extends DaoSupport<PipeVerification>  {

	void generateFile(PipeVerification pipeVerification);
}
