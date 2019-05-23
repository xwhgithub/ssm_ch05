package com.xwh.service.user;

import java.util.List;

import com.xwh.pojo.User;

public interface UserService {
	/**
	 * 获得用户列表
	 * @param user
	 * @return
	 */
	public List<User> findUsersWithConditions(User user);
	/**
	 * 新增用户
	 * @param user
	 * @return
	 */
	public boolean addNewUser(User user);
}
