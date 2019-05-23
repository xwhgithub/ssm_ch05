package com.xwh.dao.bill;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xwh.pojo.Bill;
import com.xwh.service.bill.BillService;

public class BillTest {
	private Logger logger=Logger.getLogger(BillTest.class);
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * 按条件查询订单
	 */
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		BillService billService = (BillService) context.getBean("billService");
		// 按条件查询订单表 商品名称模糊查询 供应给id 是否付款
		List<Bill> billList = billService.getBillList("华", 1, 2);
		logger.debug("=====================打印");
		for (Bill bill : billList) {
			logger.debug("订单编码:"+bill.getBillCode()
			+"商品名称:"+bill.getProductName()
			+"供应商名称:"+bill.getProviderName()
			+"账单金额:"+bill.getTotalPrice()
			+"是否付款:"+bill.getIsPayment()
			+"创建时间:"+bill.getCreationDate());
		}
	}

}
