package com.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomApplicationContext {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
				"beans.xml");
		HelloWorld hw = (HelloWorld) appContext.getBean("helloWorld");
		System.out.println(hw.showMessage());

		appContext.registerShutdownHook(); 
	}

}
