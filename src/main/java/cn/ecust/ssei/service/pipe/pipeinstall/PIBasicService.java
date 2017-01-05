package cn.ecust.ssei.service.pipe.pipeinstall;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.pipe.pipeinstall.PIBasic;

public interface PIBasicService  extends DaoSupport<PIBasic> {
	void generateFile(PIBasic piBasic);
}
