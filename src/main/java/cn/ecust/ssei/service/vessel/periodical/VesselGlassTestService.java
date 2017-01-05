package cn.ecust.ssei.service.vessel.periodical;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.periodical.VesselGlassTest;

public interface VesselGlassTestService  extends DaoSupport<VesselGlassTest> {
	void generateFile(VesselGlassTest vesselGlassTest);
}
