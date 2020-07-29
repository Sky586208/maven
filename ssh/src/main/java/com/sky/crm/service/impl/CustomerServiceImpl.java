package com.sky.crm.service.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.sky.crm.dao.CustomerDao;
import com.sky.crm.entity.Customer;
import com.sky.crm.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{

	private CustomerDao customerDao;
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public Customer findById(Long id) {
		// TODO Auto-generated method stub
		return customerDao.findById(id);
	}
	
	

	
	
}
