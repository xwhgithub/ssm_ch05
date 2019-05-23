package com.xwh.dao.user;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xwh.pojo.User;
import com.xwh.service.user.UserService;

import sun.util.logging.resources.logging;

public class UserTest {
	
	private Logger logger=Logger.getLogger(UserTest.class);
	@Before
	public void setUp() throws Exception {
	}
	
	/**
	 * 测试整合 获得用户列表
	 */
	@Test
	public void test() {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		UserService userService=(UserService)context.getBean("userService");
		User user=new User();
		user.setUserName("赵");
		user.setUserRole(3);
		List<User> userList=userService.findUsersWithConditions(user);
		for (User userResult : userList) {
			logger.debug("用户列表====>testGetUserList 用戶编码:"+userResult.getUserCode()
			+"\t用户名:"+userResult.getUserName()+"\t用户角色编码:"+userResult.getUserRole()
			+"\t用户角色名称:"+userResult.getUserRoleName()
			+"\t用户地址:"+userResult.getAddress());
		}
	}
	
	/**
	 * 测试新增结果
	 */
	@Test
	public void addTest(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		UserService userService=(UserService)context.getBean("userService");
		User user = new User();
		user.setUserCode("test007");
		user.setUserName("测试用户007");
		user.setUserPassword("1234567");
		Date birthday=null;;
		try {
			birthday = new SimpleDateFormat("yyyy-MM-dd").parse("1984-12-12");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		user.setBirthday(birthday);
		user.setAddress("地址测试");
		user.setGender(1);
		user.setPhone("13666666666");
		user.setUserRole(1);
		user.setCreatedBy(1);
		user.setCreationDate(new Date());
		
		boolean result=userService.addNewUser(user);
		
		logger.debug("新增用户结果   testAdd==>"+result);
	}
}
