package com.spring.java.annotation.beansConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.java.annotation.generics.pojo.IntegerStore;
import com.spring.java.annotation.generics.pojo.StringStore;

@Configuration
public class GenericsQualifierConfig {
	
	    @Bean
	    public StringStore stringStore() {
	        return new StringStore();
	    }

	    @Bean
	    public IntegerStore integerStore() {
	        return new IntegerStore();
	    }
}
