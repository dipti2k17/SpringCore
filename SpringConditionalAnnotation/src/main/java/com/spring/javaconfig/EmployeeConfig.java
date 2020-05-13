package com.spring.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.dao.DBUtilDao;
import com.spring.dao.EmployeeDao;
import com.spring.services.EmployeeService;

@Configuration
public class EmployeeConfig {
	  @Autowired
	  private DBUtilDao dbUtilDao;
	  
	  @Bean
	  public EmployeeService employeeService() {
		  return new EmployeeService(employeeDao());
	  }
	  
	  @Bean
	  public EmployeeDao employeeDao() {
		  System.out.println("EmployeeDao employeeDao()" + dbUtilDao);
		  return new EmployeeDao(dbUtilDao);
	  }

}
