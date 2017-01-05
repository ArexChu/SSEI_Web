package cn.ecust.ssei.service.vessel.periodical;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.periodical.VesselAddTest;

public interface VesselAddTestService  extends DaoSupport<VesselAddTest> {

	void generateFile(VesselAddTest vesselAddTest);

}
