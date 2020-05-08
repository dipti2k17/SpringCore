package com.spring.beans.entity;

public class Age {
	
	private String month;
	private int year;
	
	public Age(int year, String month) {
		super();
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Age [month=" + month + ", year=" + year + "]";
	}


}
