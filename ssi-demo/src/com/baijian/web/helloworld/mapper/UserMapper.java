package com.baijian.web.helloworld.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.baijian.web.helloworld.model.User;

/*
 * this is mybatis service layer called data or persistence
 * it will provide database services to domain class called model...
 * 
 * specify the methods that will be used to perform CRUD operation.
 * you can use annotation or use xml file to mapper
 */
public interface UserMapper {

	@Select("select * from user where id = #{id}")
	User getUser(int id);
	
	public void insertUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(int id);
	
	public List<User> getAllUser();
}
