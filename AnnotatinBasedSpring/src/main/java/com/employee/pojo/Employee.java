package com.employee.pojo;

import org.springframework.beans.factory.annotation.Required;

public class Employee
{
	private String name ;
	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	} 
	
	
}