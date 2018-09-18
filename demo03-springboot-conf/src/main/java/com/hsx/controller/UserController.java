package com.hsx.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hsx.domain.User;
import com.hsx.domain.User2;

@RestController
public class UserController {
	//打印日志
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	//方式1：使用构造方法的方式进行注入，这个方法不太理解也不好接受
	private final User user;
	@Autowired
	public UserController(User user) {
		this.user = user;
	}
	
	//方式2：这个方法也能达到方式1的效果，注意查看控制台的输出，在浏览器访问时,返回数据时应该像myuser2那样，添加@ResponseBody注解，返回json对象。
	//此方法应该也是推崇的使用方式
	@Autowired
	private User2 user2;
	
	@GetMapping("myuser2")
	public @ResponseBody User2 user2() {
		log.info("=======================");
		log.info(user2.toString());
		log.info("=======================");
		return user2;
		
	}
	
	@GetMapping("/myuser")
	public User myuser() {
		log.info("============================================");
		log.info(user.toString());
		log.info("============================================");
		return user;
	}

}
