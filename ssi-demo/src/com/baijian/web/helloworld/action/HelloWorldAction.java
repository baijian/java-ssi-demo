package com.baijian.web.helloworld.action;

import com.baijian.web.helloworld.mapper.UserMapper;
import com.baijian.web.helloworld.service.UserService;

public class HelloWorldAction {

	private String username;
	private String password;
	
	private UserMapper userMapper;
	private UserService userService;
	
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
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public String hello(){
		userService.printMes();
		return "hello";
	}
}
