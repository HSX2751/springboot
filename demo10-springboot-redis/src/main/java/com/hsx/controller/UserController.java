package com.hsx.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hsx.domain.User;
import com.hsx.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserController {
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
    private UserService userService;


    @Test
    public void get() {
        final User user = userService.saveOrUpdateUser(new User(5L, "u5", "p5"));
        log.info("[saveOrUpdate] - [{}]", user);
        final User user1 = userService.getUser(5L);
        log.info("[get] - [{}]", user1);
        userService.deleteUser(5L);
    }
	
	
//	opsForValue：对应 String（字符串）
//	opsForZSet：对应 ZSet（有序集合）
//	opsForHash：对应 Hash（哈希）
//	opsForList：对应 List（列表）
//	opsForSet：对应 Set（集合）
//	opsForGeo：对应 GEO（地理位置）

}
