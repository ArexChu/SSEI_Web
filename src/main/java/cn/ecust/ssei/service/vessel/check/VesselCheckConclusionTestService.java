package cn.ecust.ssei.service.vessel.check;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.check.VesselCheckConclusionTest;

public interface VesselCheckConclusionTestService extends DaoSupport<VesselCheckConclusionTest> {

	void generateFile(VesselCheckConclusionTest vesselCheckConclusionTest);

}
