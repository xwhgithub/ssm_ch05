package com.xwh.dao.provider;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xwh.pojo.Provider;
/**
 * 供应商接口
 * @author Administrator
 *
 */
public interface ProviderMapper {
	/**
	 * 按照供应商名称模糊查询
	 * @return
	 */
	public List<Provider> getProviderList(@Param("proName") String proName);
	/**
	 * 增加供应商
	 * @param provider
	 * @return
	 */
	public int add(Provider provider);
	/**
	 * 修改供应商
	 * @param provider
	 * @return
	 */
	public int modify(Provider provider);
	/**
	 * 删除供应商
	 * @param id
	 * @return
	 */
	public int del(@Param("id") int id);
	
	/**
	 * 根据供应商id查询 订单集合
	 * @param id
	 * @return
	 */
	List<Provider> getProviderById(@Param("id") int id);
	
	/**
	 * 第三章上机7  条件模糊查询 choose 
	 * @param proCode
	 * @param proName
	 * @param proContact
	 * @param creationDate
	 * @return
	 */
	public List<Provider> getProviderListByCncd(@Param("proCode") String proCode,@Param("proName") String proName
						,@Param("proContact") String proContact,@Param("creationDate") Date creationDate);
}
