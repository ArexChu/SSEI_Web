package cn.ecust.ssei.service.pipe.pipeinstall;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.pipe.pipeinstall.PISafeCheck;

public interface PISafeCheckService extends DaoSupport<PISafeCheck>{
	void generateFile(PISafeCheck piSafeCheck);
}
