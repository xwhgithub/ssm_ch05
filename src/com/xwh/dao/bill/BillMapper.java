package com.xwh.dao.bill;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.xwh.pojo.Bill;

public interface BillMapper {
	/**
	 * 按条件查询商品
	 * @param name
	 * @param id
	 * @param isPay
	 * @return
	 */
	public List<Bill> getBillList(@Param("name") String name,@Param("id") int id,@Param("isPay") int isPay
		);
	
}
