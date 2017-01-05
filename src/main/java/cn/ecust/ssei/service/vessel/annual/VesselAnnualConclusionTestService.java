package cn.ecust.ssei.service.vessel.annual;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.annual.VesselAnnualConclusionTest;

public interface VesselAnnualConclusionTestService extends DaoSupport<VesselAnnualConclusionTest> {

	void generateFile(VesselAnnualConclusionTest vesselAnnualConclusionTest);

}
