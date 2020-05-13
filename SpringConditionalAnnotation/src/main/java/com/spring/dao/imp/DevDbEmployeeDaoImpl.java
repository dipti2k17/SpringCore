package com.spring.dao.imp;

import java.util.ArrayList;
import java.util.List;

import com.spring.dao.DBUtilDao;
import com.spring.domain.Employee;

public class DevDbEmployeeDaoImpl implements DBUtilDao {

	public List<Employee> getEmployeeDetails() {
		List<Employee> empDetails = new ArrayList<Employee>();
		Employee emp1 = new Employee(111,"Abc");
		Employee emp2 = new Employee(222,"Xyz");
		empDetails.add(emp1);
		empDetails.add(emp2);
		
		return empDetails;
	}

}
