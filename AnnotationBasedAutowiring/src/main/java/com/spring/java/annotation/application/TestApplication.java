package com.spring.java.annotation.application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.java.annotation.beansConfig.BeansConfig;
import com.spring.java.annotation.mysql.config.MysqlConfig;
import com.spring.java.annotation.mysql.entity.User;
import com.spring.java.annotation.pojo.MovieCatalog;
import com.spring.java.annotation.service.impl.UserServiceImpl;

public class TestApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class, MysqlConfig.class);
		//context.refresh();
		UserServiceImpl userService = context.getBean(UserServiceImpl.class);
		User user = new User(7, "World");
		System.out.println("-------------Inserting to Db--------------");
		userService.addUser(user);
		//Movie movie = context.getBean("movie", Movie.class);
		
		MovieCatalog movieCatalog1 = context.getBean("comedyBluRayCatalog", MovieCatalog.class);
		System.out.println("------------ : "+movieCatalog1.getActionDvdCatalog());
		context.registerShutdownHook();
	}

}
