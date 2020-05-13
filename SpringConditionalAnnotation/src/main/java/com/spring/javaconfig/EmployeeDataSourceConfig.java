package com.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.spring.coditioncheck.DevDBUtilCondition;
import com.spring.coditioncheck.ProdDBUtilCondition;
import com.spring.dao.DBUtilDao;
import com.spring.dao.imp.DevDbEmployeeDaoImpl;
import com.spring.dao.imp.ProdDbEmployeeDaoImpl;

@Configuration
public class EmployeeDataSourceConfig {
	

	  @Bean(name="devDataSource")
	  @Conditional(value=DevDBUtilCondition.class)
	  public DBUtilDao getDevDataSource() {
		  return new DevDbEmployeeDaoImpl();
	  }

	  @Bean(name="prodDataSource")
	  @Conditional(ProdDBUtilCondition.class)
	  public DBUtilDao getProdDataSource() {
		  return new ProdDbEmployeeDaoImpl();
	  }
}
