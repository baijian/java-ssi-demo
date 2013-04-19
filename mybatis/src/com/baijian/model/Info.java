package com.baijian.model;

public class Info {

	private int id;
	private String name;
	private String phone;
	private String email;
	
	public Info(){
	}
	
	public Info(int id, String name, String phone, String email){
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public int getId(){
		return this.id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
}
