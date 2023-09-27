package com.kh.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.common.JDBCTemplate;
import com.kh.model.vo.Act;

public class ActDao {
	private Properties prop = new Properties();
	
	public ActDao() {
		try {
			prop.loadFromXML(new FileInputStream("resources/query.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public ArrayList<Act> selectActList(Connection conn){
		ArrayList<Act> act = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectActList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Act a = new Act();
				
				a.setActNo(rset.getInt("ACT_NO"));
				a.setActName(rset.getString("ACT_NAME"));
				a.setActDay(rset.getString("ACT_DAY"));
				a.setActStartTime(rset.getInt("ACT_START_TIME"));
				a.setActDelayTime(rset.getInt("ACT_DELAY_TIME"));
				a.setMaxPerson(rset.getInt("MAX_PERSON"));
				
				act.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		
		return act;
	}
		
	public ArrayList<Act> actNameList(Connection conn){
		ArrayList<Act> act = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("actNameList");
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Act a = new Act();
				
				a.setActNo(rset.getInt("ACT_NO"));
				a.setActName(rset.getString("ACT_NAME"));
				a.setActDay(rset.getString("ACT_DAY"));
				a.setActStartTime(rset.getInt("ACT_START_TIME"));
				a.setActDelayTime(rset.getInt("ACT_DELAY_TIME"));
				a.setMaxPerson(rset.getInt("MAX_PERSON"));
				
				act.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		
		return act;
	}	
		
		
	public int makeConsumer(Connection conn, String cName,String cPhone) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = prop.getProperty("makeConsumer");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, cName);
			pstmt.setString(2, cPhone);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return result;
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
