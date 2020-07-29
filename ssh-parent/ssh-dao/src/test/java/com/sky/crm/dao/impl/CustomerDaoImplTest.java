package com.sky.crm.dao.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sky.crm.dao.CustomerDao;
import com.sky.crm.entity.Customer;

@ContextConfiguration(locations= {"classpath:applicationContext-dao.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class CustomerDaoImplTest {

	@Autowired
	private CustomerDao customerDao;
	
	@Test
	public void test() {

		/*
		 * ApplicationContext ac = new
		 * ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		 * CustomerDao customerDao = (CustomerDao) ac.getBean("customerDao"); Customer
		 * customer = customerDao.findById(23L);
		 * System.out.println("*******************" + customer.getCustName());
		 */
		
		Customer customer = customerDao.findById(23L);
		System.out.println("*******************" + customer.getCustName());

	}

}
