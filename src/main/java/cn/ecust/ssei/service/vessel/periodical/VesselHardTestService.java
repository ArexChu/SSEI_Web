package cn.ecust.ssei.service.vessel.periodical;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.periodical.VesselHardTest;

public interface VesselHardTestService   extends DaoSupport<VesselHardTest>{
	void generateFile(VesselHardTest  vesselHardTest);
}	
