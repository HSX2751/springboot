package com.hsx.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsx.domain.User;
import com.hsx.service.UserService;
@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;
	
	//查询所有用户
	@GetMapping
	@ResponseBody
	public List<User> allUser(){
		List<User> list = new ArrayList<User>();
		list = userService.queryUsers();
		for (User user : list) {
			System.out.println(user);
		}
		return list;
	}
	
	//根据主键id查询用户
	@GetMapping("/{id}")
	@ResponseBody
	public User getUser(@PathVariable long id) {
		return userService.getUser(id);
	}
	
	//根据主键id删除用户
	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public long delUser(@PathVariable long id) {
		return userService.deleteUser(id);
	}
	
	//添加用户
	@PostMapping("/adduser")
	@ResponseBody
	public long addUser(User user) {
		return userService.addUser(user);
	}
	
	//根据主键id修改用户信息
	@PutMapping("/edit/{id}")
	@ResponseBody
	public long editUser(@PathVariable long id, User user) {
		return userService.editUser(id, user);
	}
	
	
	//测试
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello world!";
	}

}
