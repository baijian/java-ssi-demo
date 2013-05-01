package com.baijian.web.helloworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baijian.web.helloworld.mapper.UserMapper;
import com.baijian.web.helloworld.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	/*
	@Transactional
	public void insertUser(User user){
		
	}*/

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	public User get(int userId){
		return this.userMapper.getUser(userId);
	}
	
	public void printMes(){
		System.out.println("haha");
	}

}
