package cn.ecust.ssei.service.vessel.periodical;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.periodical.VesselMicroTest;

public interface VesselMicroTestService  extends DaoSupport<VesselMicroTest> {
	void generateFile(VesselMicroTest vesselMicroTest);
}
