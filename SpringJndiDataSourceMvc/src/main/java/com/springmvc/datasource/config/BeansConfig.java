package com.springmvc.datasource.config;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jndi.JndiTemplate;

import com.springmvc.datasource.dao.EmployeeDao;
import com.springmvc.datasource.dao.impl.EmployeeDaoImpl;

@Configuration
public class BeansConfig {
	
	@Bean("dataSource")
	public EmployeeDao getEmployeeDao() throws NamingException {
	    JndiTemplate jndiTemplate = new JndiTemplate();
	    DataSource dataSource
	            = (DataSource) jndiTemplate.lookup("java:/comp/env/jdbc/test");
	    return new EmployeeDaoImpl(dataSource);
	}

}
