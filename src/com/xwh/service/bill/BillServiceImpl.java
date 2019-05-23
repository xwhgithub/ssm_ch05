package com.xwh.service.bill;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xwh.dao.bill.BillMapper;
import com.xwh.pojo.Bill;
@Service("billService")
public class BillServiceImpl implements BillService {
	
	@Resource(name="billMapper")
	private BillMapper billMapper;
	
	/**
	 * 鎸夋潯浠舵煡璇㈣鍗�
	 */
	public List<Bill> getBillList(String name, int id, int isPay) {
		try {
			System.out.println("1243");
			System.out.println("和福克斯的会客室");
			return billMapper.getBillList(name, id, isPay);
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

}
