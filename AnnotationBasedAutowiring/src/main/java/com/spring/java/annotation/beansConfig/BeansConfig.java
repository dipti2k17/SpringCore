package com.spring.java.annotation.beansConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.java.annotation.pojo.Customer;
import com.spring.java.annotation.pojo.MovieCatalog;
import com.spring.java.annotation.pojo.MovieFinder;
import com.spring.java.annotation.service.impl.UserServiceImpl;

@Configuration
public class BeansConfig {
	
	
	@Bean
	public UserServiceImpl userService() {
		return new UserServiceImpl();
	}
	

	/*@Bean
	public Movie movie() {
		return new Movie(actionVhsCatalog(), comedyVhsCatalog(), actionDvdCatalog(), comedyBluRayCatalog());
	}*/
	
	@Qualifier("actionVhsCatalog")
	@Bean
	public MovieCatalog actionVhsCatalog() {
		return new MovieCatalog();
	}
	
	@Qualifier("comedyVhsCatalog")
	@Bean
	public MovieCatalog comedyVhsCatalog() {
		return new MovieCatalog();
	}
	
	@Qualifier("actionDvdCatalog")
	@Bean
	public MovieCatalog actionDvdCatalog() {
		return new MovieCatalog();
	}
	
	@Qualifier("comedyBluRayCatalog")
	@Bean
	public MovieCatalog comedyBluRayCatalog() {
		return new MovieCatalog();
	}

}

