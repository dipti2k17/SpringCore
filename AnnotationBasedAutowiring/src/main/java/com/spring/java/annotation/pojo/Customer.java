package com.spring.java.annotation.pojo;

import java.time.LocalDate;

import com.spring.java.annotation.customconversiontype.MyCustomConverter;

public class Customer {
	private String customerName;
	private LocalDate date;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", date=" + date
				+ "]";
	}

}
