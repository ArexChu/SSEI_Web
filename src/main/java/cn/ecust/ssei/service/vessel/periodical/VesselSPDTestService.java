package cn.ecust.ssei.service.vessel.periodical;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.periodical.VesselSPDTest;

public interface VesselSPDTestService extends DaoSupport<VesselSPDTest> {
	void generateFile(VesselSPDTest vesselSPDTest);
}
