package com.spring.beans.service.impl;

import java.util.List;

import com.spring.beans.dao.AccountDao;
import com.spring.beans.entity.User;

public class UserServiceImpl {

	private AccountDao accountDao;

	public UserServiceImpl() {
	};

	/** Instantiation with a Static Factory Method **/

	public static UserServiceImpl createInstance() {
		return new UserServiceImpl();
	}

	/** Constructor-based Dependency Injection **/
	public UserServiceImpl(AccountDao accountDao) {
		super();
		this.accountDao = accountDao;
	}

	/** Setter-based Dependency Injection **/
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public User addUser(User user) {
		return accountDao.save(user);
	}

	public List<User> findAll() {
		return accountDao.findAll();
	}

}
