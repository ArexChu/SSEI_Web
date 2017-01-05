package cn.ecust.ssei.service.impl.user;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cn.ecust.ssei.base.DaoSupportImpl;
import cn.ecust.ssei.domain.user.Role;
import cn.ecust.ssei.domain.user.User;
import cn.ecust.ssei.service.user.RoleService;

@Service
@Transactional
public class RoleServiceImpl extends DaoSupportImpl<Role> implements RoleService{


	@SuppressWarnings("unchecked")
	@Override
	public List<Role> findByPrivilege(User user) {
		if (user.getLoginName().equals("admin")||user.getCompany().getType()==3) {
			return findAll();//检验机构和管理员可以由所有的身份
		}else {
			return  getSession().createQuery(//
					"FROM Role r WHERE r.companyType=?")//
					.setParameter(0, user.getCompany().getType()).list();
		}
	}
	

}
