package com.spring.bean.test;

public class Location {
	
	private String carType;
	private String carLocation;

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCarLocation() {
		return carLocation;
	}

	public void setCarLocation(String carLocation) {
		this.carLocation = carLocation;
	}

	@Override
	public String toString() {
		return "Location [carType=" + carType + ", carLocation=" + carLocation
				+ "]";
	}

	
}
