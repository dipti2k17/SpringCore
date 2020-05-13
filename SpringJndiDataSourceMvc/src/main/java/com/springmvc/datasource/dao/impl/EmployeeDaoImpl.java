package com.springmvc.datasource.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springmvc.datasource.dao.EmployeeDao;
import com.springmvc.datasource.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private DataSource dataSource;
    
    public EmployeeDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Employee> list() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String sql = "SELECT * from Employee";
        List<Employee> listUser = jdbcTemplate.query(sql, new RowMapper<Employee>() {
 
            public Employee mapRow(ResultSet rs, int rowNumber) throws SQLException {
            	Employee user = new Employee();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setRole(rs.getString("role"));
                return user;
            }
             
        });
        return listUser;
    }

}
