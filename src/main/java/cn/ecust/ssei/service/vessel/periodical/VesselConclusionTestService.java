package cn.ecust.ssei.service.vessel.periodical;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.periodical.VesselConclusionTest;

public interface VesselConclusionTestService  extends DaoSupport<VesselConclusionTest> {
	void generateFile(VesselConclusionTest vesselConclusionTest);
}
