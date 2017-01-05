package cn.ecust.ssei.service.impl.vessel.annual;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.annual.VesselAnnualMaintain;
import cn.ecust.ssei.service.vessel.annual.VesselAnnualMaintainService;

@Service
@Transactional
public class VesselAnnualMaintainServiceImpl extends DaoSupportImpl<VesselAnnualMaintain> implements VesselAnnualMaintainService{


}
