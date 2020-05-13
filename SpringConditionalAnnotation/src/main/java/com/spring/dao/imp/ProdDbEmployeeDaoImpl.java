package com.spring.dao.imp;

import java.util.ArrayList;
import java.util.List;

import com.spring.dao.DBUtilDao;
import com.spring.domain.Employee;

public class ProdDbEmployeeDaoImpl implements DBUtilDao {

	public List<Employee> getEmployeeDetails() {
		List<Employee> empDetails = new ArrayList<Employee>();
		Employee emp1 = new Employee(9001,"Ramu");
		Employee emp2 = new Employee(9002,"Ramu1");
		Employee emp3 = new Employee(9003,"Ramu3");
		empDetails.add(emp1);
		empDetails.add(emp2);
		empDetails.add(emp3);
		
		return empDetails;
	}

}
