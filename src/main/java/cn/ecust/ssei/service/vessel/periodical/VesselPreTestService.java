package cn.ecust.ssei.service.vessel.periodical;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.periodical.VesselPreTest;

public interface VesselPreTestService  extends DaoSupport<VesselPreTest>{
	void generateFile(VesselPreTest vesselPreTest);
}
