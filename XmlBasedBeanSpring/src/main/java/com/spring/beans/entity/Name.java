package com.spring.beans.entity;

public class Name {
	private String name;
	private Address address;

	public Name() { } ;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Name [name=" + name + ", address=" + address + "]";
	}
	

}
