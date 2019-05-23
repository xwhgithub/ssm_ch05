package com.xwh.service.provider;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xwh.pojo.Provider;

public interface ProviderService {
	/**
	 * 按照供应商名称模糊查询
	 * 
	 * @return
	 */
	public List<Provider> getProviderList(@Param("proName") String proName);

	/**
	 * 增加供应商
	 * 
	 * @param provider
	 * @return
	 */
	public boolean add(Provider provider);

	/**
	 * 修改供应商
	 * 
	 * @param provider
	 * @return
	 */
	public boolean modify(Provider provider);

	/**
	 * 删除供应商
	 * 
	 * @param id
	 * @return
	 */
	public boolean del(@Param("id") int id);

	/**
	 * 根据供应商id查询 订单集合
	 * 
	 * @param id
	 * @return
	 */
	List<Provider> getProviderById(@Param("id") int id);

	/**
	 * 第三章上机7 条件模糊查询 choose
	 * 
	 * @param proCode
	 * @param proName
	 * @param proContact
	 * @param creationDate
	 * @return
	 */
	public List<Provider> getProviderListByCncd(@Param("proCode") String proCode, @Param("proName") String proName,
			@Param("proContact") String proContact, @Param("creationDate") Date creationDate);
}
