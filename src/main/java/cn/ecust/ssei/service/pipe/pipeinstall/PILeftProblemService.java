package cn.ecust.ssei.service.pipe.pipeinstall;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.pipe.pipeinstall.PILeftProblem;

public interface PILeftProblemService extends DaoSupport<PILeftProblem> {
	void generateFile(PILeftProblem piLeftProblem);
}
