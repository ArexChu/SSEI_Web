package cn.ecust.ssei.service.pipe.pipeinstall;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.pipe.pipeinstall.PIComInf;

public interface PIComInfService extends DaoSupport<PIComInf> {
	void generateFile(PIComInf piComInf);
}
