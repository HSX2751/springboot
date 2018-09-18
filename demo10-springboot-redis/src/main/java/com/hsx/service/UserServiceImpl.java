package com.hsx.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.hsx.domain.User;
@Service
public class UserServiceImpl implements UserService {
	
	private static final Map<Long,User> DATABASES = new HashMap<>();
	
	//为了方便演示数据库操作，直接定义了一个Map<Long, User> DATABASES
	static {
		DATABASES.put(1L, new User(1L, "hahaha","hahaha"));
		DATABASES.put(2L, new User(2L, "hehehe","hehehe"));
		DATABASES.put(3L, new User(3L, "xixixi","xixixi"));
	}
	
	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	@Cacheable(value = "user", key = "#id")
	@Override
	public User getUser(Long id) {
		// TODO 我们就假设它是从数据库读取出来的
        log.info("进入 getUser 方法");
        return DATABASES.get(id);
	}

	@CachePut(value = "user", key = "#user.id")
	@Override
	public User saveOrUpdateUser(User user) {
		DATABASES.put(user.getId(), user);
        log.info("进入 saveOrUpdate 方法");
        return user;
	}

	@CacheEvict(value = "user", key = "#id")
	@Override
	public void deleteUser(Long id) {
		DATABASES.remove(id);
        log.info("进入 deleteUser 方法");
	}

}
