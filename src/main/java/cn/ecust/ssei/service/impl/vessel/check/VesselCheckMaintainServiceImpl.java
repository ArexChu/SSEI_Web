package cn.ecust.ssei.service.impl.vessel.check;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.check.VesselCheckMaintain;
import cn.ecust.ssei.service.vessel.check.VesselCheckMaintainService;

@Service
@Transactional
public class VesselCheckMaintainServiceImpl  extends DaoSupportImpl<VesselCheckMaintain> implements VesselCheckMaintainService{


}
