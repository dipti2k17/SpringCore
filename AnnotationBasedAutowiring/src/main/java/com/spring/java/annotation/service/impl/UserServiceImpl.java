package com.spring.java.annotation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.java.annotation.mysql.entity.User;

@Component
public class UserServiceImpl {
	
	@Autowired
	@Qualifier("jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	

	public void addUser(User user) {
		jdbcTemplate.update("INSERT INTO user (userId, userName) VALUES (?, ?)",
	            user.getUserId(), user.getUserName());
	        System.out.println("User Added!!");
		
	}

}
