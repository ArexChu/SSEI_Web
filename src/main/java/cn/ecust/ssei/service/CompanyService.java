package cn.ecust.ssei.service;


import java.util.List;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.Company;
import cn.ecust.ssei.domain.user.User;

public interface CompanyService extends DaoSupport<Company> {

	List<Company> findByPrivilege(User user);
	
	Company findByCompanyName(String name);
	
	List<Company> findUseCompanies();
	
	List<Company> findDesignCompanies();
	
	List<Company> findCheckCompanies();

}
