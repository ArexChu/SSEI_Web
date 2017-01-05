package cn.ecust.ssei.service.vessel.periodical;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.periodical.VesselAmmoniaTest;

public interface VesselAmmoniaTestService  extends DaoSupport<VesselAmmoniaTest> {
	void generateFile(VesselAmmoniaTest vesselAmmoniaTest);
}
