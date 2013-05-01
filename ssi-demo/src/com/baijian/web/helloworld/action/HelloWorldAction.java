package com.baijian.web.helloworld.action;

import com.baijian.web.helloworld.service.UserService;

public class HelloWorldAction {

	private String username;
	private String password;
	
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

	public String hello(){
		String username = userService.printMes();
		this.setUsername(username);
		return "hello";
	}
}
