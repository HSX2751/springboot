package com.hsx.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:my2.properties")  //加载自定义文件
@ConfigurationProperties(prefix="my2")  //自动匹配属性
public class User2 {

	private int age;
	private String name;
	private String email;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User2 [age=" + age + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
