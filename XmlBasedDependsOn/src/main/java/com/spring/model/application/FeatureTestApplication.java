package com.spring.model.application;

import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Book;
import com.spring.model.Library;
import com.spring.model.LibraryEntity;
import com.spring.model.dao.LibraryDao;

public class FeatureTestApplication {

	public static void main(String[] args) {
		final Logger LOGGER = Logger.getLogger(FeatureTestApplication.class.getName());

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Book b1= context.getBean("book", Book.class);
		Library book1 = context.getBean("library", Library.class);
		LibraryEntity libraryEntity = context.getBean("libraryEntity", LibraryEntity.class);
	    LibraryDao libraryDao = context.getBean("libraryDao", LibraryDao.class);
		/** Inserting book records to DB **/
	    LOGGER.info("------------------Inserting records to h2 DB--------------------");
	    book1.setBook(new Book("India", 1));
	    LOGGER.info("Book details: "+book1);
	    libraryEntity.setBookId(1);
	    libraryEntity.setBookName(book1.getBook().getBookName());
	    libraryEntity.setQuantity(book1.getBook().getQuantity());
	    libraryDao.save(libraryEntity);
	}

}
