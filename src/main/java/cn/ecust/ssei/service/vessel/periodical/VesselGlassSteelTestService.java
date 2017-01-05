package cn.ecust.ssei.service.vessel.periodical;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.periodical.VesselGlassSteelTest;

public interface VesselGlassSteelTestService  extends DaoSupport<VesselGlassSteelTest> {
	void generateFile(VesselGlassSteelTest vesselGlassSteelTest);
}
