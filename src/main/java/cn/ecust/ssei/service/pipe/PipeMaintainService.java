package cn.ecust.ssei.service.pipe;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.pipe.PipeMaintain;

public interface PipeMaintainService extends DaoSupport<PipeMaintain>{
	
	PipeMaintain findByMaintainId(String maintainId);


}
