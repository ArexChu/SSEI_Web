package cn.ecust.ssei.service.vessel.periodical;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.periodical.VesselTOFDTest;

public interface VesselTOFDTestService extends DaoSupport<VesselTOFDTest> {
	void generateFile(VesselTOFDTest vesselTOFDTest);
}
