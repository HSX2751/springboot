package com.hsx.service;

import com.hsx.domain.User;

public interface UserService {
	/**
	 * 添加或修改用户信息
	 * @param user  用户对象
	 * @return  操作结果
	 */
	User saveOrUpdateUser(User user);

	/**
	 * 查询用户信息
	 * @param user  用户对象
	 * @return  返回结果
	 */
	User getUser(Long id);
	
	/**
	 * 删除用户信息
	 * @param id  key 值
	 */
	void deleteUser(Long id);
}
