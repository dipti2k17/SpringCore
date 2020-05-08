package com.javaconfig.spring.pojo;

public class College {
	
	private Student student;

	public College() { };
	
	public College(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "College [student=" + student + "]";
	}
	
}
