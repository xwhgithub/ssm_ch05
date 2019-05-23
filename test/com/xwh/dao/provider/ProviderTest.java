package com.xwh.dao.provider;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xwh.dao.bill.BillTest;
import com.xwh.pojo.Provider;
import com.xwh.service.provider.ProviderService;

public class ProviderTest {
	
	private Logger logger=Logger.getLogger(BillTest.class);
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * 测试模糊查询供应商列表
	 */
	@Test
	public void test() {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		ProviderService pService=(ProviderService)context.getBean("providerService");
		String proName="北京";
		List<Provider> pList=pService.getProviderList(proName);
		logger.debug("=====================打印");
		for (Provider provider : pList) {
			logger.debug("供应商列表====> 供应商名称:"+provider.getProName()
			+"\t供应商电话:"+provider.getProPhone()
			+"\t供应商编码:"+provider.getProCode());
		}
	}
	
	/**
	 * 测试新增供应商
	 */
	@Test
	public void addTest(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		ProviderService pService=(ProviderService)context.getBean("providerService");
		Provider pro=new Provider();
		pro.setProCode("测试001");
		pro.setProName("啊啊啊啊");
		pro.setProDesc("郴州人");
		pro.setProContact("联系");
		pro.setProPhone("19999999999");
		pro.setProAddress("澄江路");
		pro.setProFax("010-9999");
		pro.setCreatedBy(1);
		pro.setCreationDate(new Date());
		boolean flag=pService.add(pro);
		String result=flag==true?"成功":"失败";
		logger.debug("增加供应商===>"+result);
	}
	
	/**
	 * 测试修改供应商
	 */
	@Test
	public void modfiyTest(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		ProviderService pService=(ProviderService)context.getBean("providerService");
		Provider pro=new Provider();
		pro.setId(20);
		pro.setProCode("测试009");
		pro.setProName("叽叽歪歪");
		pro.setProDesc("郴州人");
		pro.setProContact("联系");
		pro.setProPhone("19999999999");
		pro.setProAddress("郴江路");
		pro.setProFax("");
		pro.setModifyBy(1);
		pro.setModifyDate(new Date());
		boolean flag=pService.modify(pro);
		String result=flag==true?"修改成功":"修改失败";
		logger.debug("修改供应商===>"+result);
	}
	/**
	 * 测试删除供应商
	 */
	@Test
	public void delTest(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		ProviderService pService=(ProviderService)context.getBean("providerService");
		int id=19;
		boolean flag=pService.del(id);
		String result=flag==true?"删除成功":"修改失败";
		logger.debug("删除供应商====>"+result);
	}
}
