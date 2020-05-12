package com.spring.java.annotation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.java.annotation.customqualifier.CarQualifier;
import com.spring.java.annotation.service.CarService;


public class CarServiceImpl {
	@Autowired
	@CarQualifier
	private CarService carService; 
	
	public CarService getWheelType() {
		return carService;
	}


}
