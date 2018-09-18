package com.hsx.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hsx.domain.User;
import com.hsx.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserController {
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	
	public void test1() throws Exception {
		
		/*final User user1 = new User("u1","p1");
		final User user2 = new User("u2","p2");
		final User user3 = new User("u3","p3");
		userMapper.insertSelective(user1);
		log.info("[user1回写主键] - [{}]", user1.getId());
		userMapper.insertSelective(user2);
		log.info("[user1回写主键] - [{}]", user2.getId());
		userMapper.insertSelective(user3);
		log.info("[user1回写主键] - [{}]", user3.getId());
		final int count = userMapper.countByUsername("u1");
		log.info("[调用自己写的sql] - [{}]", count);
		
		for(int i=10; i < 40; i++) {
			userMapper.insertSelective(new User("u1"+i,"u1"+i));
		}*/
		
		//TODO 分页 + 排序 this.userMapper.selectAll()这一句就是我们需要写的查询，有了这两款插件无缝切换各种数据库
		final PageInfo<Object> pageInfo = PageHelper.startPage(1,10).setOrderBy("id desc").doSelectPageInfo(()->this.userMapper.selectAll());
		log.info("[lambda写法] - [分页信息] - [{}]", pageInfo.toString());
		
		PageHelper.startPage(1,10).setOrderBy("id asc");
		final PageInfo<User> userPageInfo = new PageInfo<>(this.userMapper.selectAll());
		log.info("[普通写法] - [{}]",userPageInfo);
		
	}
	
}
