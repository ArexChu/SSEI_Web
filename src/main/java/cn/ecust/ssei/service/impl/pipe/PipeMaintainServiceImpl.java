package cn.ecust.ssei.service.impl.pipe;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.pipe.PipeMaintain;
import cn.ecust.ssei.service.pipe.PipeMaintainService;

@Service
@Transactional
public class PipeMaintainServiceImpl extends DaoSupportImpl<PipeMaintain> implements PipeMaintainService{

	@Override
	public PipeMaintain findByMaintainId(String maintainId) {
		// TODO Auto-generated method stub
		return (PipeMaintain) getSession().createQuery(//
				"FROM PipeMaintain p WHERE p.m_ID=?")//
				.setParameter(0, maintainId)//
				.uniqueResult();
	}

}
