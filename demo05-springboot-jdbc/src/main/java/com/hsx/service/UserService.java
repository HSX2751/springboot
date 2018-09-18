package com.hsx.service;

import java.util.List;

import com.hsx.domain.User;


public interface UserService {

	// 根据主键id删除用户信息
	public int deleteUser(long id);
	// 添加用户
	public int addUser(User user);
	// 根据主键id修改用户信息
	public int editUser(long id, User user);
	// 查询所有用户
	public List<User> queryUsers();
	// 根据主键id查询
	public User getUser(long id);
}
