package com.spring.beans.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.entity.Age;


public class ConstructorArgType {
	final static Logger logger = LoggerFactory.getLogger(AutowireByConstructor.class);	

	public static void main(String args []) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml"); 
	Age age = context.getBean("age", Age.class);
	logger.info("Age : "+age.toString());
	}

}
