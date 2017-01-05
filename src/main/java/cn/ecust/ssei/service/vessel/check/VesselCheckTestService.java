package cn.ecust.ssei.service.vessel.check;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.check.VesselCheckTest;

public interface VesselCheckTestService extends DaoSupport<VesselCheckTest> {

	void generateFile(VesselCheckTest vesselCheckTest);

}
