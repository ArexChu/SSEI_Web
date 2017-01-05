package cn.ecust.ssei.service.vessel.periodical;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.periodical.VesselAirTest;

public interface VesselAirTestService  extends DaoSupport<VesselAirTest> {

	void generateFile(VesselAirTest vesselAirTest);

}
