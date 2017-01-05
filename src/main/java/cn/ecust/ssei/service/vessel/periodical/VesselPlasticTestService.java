package cn.ecust.ssei.service.vessel.periodical;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.periodical.VesselPlasticTest;

public interface VesselPlasticTestService  extends DaoSupport<VesselPlasticTest>{
	void generateFile(VesselPlasticTest vesselPlasticTest);
}
