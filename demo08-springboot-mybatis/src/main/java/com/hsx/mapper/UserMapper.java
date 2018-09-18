package com.hsx.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.hsx.domain.User;

import tk.mybatis.mapper.common.BaseMapper;

@Mapper
public interface UserMapper extends BaseMapper<User>{
	
	/**
	 * 根据用户名统计(TODO 假设它是一个很复杂的sql)
	 * 
	 * @param username  用户名
	 * @return  统计结果
	 */
	int countByUsername(String username);

}
