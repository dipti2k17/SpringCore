package com.spring.beans.dao;

import java.util.List;

import com.spring.beans.entity.User;

public interface AccountDao {
	
	User save(User user);

	List<User> findAll();

}
