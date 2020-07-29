package com.sky.crm.dao;

import com.sky.crm.entity.Customer;

public interface CustomerDao {

	//根据ID获取客户信息
	public Customer findById(Long id);
	
}
