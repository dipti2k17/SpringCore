package com.spring.beans.application;

import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.dao.AccountDao;
import com.spring.beans.entity.User;
import com.spring.beans.service.impl.UserServiceImpl;

public class TestApplication {

	public static void main(String[] args) {

		final Logger LOGGER = Logger.getLogger(TestApplication.class.getName());

		
		// Initialize spring beans from bean configuration xml file.
		/*ApplicationContext context = new ClassPathXmlApplicationContext(
				"dispatcher-servlet.xml", "beansConfig.xml", "services.xml",
				"dao.xml");*/ /** Instantiating a Container **/
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//ApplicationContext context = new FileSystemXmlApplicationContext("file:///home/nineleaps/Documents/Test/XmlBasedBeanSpring/src/main/resources/beans.xml");
		
		// configuring multiple resource file in single applicationcontext
		/*ApplicationContext context =
		    	new ClassPathXmlApplicationContext(new String[] {"beansConfig.xml", "services.xml",
		              "dao.xml","hibernate.cfg.xml"});*/
		
		// loading confirguration using genericapplicationcontext
		/*GenericApplicationContext context = new GenericApplicationContext();
		new XmlBeanDefinitionReader(context).loadBeanDefinitions("beansConfig.xml",
				"services.xml", "dao.xml", "hibernate.cfg.xml");
		context.refresh();*/
		
		// retrieve configured instance
		UserServiceImpl service = context.getBean("userService", UserServiceImpl.class); // Lazily Intialized 


		// Get userService bean.
		//UserServiceImpl userService = (UserServiceImpl) context.getBean("userService");

		// Get accountDao bean.
		AccountDao accountDao = (AccountDao) context.getBean("accountDao");
		// Get user bean.

		User user = (User) context.getBean("userBean");
		

		// Inserting User Records To User Table //
		LOGGER.info("----------------Inserting Records to DB-------------------");
		service.addUser(new User(1, "Raj", "raj"));
		service.addUser(new User(2, "Dipti", "dipti"));
		LOGGER.info("After inserting records : "+service.findAll());
		
		// Show Languages
		/*
		LOGGER.info("Languages Used for " +user.getUserName()+" : "+user.getLanguages());
		LOGGER.info("Account details of "+user.getUserName()+" : "+user.getAccounts());*/
		
		((AbstractApplicationContext) context).close();

	}

}
