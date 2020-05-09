package com.spring.test;

import org.springframework.beans.factory.BeanNameAware;

public class HelloWorld implements BeanNameAware {
	
	private String name;
	
	public String showMessage() {
		return "Hello World";
	}

	@Override
	public void setBeanName(String name) {
		this.name = name;
	}

	
}
