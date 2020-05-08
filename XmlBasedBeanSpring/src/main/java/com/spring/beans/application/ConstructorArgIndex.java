package com.spring.beans.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.entity.Date;

public class ConstructorArgIndex {
	final static Logger logger = LoggerFactory.getLogger(ConstructorArgIndex.class);	

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml"); 
		Date date = context.getBean("date", Date.class);
		logger.info("Date : "+date.toString());
	}

}
