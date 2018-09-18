package com.hsx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hsx.entity.User;
import com.hsx.jpa.UserJpa;

@RestController
@RequestMapping("/crud")
public class CRUDController {

	@Autowired
	private UserJpa userJpa;
	
	//查询所有
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public List<User> list() {
		return userJpa.findAll();
	}
	
	//更新、添加-----------------------有问题！！！
	@RequestMapping(value="/save",method=RequestMethod.GET)
	public User save(User user) {
		return userJpa.save(user);
	}
	
	//删除
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public List<User> delete(Long id) {
		userJpa.deleteById(id);
		return userJpa.findAll();
	}
	
	
}
