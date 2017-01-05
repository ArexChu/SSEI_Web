package cn.ecust.ssei.service.pipe.pipeinstall;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.pipe.pipeinstall.PICheckInf;

public interface PICheckInfService extends DaoSupport<PICheckInf> {
	void generateFile(PICheckInf piCheckInf);
}
