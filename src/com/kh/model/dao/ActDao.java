package com.kh.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.kh.model.vo.Act;

public class ActDao {

		public ArrayList<Act> reserveByInfo(String resName, String actName){
		
			ArrayList<Act> act = new ArrayList<>();
		
			Connection conn = null;
			Statement stmt = null;
			ResultSet rset = null;
			String actNameCode = null;
			if(actName.equals("옥탑방고양이")) {
				actNameCode = "CAT";
			}else if(actName.equals("한뺨사이")) {
				actNameCode = "BETWEEN_HEND";
			}else if (actName.equals("행오버"))
				actNameCode = "HANGOVER";
			
			String sql = "SELECT * FROM "+actName+" JOIN CONSUMER USING (CON_NO) WHERE CON_NAME = '"+ resName+"'";
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","GIMAN","GIMAN");
				stmt = conn.createStatement();
				rset = stmt.executeQuery(sql);
				
				if(rset.next()) {
					Act a = new Act();
					//여기까지~
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					rset.close();
					stmt.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			
			
			return act;
		}
		
}
