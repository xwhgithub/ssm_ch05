package com.xwh.dao.role;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xwh.pojo.Role;

/**
 * 角色类接口
 * @author Administrator
 *
 */
public interface RoleMapper {
	/**
	 * 新增
	 * @param role
	 * @return
	 */
	int add(Role role);
	
	/**
	 * 修改
	 * @param role
	 * @return
	 */
	int modify(Role role);
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	int del(@Param("id") int id);
	/**
	 * 第三章简答根据角色名称模糊查询 获得角色列表 分页 
	 * @param roleName
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	List<Role> getRoleList(@Param("roleName") String roleName);
}
