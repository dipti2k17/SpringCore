package com.spring.dao;

import java.util.List;

import com.spring.domain.Employee;


public class EmployeeDao {
	private DBUtilDao dbUtilDao;;

	public EmployeeDao(DBUtilDao dbUtilDao) {
		this.dbUtilDao = dbUtilDao;
	}
	
	public List<Employee> getEmployeeDetails() {
		return dbUtilDao.getEmployeeDetails();
	}
}
