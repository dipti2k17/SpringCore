package com.spring.java.annotation.mysql.config;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:mysqldb.properties")
public class MysqlConfig {
	@Value("${dataSource.driverClassName}")
	String driverClassName;
	@Value("${dataSource.url}")
	String url;
	@Value("${dataSource.username}")
	String username;
	@Value("${dataSource.password}")
	String password;

	public MysqlConfig() {
	};

	@Bean("mysqlDataSource")
	@Primary
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
	}

	@Bean("jdbcTemplate")
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

	public void getConnection() {
		Connection conn = null;

		// Get connection from DataSource
		try {
			conn = dataSource().getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
