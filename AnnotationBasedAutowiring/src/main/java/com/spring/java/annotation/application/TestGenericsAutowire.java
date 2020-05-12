package com.spring.java.annotation.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.java.annotation.beansConfig.GenericsQualifierConfig;
import com.spring.java.annotation.generics.pojo.IntegerStore;
import com.spring.java.annotation.generics.pojo.StringStore;

public class TestGenericsAutowire {
	
	@Autowired
	private StringStore<String> s1;

	@Autowired
	private IntegerStore<Integer> i1;

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GenericsQualifierConfig.class);
		
		StringStore stringStore1 = context.getBean("stringStore", StringStore.class);
		System.out.println("------------ : "+new StringStore("2").getObject());
		context.registerShutdownHook();

	}

}
