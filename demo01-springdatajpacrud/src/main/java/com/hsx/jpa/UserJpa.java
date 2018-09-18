package com.hsx.jpa;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.hsx.entity.User;
/**
 * 
 * UserJPA继承了
 * 1、JpaRepository接口(SpringDataJPA提供的简单数据操作接口)
 * 2、JpaSpecificationExecutor(SpringDataJpa提供的复杂查询接口)
 * 3、Serializable(序列化接口)
 * 
 * @author Administrator
 *
 */
public interface UserJpa extends JpaRepository<User, Long>, JpaSpecificationExecutor<User>, Serializable {

}
