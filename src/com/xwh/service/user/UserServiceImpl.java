package com.xwh.service.user;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.xwh.dao.user.UserMapper;
import com.xwh.pojo.User;


@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {
	//声明usermapper接口引用
	@Resource
	private UserMapper UserMapper;
	
	public UserMapper getUserMapper() {
		return UserMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.UserMapper = userMapper;
	}

	/**
	 * 获得用户列表
	 */
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<User> findUsersWithConditions(User user) {
		try {
			return UserMapper.getUserList(user);
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * 新增用户
	 */
	
	public boolean addNewUser(User user) {
		boolean result=false;
		try {
			if (UserMapper.add(user)==1) {
				result=true;
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
		
		return result;
	}

}
