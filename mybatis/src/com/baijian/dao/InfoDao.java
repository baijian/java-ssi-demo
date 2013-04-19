package com.baijian.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.baijian.dao.ConnectionFactory;
import com.baijian.model.Info;

public class InfoDao {

	private SqlSessionFactory sqlSessionFactory;
	public InfoDao(){
		sqlSessionFactory = ConnectionFactory.getSqlSessionFactory();
	}
	
	public Info selectById(int id){
		SqlSession session = sqlSessionFactory.openSession();
		try{
			Info info = (Info) session.selectOne("Info.getById",id);
			return info;
		}finally{
			session.close();
		}
	}
}
