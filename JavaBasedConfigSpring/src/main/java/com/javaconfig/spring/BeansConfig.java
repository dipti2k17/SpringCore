package com.javaconfig.spring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.javaconfig.spring.pojo.College;
import com.javaconfig.spring.pojo.Student;


@Configuration
public class BeansConfig {

	public BeansConfig() { };
	
	@Bean(name = "student")
	@Scope("singleton")
    public Student student()
    {
      return new Student("student1");
    }
	/** Constructor Depenedency Injection **/
	
	@Bean(name = "college")
	@Scope("prototype")
    public College college()
    {
      return new College(student());
    } 
}
