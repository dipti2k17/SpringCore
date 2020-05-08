package com.spring.beans.application;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.entity.Address;
import com.spring.beans.entity.Name;

public class AutowireByNameTest {
	
	final static Logger logger = LoggerFactory.getLogger(AutowireByNameTest.class);	

	public static void main(String args []) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");  
    Name n1=context.getBean("name",Name.class); 
    Address address1 = context.getBean("address", Address.class);
    address1.setCity("Bangalore");
    address1.setCountry("India");
    n1.setName("Dipti");
  
    logger.info("details of "+n1.getName()+" : "+n1.toString());
	}
}
