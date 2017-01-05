package cn.ecust.ssei.service.pipe.pipeinstall;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.pipe.pipeinstall.PISafeCheck2;

public interface PISafeCheck2Service extends DaoSupport<PISafeCheck2> {
	void generateFile(PISafeCheck2 piSafeCheck2);
}
