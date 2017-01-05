package cn.ecust.ssei.service.vessel.periodical;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.periodical.VesselMagneticTest;

public interface VesselMagneticTestService  extends DaoSupport<VesselMagneticTest> {
	void generateFile(VesselMagneticTest vesselMagneticTest);
}
