package com.baijian.test;

import com.baijian.model.Info;
import com.baijian.dao.InfoDao;

public class GetData {

	public static void main(String[] args) {
		InfoDao infodao = new InfoDao();
		Info info = infodao.selectById(1);
		System.out.println(info.getName());
	}

}
