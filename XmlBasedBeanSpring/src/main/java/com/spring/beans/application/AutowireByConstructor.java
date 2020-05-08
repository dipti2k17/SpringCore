package com.spring.beans.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.entity.Address;
import com.spring.beans.entity.Language;

public class AutowireByConstructor {
	
	final static Logger logger = LoggerFactory.getLogger(AutowireByConstructor.class);	

	public static void main(String args []) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");  
    Language l1=context.getBean("language",Language.class); 
    Address address1 = context.getBean("address", Address.class);
    l1.setLanguage("Kannada");
    address1.setCity("Bangalore");
    address1.setCountry("India");
  
    logger.info("Language of "+address1.getCity()+" : "+address1.toString());
	}

}
