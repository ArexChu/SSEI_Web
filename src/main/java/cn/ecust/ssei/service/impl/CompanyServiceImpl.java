package cn.ecust.ssei.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.Company;
import cn.ecust.ssei.domain.user.User;
import cn.ecust.ssei.service.CompanyService;

@Service
@Transactional   
public class CompanyServiceImpl extends DaoSupportImpl<Company> implements CompanyService {


	@SuppressWarnings("unchecked")
	@Override
	public List<Company> findByPrivilege(User user) {
		if (user.getLoginName().equals("admin")||user.getCompany().getType()==3) {
			return findAll();
		}else {
			return  getSession().createQuery(//
					"FROM Company c WHERE c.name=?")//
					.setParameter(0, user.getCompany().getName()).list();
		}
	}

	@Override
	public Company findByCompanyName(String name) {
	
		return  (Company) getSession().createQuery(//
				"FROM Company c WHERE c.name=?")//
				.setParameter(0, name).uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Company> findUseCompanies() {
		 return  getSession().createQuery(//
				"FROM Company c WHERE c.type=?").setParameter(0, 1).list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Company> findDesignCompanies() {
		 return  getSession().createQuery(//
					"FROM Company c WHERE c.type=?").setParameter(0, 2).list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Company> findCheckCompanies() {
		 return  getSession().createQuery(//
					"FROM Company c WHERE c.type=?").setParameter(0, 3).list();
	}

}
