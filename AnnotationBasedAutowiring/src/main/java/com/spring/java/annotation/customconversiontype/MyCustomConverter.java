package com.spring.java.annotation.customconversiontype;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.core.convert.converter.Converter;

public class MyCustomConverter implements Converter<String, LocalDate> {

	@Override
	public LocalDate convert(String date) {
		return LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
	}

}
