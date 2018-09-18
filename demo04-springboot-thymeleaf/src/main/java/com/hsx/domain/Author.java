package com.hsx.domain;

public class Author {
	
	private int age;
	private String email;
	private String name;
	private String attribute;
	
	
	
	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAttribute() {
		return attribute;
	}



	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}



	@Override
	public String toString() {
		return "Author [age=" + age + ", email=" + email + ", name=" + name + ", attribute=" + attribute + "]";
	}
	

}
