package com.xwh.pojo;

import java.util.Date;
import java.util.List;

/**
 * 供应商实体类
 * 
 * @author Administrator
 *
 */
public class Provider {
	private int id; // 主键id
	private String proCode; // 供应商编码
	private String proName; // 供应商名称
	private String proDesc;// 供应商详细描述
	private String proContact;// 供应商联系人
	private String proPhone;// 联系电话
	private String proAddress;// 地址
	private String proFax;// 传真
	private int createdBy;// 创建者（userId）
	private Date creationDate;// 创建时间
	private Date modifyDate;// 更新时间
	private int modifyBy;// 更新者（userId）
	//订单集合
	private List<Bill> billList;
	
	public List<Bill> getBillList() {
		return billList;
	}

	public void setBillList(List<Bill> billList) {
		this.billList = billList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProCode() {
		return proCode;
	}

	public void setProCode(String proCode) {
		this.proCode = proCode;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProDesc() {
		return proDesc;
	}

	public void setProDesc(String proDesc) {
		this.proDesc = proDesc;
	}

	public String getProContact() {
		return proContact;
	}

	public void setProContact(String proContact) {
		this.proContact = proContact;
	}

	public String getProPhone() {
		return proPhone;
	}

	public void setProPhone(String proPhone) {
		this.proPhone = proPhone;
	}

	public String getProAddress() {
		return proAddress;
	}

	public void setProAddress(String proAddress) {
		this.proAddress = proAddress;
	}

	public String getProFax() {
		return proFax;
	}

	public void setProFax(String proFax) {
		this.proFax = proFax;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public int getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(int modifyBy) {
		this.modifyBy = modifyBy;
	}

}
