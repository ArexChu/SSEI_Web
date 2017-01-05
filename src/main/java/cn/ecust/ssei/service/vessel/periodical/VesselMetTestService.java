package cn.ecust.ssei.service.vessel.periodical;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.periodical.VesselMetTest;

public interface VesselMetTestService  extends DaoSupport<VesselMetTest> {
	void generateFile(VesselMetTest vesselMetTest);
}
