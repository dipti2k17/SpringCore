package com.spring.beans.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.entity.Book;

public class ConstructorArgName {
	final static Logger logger = LoggerFactory.getLogger(ConstructorArgName.class);	

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml"); 
		Book book = context.getBean("book", Book.class);
		logger.info("Book : "+book.toString());
	
	}

}
