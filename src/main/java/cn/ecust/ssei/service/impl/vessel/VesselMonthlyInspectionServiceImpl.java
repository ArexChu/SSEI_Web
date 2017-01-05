package cn.ecust.ssei.service.impl.vessel;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.VesselMonthlyInspection;
import cn.ecust.ssei.service.vessel.VesselMonthlyInspectionService;

@Service
@Transactional
public class VesselMonthlyInspectionServiceImpl extends DaoSupportImpl<VesselMonthlyInspection> implements VesselMonthlyInspectionService {


}
