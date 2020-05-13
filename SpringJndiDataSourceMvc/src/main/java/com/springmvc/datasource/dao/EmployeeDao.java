package com.springmvc.datasource.dao;

import java.sql.SQLException;
import java.util.List;

import com.springmvc.datasource.model.Employee;

public interface EmployeeDao {
	List<Employee> list();

}
