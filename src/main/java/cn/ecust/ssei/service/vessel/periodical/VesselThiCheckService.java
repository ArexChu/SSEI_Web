package cn.ecust.ssei.service.vessel.periodical;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.vessel.periodical.VesselThiCheck;

public interface VesselThiCheckService  extends DaoSupport<VesselThiCheck>{
	void generateFile(VesselThiCheck vesselThiCheck);
}
