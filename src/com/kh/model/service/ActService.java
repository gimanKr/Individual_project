package com.kh.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.common.JDBCTemplate;
import com.kh.model.dao.ActDao;
import com.kh.model.vo.Act;

public class ActService {

	public ArrayList<Act> selectActList(){
		Connection conn = JDBCTemplate.getConnection();
		ArrayList<Act> list = new ActDao().selectActList(conn);
		JDBCTemplate.close(conn);
		
		return list;
	}
	
	public ArrayList<Act> actNameList() {
		Connection conn = JDBCTemplate.getConnection();
		ArrayList<Act> list = new ActDao().actNameList(conn);
		JDBCTemplate.close(conn);
		
		return list;
	}
	
	public int makeConsumer(String cName,String cPhone) {
		Connection conn = JDBCTemplate.getConnection();
		int result = new ActDao().makeConsumer(conn, cName, cPhone);
		
		if (result > 0) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		return result ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
