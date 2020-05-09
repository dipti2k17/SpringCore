package com.spring.beans;

public class Day {

	private Month month;

	public Day() {
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return "Day [month=" + month + "]";
	}
}
