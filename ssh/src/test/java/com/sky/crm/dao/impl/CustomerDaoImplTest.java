package com.sky.crm.dao.impl;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sky.crm.dao.CustomerDao;
import com.sky.crm.entity.Customer;

public class CustomerDaoImplTest {

	@Test
	public void test() {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		CustomerDao customerDao = (CustomerDao) ac.getBean("customerDao");
		Customer customer = customerDao.findById(23L);
		System.out.println("*******************" + customer.getCustName());
		
	}

}
