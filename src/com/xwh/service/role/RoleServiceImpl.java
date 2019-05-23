package com.xwh.service.role;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.xwh.dao.role.RoleMapper;
import com.xwh.pojo.Role;
//使用注释声明事务 默认事务传播设置:REQUIRED
@Transactional
@Service("roleService")
public class RoleServiceImpl implements RoleService {
	
	@Resource(name="roleMapper")
	private RoleMapper roleMapper;
	
	/**
	 * 新增
	 */
	public boolean add(Role role) {
		boolean result=false;
		try {
			if (roleMapper.add(role)==1) {
				result=true;
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
		return result;
	}

	/**
	 * 修改
	 */
	public boolean modify(Role role) {
		boolean result=false;
		try {
			if (roleMapper.modify(role)==1) {
				result=true;
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
		return result;
	}

	/**
	 * 删除
	 */
	public boolean del(int id) {
		boolean result=false;
		try {
			if (roleMapper.del(id)==1) {
				result=true;
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
		return result;
	}

	/**
	 * 按照角色名称模糊查询,使用注解声明事务
	 */
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<Role> getRoleList(String roleName) {
		try {
			return roleMapper.getRoleList(roleName);
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

}
