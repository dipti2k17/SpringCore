package com.spring.beans.entity;

public class Date {
	private int day;
	private String month;
	private int year;
	public Date(int day, String month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Date:"+ day + "-" + month + "-"+ year+"";
	}
	
	

}
