package cn.ecust.ssei.service.vessel.periodical;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.periodical.VesselHeTest;

public interface VesselHeTestService  extends DaoSupport<VesselHeTest>{
	void generateFile(VesselHeTest vesselHeTest);
}
