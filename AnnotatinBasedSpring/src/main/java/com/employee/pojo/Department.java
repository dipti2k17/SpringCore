package com.employee.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Department {
	
	private Employee emp;

    @Autowired
    public Department(Employee emp) {
        this.emp = emp;
    }

	@Override
	public String toString() {
		return "[emp=" + emp + "]";
	}
    
    
}

