package com.spring.beans.compoundproperty;

import com.spring.beans.Day;

public class Date {
	
	private Day day;

	public Date() {
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + "]";
	}

}
