package com.baijian.web.helloworld.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baijian.web.helloworld.mapper.UserMapper;
import com.baijian.web.helloworld.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	public User get(int userId){
		return this.userMapper.getUser(userId);
	}
	
	public String printMes(){
		User u = userMapper.getUser(1);
		System.out.println("haha " + u.getUserName());
		return u.getUserName();
	}

	/*
	public List<User> getUser(HashMap<String, Object> hashMap){
		return this.userMapper.getAllUser(hashMap);
	}
	*/
	
	public User getPer(String id, String username){
		return this.userMapper.getPer(id, username);
	}
	
	@Transactional
	public int insertUser(HashMap<String, Object> hashMap){
		return this.userMapper.insertUser(hashMap);
	}
}
