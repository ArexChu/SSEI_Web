package cn.ecust.ssei.service.vessel.periodical;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.periodical.VesselSonciTest;

public interface VesselSonciTestService  extends DaoSupport<VesselSonciTest>{
	void generateFile(VesselSonciTest vesselSonciTest);
}
