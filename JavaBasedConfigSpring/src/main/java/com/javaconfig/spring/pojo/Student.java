package com.javaconfig.spring.pojo;

public class Student {
	private String name;

	public Student () { };
	
	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
}
