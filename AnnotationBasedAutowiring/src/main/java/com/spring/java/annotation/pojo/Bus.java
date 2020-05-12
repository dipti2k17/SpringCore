package com.spring.java.annotation.pojo;

import java.util.logging.Logger;

import com.spring.java.annotation.service.CarService;

public class Bus implements CarService {
	final Logger LOGGER = Logger.getLogger(Bus.class.getName());

	public void printWheel() {
		LOGGER.info("Car has 6 wheels.........");
		
	}

}
