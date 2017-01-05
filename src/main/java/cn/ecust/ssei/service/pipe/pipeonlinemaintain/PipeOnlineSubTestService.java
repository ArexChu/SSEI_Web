package cn.ecust.ssei.service.pipe.pipeonlinemaintain;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.pipe.pipeonlinemaintain.PipeOnlineSubTest;

public interface PipeOnlineSubTestService extends DaoSupport<PipeOnlineSubTest>{
	void generateFile(PipeOnlineSubTest pipeOnlineSubTest);
}
