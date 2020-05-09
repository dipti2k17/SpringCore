package com.spring.beans.application;

import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Book;
import com.spring.beans.Day;
import com.spring.beans.TypesCollection;
import com.spring.beans.compoundproperty.Date;


public class TestApplication {

	public static void main(String args []) {
		final Logger LOGGER = Logger.getLogger(TestApplication.class.getName());

	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	Book book1 = context.getBean("book1", Book.class);
	Book book2 = context.getBean("book2", Book.class);
	TypesCollection collection = context.getBean("collection", TypesCollection.class);
	TypesCollection childCollection = context.getBean("childBook", TypesCollection.class);
	LOGGER.info("Property : "+collection.getBookProp()+" Merged Property : "+childCollection.getBookProp());
	LOGGER.info("Map : "+collection.getBookMap());

	Date date = context.getBean("compoundDate", Date.class);
	LOGGER.info("Year is : "+date.getDay().getMonth().getYear());
	
	}
	
}
