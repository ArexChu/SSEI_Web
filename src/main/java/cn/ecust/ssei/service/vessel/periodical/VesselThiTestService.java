package cn.ecust.ssei.service.vessel.periodical;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.periodical.VesselThiTest;

public interface VesselThiTestService  extends DaoSupport<VesselThiTest>{
	void generateFile(VesselThiTest vesselThiTest);
}
