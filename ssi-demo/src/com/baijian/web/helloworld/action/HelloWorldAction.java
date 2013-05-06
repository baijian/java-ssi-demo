package com.baijian.web.helloworld.action;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.baijian.web.helloworld.model.User;
import com.baijian.web.helloworld.service.UserService;

import org.arabidopsis.ahocorasick.AhoCorasick;
import org.arabidopsis.ahocorasick.SearchResult;

public class HelloWorldAction {

	private String username;
	private String password;
	private User u;
	private List<User> users;
	private File file;
	private String fileContentType;
	private String fileFileName;
	
	private UserService userService;
	
	public String hello(){
		String username = userService.printMes();
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("startId", "1");
		hashMap.put("endId", "2");
		//List<User> users = userService.getUser(hashMap);
		this.setUsername(username);
		//this.setUsers(users);
		//User u = userService.getPer("1", "baijian");
		//this.setU(u);
		/*
		 * file upload
		 */
		String filePath = "/tmp/";
		System.out.println("Src File Name:" + file);
		System.out.println("Src File Content Type:" + fileContentType);
		System.out.println("Dst File Name:" + fileFileName);
		File dstFile = new File(filePath, fileFileName);
		try {
			FileUtils.copyFile(file, dstFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AhoCorasick<String> tree =new AhoCorasick<String>();
		tree.add("hello".getBytes(), "hello");
		tree.add("word".getBytes(),"word");
		tree.prepare();
		Iterator<SearchResult<String>> searcher = tree.search("hi baijian, hello word".getBytes());
		while(searcher.hasNext()){
			SearchResult<String> result = searcher.next();
			System.out.println(result.getOutputs());
			System.out.println("Found at index:" + result.getLastIndex());
		}
		return "hello";
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
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
