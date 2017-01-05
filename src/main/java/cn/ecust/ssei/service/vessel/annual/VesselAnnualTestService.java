package cn.ecust.ssei.service.vessel.annual;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.annual.VesselAnnualTest;

public interface VesselAnnualTestService extends DaoSupport<VesselAnnualTest> {

	void generateFile(VesselAnnualTest vesselAnnualTest);

}
