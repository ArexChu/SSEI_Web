package cn.ecust.ssei.service.vessel.periodical;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.periodical.VesselPermTest;

public interface VesselPermTestService  extends DaoSupport<VesselPermTest>{
	void generateFile(VesselPermTest vesselPermTest);
}
