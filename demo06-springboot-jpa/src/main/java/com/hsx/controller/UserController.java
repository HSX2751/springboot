package com.hsx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.hsx.domain.User;
import com.hsx.service.UserRepository;

public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	public void test1() throws Exception {
		
		User user = new User();
		user.setUsername("hsx");
		user.setPassword("yqs");
		
		//添加用户
		final User user1 = userRepository.save(user);
		System.out.println("添加成功："+user1);
		
		//条件查询
		final List<User> list = userRepository.findAllByUsername("hsx");
		System.out.println("条件查询："+list);
		
		//分页查询+排序+查询所有
		Pageable pageable = PageRequest.of(0, 10, Sort.by(Sort.Order.desc("username")));
        final Page<User> users = userRepository.findAll(pageable);
        System.out.println("[分页+排序+查询所有] - "+ users.getContent());
        
        //
        //userRepository.findById(users.getContent().get(0).getId()).ifPresent(user1 -> log.info("[主键查询] - [{}]", user1));
        
        //final User edit = userRepository.save(new User(user.getId(), "修改后的ui", "修改后的p1"));
        //System.out.println("修改成功:"+ edit);
        
        userRepository.deleteById(user.getId());
        System.out.println("删除主键成功:"+ user.getId());
		
	}

}
