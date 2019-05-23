package com.xwh.service.provider;

import java.util.Date;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.xwh.dao.provider.ProviderMapper;
import com.xwh.pojo.Provider;
/**
 * 使用注解声明事务处理
 * @author xwh
 *
 */
@Transactional
@Service("providerService")
public class ProviderServiceImpl implements ProviderService {
	
	@Resource(name="providerMapper")
	private ProviderMapper providerMapper;
	
	/**
	 * 根据供应商名称模糊查询
	 */
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<Provider> getProviderList(String proName) {
		try {
			return providerMapper.getProviderList(proName);
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}
	/**
	 * 增加供应商
	 */
	public boolean add(Provider provider) {
		boolean result=false;
		try {
			if (providerMapper.add(provider)==1) {
				result=true;
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
		return result;
	}
	/**
	 * 修改供应商
	 */
	public boolean modify(Provider provider) {
		boolean result=false;
		try {
			if (providerMapper.modify(provider)==1) {
				result=true;
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
		return result;
	}
	/**
	 * 删除供应商
	 */
	public boolean del(int id) {
		boolean result=false;
		try {
			if (providerMapper.del(id)==1) {
				result=true;
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
		return result;
	}
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<Provider> getProviderById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<Provider> getProviderListByCncd(String proCode, String proName, String proContact, Date creationDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
