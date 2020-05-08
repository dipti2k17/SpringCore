package com.spring.beans.entity;

public class Address {
	private String city;
	private String country;
	private Language language;
	
	public Address () { }
	
	public Address(Language language) {
		this.language = language;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}



	public void setCity(String city) {
		this.city = city;
	}


	public void setCountry(String country) {
		this.country = country;
	}
	


	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", language="
				+ language + "]";
	}


	

}
