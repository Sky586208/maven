package com.sky.crm.service;

import com.sky.crm.entity.Customer;

public interface CustomerService {

	//根据ID获取客户信息
	public Customer findById(Long id);
	
}
