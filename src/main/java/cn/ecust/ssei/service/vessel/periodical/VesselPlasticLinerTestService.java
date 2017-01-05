package cn.ecust.ssei.service.vessel.periodical;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.periodical.VesselPlasticLinerTest;

public interface VesselPlasticLinerTestService  extends DaoSupport<VesselPlasticLinerTest>{
	void generateFile(VesselPlasticLinerTest vesselPlasticLinerTest);
}
