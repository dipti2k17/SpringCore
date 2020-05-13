/*package com.springmvc.datasource.controller;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.datasource.dao.EmployeeDao;
import com.springmvc.datasource.model.Employee;

@Controller
@ComponentScan(basePackages ="com.springmvc.datasource")
public class EmployeeController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	 
	    @Autowired
	    private EmployeeDao empDao;
	     
	    @RequestMapping(value="/")
	    public ModelAndView home() throws IOException{
	        List<Employee> listUsers = empDao.list();
	        logger.info("Users : "+listUsers);
	        ModelAndView model = new ModelAndView("home");
	        model.addObject("userList", listUsers);
	        return model;
	    }
}
*/