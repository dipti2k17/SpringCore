package com.spring.java.annotation.beansConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.format.support.DefaultFormattingConversionService;

import com.spring.java.annotation.customconversiontype.MyCustomConverter;
import com.spring.java.annotation.pojo.Customer;
import com.spring.java.annotation.pojo.MovieFinder;

@Configuration
public class ResourceAnnotationBeans {

	@Bean
	public Customer customerBean() {
		return new Customer();
	}

	@Bean
	public MovieFinder movieFinder() {
		return new MovieFinder(customerBean());
	}

	/** converting the String value in @Value to the target type **/
	@Bean
	public ConversionService conversionService() {
		DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();
		conversionService.addConverter(myCustomConverter());
		return conversionService;
	}
	
	@Bean
	public MyCustomConverter myCustomConverter() {
		return new MyCustomConverter();
	}
}
