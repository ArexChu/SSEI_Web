package cn.ecust.ssei.service.pipe.pipeinstall;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.pipe.pipeinstall.PISafeCheck3;

public interface PISafeCheck3Service extends DaoSupport<PISafeCheck3>{
	void generateFile(PISafeCheck3 piSafeCheck3);
}
