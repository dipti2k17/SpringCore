package com.employee.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.employee.pojo.Department;
import com.employee.pojo.Employee;

public class TestApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");
		Employee emp = context.getBean("empBean", Employee.class);
		System.out.println(emp.getName());
		Department dept = context.getBean("deptBean", Department.class);
		System.out.println(dept.toString());
		
		((AbstractApplicationContext) context).close();
	}

}
