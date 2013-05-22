package com.baijian.web.helloworld.vo;

import com.baijian.web.helloworld.model.User;

public class UserVo {

	private String userName;
	private String englishName;
	private String info;
	
	public User toModel(User u){
		u.setEnglishName(this.getEnglishName());
		return u;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEnglishName() {
		return englishName;
	}
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
}
