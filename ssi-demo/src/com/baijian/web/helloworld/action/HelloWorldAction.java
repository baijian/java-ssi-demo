package com.baijian.web.helloworld.action;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import com.baijian.web.helloworld.model.User;
import com.baijian.web.helloworld.service.UserService;
import com.baijian.web.helloworld.vo.UserVo;

import org.arabidopsis.ahocorasick.AhoCorasick;
import org.arabidopsis.ahocorasick.SearchResult;

public class HelloWorldAction {
	
	private static final Logger logger = Logger.getLogger(HelloWorldAction.class.getName());

	private int id;
	
	private String username;
	private String password;
	private User u;
	private UserVo userVo;
	private List<User> users;
	private File file;
	private String fileContentType;
	private String fileFileName;
	
	private UserService userService;
	
	private String testinfo;
	
	public String hello(){
		this.setU(this.getUserVo().toModel(this.getU()));
		/*
		String username = userService.printMes();
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("startId", "1");
		hashMap.put("endId", "2");
		*/
		//List<User> users = userService.getUser(hashMap);
		//this.setUsername(username);
		//this.setUsers(users);
		//User u = userService.getPer("1", "baijian");
		//this.setU(u);
		/*
		 * file upload
		 */
		/*
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
		*/
		/*
		AhoCorasick<String> tree =new AhoCorasick<String>();
		tree.add("hello".getBytes(), "hello");
		tree.add("word".getBytes(),"word");
		tree.prepare();
		Iterator<SearchResult<String>> searcher = tree.search("hi baijian, hello word".getBytes());
		while(searcher.hasNext()){
			SearchResult<String> result = searcher.next();
			System.out.println(result.getOutputs());
			System.out.println("Found at index:" + result.getLastIndex());
		}*/
		logger.info("fuck=====");
		logger.debug("hahahahfuck===");
		HashMap<String, Object> h = new HashMap<String, Object>();
		h.put("username", "jianbaij");
		h.put("cn_name", "bj");
		h.put("en_name", "b");
		h.put("gender", "1");
		h.put("status", "1");
		h.put("email", "jian.baij@gmail.com");
		h.put("id", 0);
		System.out.println(h.get("id"));
		userService.insertUser(h);
		System.out.println(h.get("id"));
		this.setId((Integer) h.get("id"));
		this.setTestinfo("fuck you");
		//this.setId(userService.insertUser(h));
		logger.info("end.....");
		return "hello";
	}

	public UserVo getUserVo() {
		return userVo;
	}

	public void setUserVo(UserVo userVo) {
		this.userVo = userVo;
	}

	public String getTestinfo() {
		return testinfo;
	}

	public void setTestinfo(String testinfo) {
		this.testinfo = testinfo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
