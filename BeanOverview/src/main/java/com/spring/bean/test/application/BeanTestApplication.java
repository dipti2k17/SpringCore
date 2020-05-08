package com.spring.bean.test.application;

import java.util.logging.Logger;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.test.AbstractNameFactory;
import com.spring.bean.test.CurrentAddress;
import com.spring.bean.test.Customer;
import com.spring.bean.test.DefaultServiceLocator;
import com.spring.bean.test.Demo1;
import com.spring.bean.test.Outer.Inner;
import com.spring.bean.test.ParentHome;

;

public class BeanTestApplication {

	final static Logger LOGGER = Logger.getLogger(BeanTestApplication.class
			.getName());

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"dispatcher-servlet.xml", "beans.xml");
		/** Created bean using getBeanFactory() **/
		DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) applicationContext
				.getBeanFactory();

		beanFactory.registerSingleton("d1", new Demo1());

		Demo1 demoBean = (Demo1) applicationContext.getBean("d1");

		demoBean.print();
		// Inner Bean Implementation //
		Customer customer = (Customer) applicationContext.getBean("customer");
		System.out.println(customer);
		/** Inner Class Reference **/
		Inner inner = (Inner) applicationContext.getBean("innerBean");
		inner.show();

		/** Instantiation with a Static Factory Method **/
		AbstractNameFactory nameFactory = (AbstractNameFactory) applicationContext
				.getBean("nameFactory");
		System.out.println(nameFactory.createName());

		/** Instantiation by Using an Instance Factory Method **/
		DefaultServiceLocator myService = applicationContext.getBean(
				"emailService", DefaultServiceLocator.class);
		myService.sendMail();
		
		/** Determining a Bean’s Runtime Type **/
		LOGGER.info("Bean type Of emailService : "+beanFactory.getType("emailService"));
		
		/** Bean Definition Inheritance **/
		
		ParentHome parentObj = applicationContext.getBean("parentAddress", ParentHome.class);
		LOGGER.info("Home Address : "+parentObj.getHomeAddress());
		CurrentAddress childObj = applicationContext.getBean("currentAddress", CurrentAddress.class);
		LOGGER.info("Cuurent Address : "+childObj.getCurrAddress()+" and Home address : "+childObj.getHomeAddress());

		applicationContext.close();
	}

}
