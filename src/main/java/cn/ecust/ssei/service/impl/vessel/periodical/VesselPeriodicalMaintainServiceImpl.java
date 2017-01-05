package cn.ecust.ssei.service.impl.vessel.periodical;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.periodical.VesselPeriodicalMaintain;
import cn.ecust.ssei.service.vessel.periodical.VesselPeriodicalMaintainService;
@Service
@Transactional
public class VesselPeriodicalMaintainServiceImpl  extends DaoSupportImpl<VesselPeriodicalMaintain>  implements VesselPeriodicalMaintainService{

}
