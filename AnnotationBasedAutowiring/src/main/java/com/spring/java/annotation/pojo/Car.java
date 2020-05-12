package com.spring.java.annotation.pojo;

import java.util.logging.Logger;

import com.spring.java.annotation.service.CarService;

public class Car implements CarService {
	final Logger LOGGER = Logger.getLogger(Car.class.getName());

	public void printWheel() {
		LOGGER.info("Car has 4 wheels.........");
		
	}

}
