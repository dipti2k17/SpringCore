package com.spring.java.annotation.application;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.java.annotation.beansConfig.ResourceAnnotationBeans;
import com.spring.java.annotation.customconversiontype.MyCustomConverter;
import com.spring.java.annotation.pojo.Customer;
import com.spring.java.annotation.pojo.MovieFinder;

public class TestResourceAnnotation {

	public static void main(String[] args) {

		final Logger LOGGER = Logger.getLogger(TestResourceAnnotation.class.getName());
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ResourceAnnotationBeans.class);
		Customer customerDetails = context.getBean("customerBean", Customer.class);
		MyCustomConverter convertDateToLocalDate = context.getBean(MyCustomConverter.class);
		customerDetails.setCustomerName("Dipti");
		LOGGER.info("LocalDate: " +convertDateToLocalDate.convert("2018-03-09"));
		customerDetails.setDate(convertDateToLocalDate.convert("2020-12-05"));
		MovieFinder movieFinder = context.getBean("movieFinder", MovieFinder.class);
		LOGGER.info(movieFinder.getCustomer().toString());
		
		context.registerShutdownHook();
		
	}

}
