package com.spring.java.annotation.pojo;

import javax.annotation.Resource;

public class MovieFinder {
	
	@Resource
    private Customer customer;

    
    public MovieFinder() { }
    
	public MovieFinder(Customer customer) {
		super();
		this.customer = customer;
	}



	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "MovieFinder [customer=" + customer + "]";
	};

}
