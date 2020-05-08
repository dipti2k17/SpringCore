package com.spring.beans.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.spring.beans.dao.AccountDao;
import com.spring.beans.entity.User;
import com.spring.beans.hibernate.config.SessionFactoryUtil;

@Repository
public class AccountDaoImpl implements AccountDao {

	private SessionFactoryUtil sessionFactoryUtil;

	public AccountDaoImpl(SessionFactoryUtil sessionFactoryUtil) {
		super();
		this.sessionFactoryUtil = sessionFactoryUtil;
	}

	public User save(User user) {
		Transaction transaction = null;
		try {
			Session session = sessionFactoryUtil.getSessionFactory().openSession();
			// start a transaction
			transaction = session.beginTransaction();
			// save the student objects
			session.save(user);

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

		return user;
	}

	public List<User> findAll() {
		Transaction transaction = null;
		List<User> users = null;
		try {
			Session session = sessionFactoryUtil.getSessionFactory().openSession();
			users = session.createQuery("from User", User.class).list();

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

		return users;
	}

}
