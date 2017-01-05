package cn.ecust.ssei.service.impl.vessel;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.vessel.VesselMaintain;
import cn.ecust.ssei.service.vessel.VesselMaintainService;

@Service
@Transactional
public class VesselMaintainServiceImpl extends DaoSupportImpl<VesselMaintain> implements VesselMaintainService {

	@Override
	public VesselMaintain findByMissionId(String mid) {
		// TODO Auto-generated method stub
		return (VesselMaintain) getSession().createQuery(//
				"FROM VesselMaintain v WHERE v.v_M_Massion_ID=?")//
				.setParameter(0, mid)//
				.uniqueResult();
	}

}
