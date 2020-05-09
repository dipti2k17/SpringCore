package com.spring.model.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.spring.model.LibraryEntity;
import com.spring.model.hibernate.SessionFactoryUtil;


public class LibraryDao {
	
	private SessionFactoryUtil sessionFactoryUtil;

	public LibraryDao(SessionFactoryUtil sessionFactoryUtil) {
		super();
		this.sessionFactoryUtil = sessionFactoryUtil;
	}
	
	public LibraryEntity save(LibraryEntity book) {
		Transaction transaction = null;
		try {
			Session session = sessionFactoryUtil.getSessionFactory().openSession();
			// start a transaction
			transaction = session.beginTransaction();
			// save the book objects
			session.save(book);

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

		return book;
	}

}
