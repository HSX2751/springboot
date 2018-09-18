package com.hsx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.hsx.domain.User;

@Mapper
public interface UserMapper {
	
	/**
	 * t_user 操作：演示两种方式
	 * 第一种是基于mybatis3.x版本后提供的注解方式
	 * 第二种是早期写法，将SQL写在 XML 中
	 */
	
	/**
	 * 第一种方式
	 * 根据用户名查询用户结果集
	 * @param username  用户名
	 * @return  查询结果集
	 */
	@Select("select * from t_user where username = #{username}")
	List<User> findByUsername(@Param("username") String username);
	
	/**
	 * 第二种方式，映射文件UserMapper在src/main/resources/mapper/*.xml  已经在application.properties文件中配置
	 * 保存用户信息
	 * @param user  用户信息
	 * @return  成功 1  失败 0
	 */
	int insert(User user);
}
