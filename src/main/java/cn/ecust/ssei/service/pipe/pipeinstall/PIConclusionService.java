package cn.ecust.ssei.service.pipe.pipeinstall;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.pipe.pipeinstall.PIConclusion;

public interface PIConclusionService extends DaoSupport<PIConclusion> {
	
	void generateFile(PIConclusion piConclusion);
}
