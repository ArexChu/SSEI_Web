package cn.ecust.ssei.service.pipe.pipeinstall;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.pipe.pipeinstall.PISafeCheck1;

public interface PISafeCheck1Service extends DaoSupport<PISafeCheck1>{
	void generateFile(PISafeCheck1 piSafeCheck1);
}
