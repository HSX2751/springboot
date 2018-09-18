package com.hsx.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hsx.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	/**
	 * 根据用户名查询用户信息
	 * @param username
	 * @return
	 */
	List<User> findAllByUsername(String username);
	
}
