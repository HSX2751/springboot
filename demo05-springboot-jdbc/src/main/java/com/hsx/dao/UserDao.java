package com.hsx.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hsx.domain.User;

@Repository
public class UserDao {
	
	private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
	
	//根据主键id删除用户信息
	public int deleteUser(long id) {
		String sql = "delete from t_user where id = ?";
		return jdbcTemplate.update(sql,id);
	}
	
	//添加用户
	public int addUser(User user) {
		String sql = "insert into t_user (username,password) values(?,?)";
		return jdbcTemplate.update(sql, user.getUsername(),user.getPassword());
	}
	
	//根据主键id修改用户信息
	public int editUser(long id, User user) {
		String sql = "update t_user set username = ?, password = ? where id = ?";
		return jdbcTemplate.update(sql,user.getUsername(),user.getPassword(),id);
	}
	
	//查询所有用户
	public List<User> queryUsers() {
		String sql = "select * from t_user";
		return jdbcTemplate.query(sql, new Object[] {}, new BeanPropertyRowMapper<>(User.class));
	}
	
	//根据主键id查询
	public User getUser(long id) {
		String sql = "select * from t_user where id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] {id}, new BeanPropertyRowMapper<>(User.class));
	}
}
