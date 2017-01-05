package cn.ecust.ssei.service.user;

import cn.ecust.ssei.base.DaoSupport;
import cn.ecust.ssei.domain.user.User;

public interface UserService extends DaoSupport<User>{
	/**
	 * 根据登录名与密码查询用户
	 * 
	 * @param loginName
	 * @param password
	 *            明文密码
	 * @return
	 */
	User findByLoginNameAndPassword(String loginName, String password);



}
