package cn.ecust.ssei.service.pipe.pipeonlinemaintain;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.pipe.pipeonlinemaintain.PipeOnlineThiTest;

public interface PipeOnlineThiTestService extends DaoSupport<PipeOnlineThiTest>{
	void generateFile(PipeOnlineThiTest pipeOnlineThiTest);
}
