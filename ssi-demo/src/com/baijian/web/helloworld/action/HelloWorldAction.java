package com.baijian.web.helloworld.action;

import java.util.HashMap;
import java.util.List;

import com.baijian.web.helloworld.model.User;
import com.baijian.web.helloworld.service.UserService;

public class HelloWorldAction {

	private String username;
	private String password;
	private User u;
	private List<User> users;
	
	private UserService userService;
	
	public String hello(){
		String username = userService.printMes();
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("startId", "1");
		hashMap.put("endId", "2");
		List<User> users = userService.getUser(hashMap);
		this.setUsername(username);
		this.setUsers(users);
		User u = userService.getPer("1", "baijian");
		this.setU(u);
		return "hello";
	}
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User getU() {
		return u;
	}

	public void setU(User u) {
		this.u = u;
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
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
}
