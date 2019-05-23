package com.xwh.dao.role;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xwh.pojo.Role;
import com.xwh.service.role.RoleService;

public class RoleTest {
	
	private Logger logger=Logger.getLogger(RoleTest.class);
	
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * 测试按照角色名称模糊查询角色列表
	 */
	@Test
	public void test() {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		RoleService roleService=(RoleService)context.getBean("roleService");
		List<Role> roleList=roleService.getRoleList("员");
		logger.debug("=============角色列表===========");
		for (Role role : roleList) {
			logger.debug("角色名称==>"+role.getRoleName()
			+"\t角色编码===>"+role.getRoleCode()
			+"\t创建时间==>"+role.getCreationDate());
		}
	}

	/**
	 * 测试增加用户
	 */
	@Test
	public void addTest(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		RoleService roleService=(RoleService)context.getBean("roleService");
		Role role=new Role();
		role.setRoleName("测试001");
		role.setRoleCode("cs001");
		role.setCreatedBy(1);
		role.setCreationDate(new Date());
		String result=roleService.add(role)==true?"增加角色成功":"增加角色失败";
		logger.debug("测试增加用户结果=====>:"+result);
	}
}
