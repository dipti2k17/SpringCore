package com.javaconfig.spring.application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javaconfig.spring.BeansConfig;
import com.javaconfig.spring.pojo.College;
import com.javaconfig.spring.pojo.Student;

public class AnnotationTestApplication {

	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(BeansConfig.class);
		context.refresh();
		Student student1 = (Student) context.getBean("student");
		Student student2 = (Student) context.getBean("student");		
		System.out.println("student1 : "+student1+" and student2: "+student2);
		System.out.println("Is student bean is singleton? : "
				+ (student1 == student2));
		College college1 = (College) context.getBean("college");
		College college2 = (College) context.getBean("college");
		System.out.println("college1 : "+college1+" and college2: "+college2);
		System.out.println("Is College bean is singleton? : "+ (college1 == college2));

		context.registerShutdownHook();

	}

}
