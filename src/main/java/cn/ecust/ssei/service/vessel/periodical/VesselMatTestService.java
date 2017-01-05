package cn.ecust.ssei.service.vessel.periodical;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.periodical.VesselMatTest;

public interface VesselMatTestService   extends DaoSupport<VesselMatTest>{
	void generateFile(VesselMatTest vesselMatTest);
}
