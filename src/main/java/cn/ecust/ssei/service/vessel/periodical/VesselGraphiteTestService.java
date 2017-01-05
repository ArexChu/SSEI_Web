package cn.ecust.ssei.service.vessel.periodical;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.periodical.VesselGraphiteTest;

public interface VesselGraphiteTestService  extends DaoSupport<VesselGraphiteTest> {
	void generateFile(VesselGraphiteTest vesselGraphiteTest);
}
