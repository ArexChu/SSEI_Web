package cn.ecust.ssei.service.vessel.periodical;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.periodical.VesselGlassSteelLinerTest;

public interface VesselGlassSteelLinerTestService  extends DaoSupport<VesselGlassSteelLinerTest> {
	void generateFile(VesselGlassSteelLinerTest  vesselGlassSteelLinerTest);
}
