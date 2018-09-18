package com.hsx.domain;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
//	@Api：描述Controller
//	@ApiIgnore：忽略该Controller，指不对当前类做扫描
//	@ApiOperation：描述Controller类中的method接口
//	@ApiParam：单个参数描述，与@ApiImplicitParam不同的是，他是写在参数左侧的。如（@ApiParam(name = "username",value = "用户名") String username）
//	@ApiModel：描述POJO对象
//	@ApiProperty：描述POJO对象中的属性值
//	@ApiImplicitParam：描述单个入参信息
//	@ApiImplicitParams：描述多个入参信息
//	@ApiResponse：描述单个出参信息
//	@ApiResponses：描述多个出参信息
//	@ApiError：接口错误所返回的信息
	
	private Long id;
	@ApiModelProperty("用户名")
	private String username;
	@ApiModelProperty("密码")
	private String password;
	
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}




	public User(Long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}




	public User() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	
	

}
