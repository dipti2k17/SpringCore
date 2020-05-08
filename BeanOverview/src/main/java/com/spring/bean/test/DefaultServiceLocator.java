package com.spring.bean.test;

public class DefaultServiceLocator {
	
	public DefaultServiceLocator() { };

	// Instance factory method
	public DefaultServiceLocator createService() {
		return new DefaultServiceLocator();
	}

	public void sendMail() {
		System.out.println("Email service started");
	}
}
