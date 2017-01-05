package cn.ecust.ssei.service.user;

import java.util.List;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.user.Role;
import cn.ecust.ssei.domain.user.User;


public interface RoleService extends DaoSupport<Role> {

	/**
	 * 根据不同的企业类型返回不同的权限
	 * @param currentUser
	 * @return
	 */
	List<Role> findByPrivilege(User currentUser);


}
