package cn.ecust.ssei.service.vessel.periodical;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.periodical.VesselUltrasonicTest;

public interface VesselUltrasonicTestService  extends DaoSupport<VesselUltrasonicTest>{
	void generateFile(VesselUltrasonicTest vesselUltrasonicTest);
}
