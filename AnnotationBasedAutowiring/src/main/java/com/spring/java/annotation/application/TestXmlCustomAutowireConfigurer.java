package com.spring.java.annotation.application;

import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.java.annotation.service.impl.CarServiceImpl;

public class TestXmlCustomAutowireConfigurer {

	public static void main(String[] args) {
		final Logger LOGGER = Logger.getLogger(TestXmlCustomAutowireConfigurer.class.getName());
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("custombeans.xml");
		CarServiceImpl service = context.getBean(CarServiceImpl.class);
		service.getWheelType().printWheel();
		context.registerShutdownHook();


	}

}
