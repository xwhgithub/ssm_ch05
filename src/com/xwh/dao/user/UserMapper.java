package com.xwh.dao.user;

import java.util.List;

import com.xwh.pojo.User;

public interface UserMapper {
	/**
	 * 获得用户列表
	 * @param user
	 * @return
	 */
	List<User> getUserList(User user);
	
	/**
	 * 新增用户
	 * @param user
	 * @return
	 */
	public int add(User user);
}
