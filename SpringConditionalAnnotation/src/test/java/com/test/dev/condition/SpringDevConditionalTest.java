package com.test.dev.condition;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.spring.domain.Employee;
import com.spring.javaconfig.EmployeeConfig;
import com.spring.javaconfig.EmployeeDataSourceConfig;
import com.spring.services.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { EmployeeConfig.class,
		EmployeeDataSourceConfig.class }, loader = AnnotationConfigContextLoader.class)
public class SpringDevConditionalTest {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void testDevDataSource() {
		EmployeeService service = (EmployeeService) applicationContext
				.getBean("employeeService");
		assertNotNull(service);
		List<Employee> employeeDetails = service.getEmployeeDetails();
		assertEquals(2, employeeDetails.size());
		assertEquals("Abc", employeeDetails.get(0).getName());
		assertEquals("Xyz", employeeDetails.get(1).getName());
	}
}
