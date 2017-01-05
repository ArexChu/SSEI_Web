package cn.ecust.ssei.service.vessel.periodical;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.periodical.VesselRadioTest;

public interface VesselRadioTestService  extends DaoSupport<VesselRadioTest>{
	void generateFile(VesselRadioTest vesselRadioTest);
}
