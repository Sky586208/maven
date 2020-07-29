package com.sky.crm.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.sky.crm.dao.CustomerDao;
import com.sky.crm.entity.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao{

	@Override
	public Customer findById(Long id) {
		// TODO Auto-generated method stub
		//根据ID获取客户信息
		return this.getHibernateTemplate().get(Customer.class, id);
	}

	
	
}
