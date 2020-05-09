package com.spring.beans.arbitrarymethodinjection;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class WheelType implements MethodReplacer {

	public Object reimplement(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {

		System.out.println("new 6 wheeler car.");
		return arg0;
	}

}
