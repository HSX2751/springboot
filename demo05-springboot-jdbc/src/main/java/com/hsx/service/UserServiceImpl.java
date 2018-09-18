package com.hsx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsx.dao.UserDao;
import com.hsx.domain.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;
	
	@Override
	public int deleteUser(long id) {
		return dao.deleteUser(id);
	}

	@Override
	public int addUser(User user) {
		return dao.addUser(user);
	}

	@Override
	public int editUser(long id, User user) {
		return dao.editUser(id, user);
	}

	@Override
	public List<User> queryUsers() {
		return dao.queryUsers();
	}

	@Override
	public User getUser(long id) {
		return dao.getUser(id);
	}

}
