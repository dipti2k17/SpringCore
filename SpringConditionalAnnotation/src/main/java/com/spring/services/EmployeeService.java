package com.spring.services;

import java.util.List;

import com.spring.dao.EmployeeDao;
import com.spring.domain.Employee;

public class EmployeeService {
	private EmployeeDao employeeDao;
	public EmployeeService(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public List<Employee> getEmployeeDetails(){
		return employeeDao.getEmployeeDetails();
	}

}
