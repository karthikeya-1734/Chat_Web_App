package com.chat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class NameDB {
	public static void main(Name n) {

		String username = n.getName();
		String jdbcurl = "jdbc:mysql://localhost:3306/chatapp";
		String name = "SELECT uname from userdata where uname = ?";
		Connection conn;
		PreparedStatement stmt;
		ResultSet rs;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(jdbcurl,"root","kkkk");
			stmt = conn.prepareStatement(name);
			stmt.setString(1, username);
			
			rs = stmt.executeQuery();
			if(rs.next()) {
				String Retrieveduname = rs.getString(1);
				System.out.println(Retrieveduname);
			}
			else {
				System.out.println("no user");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
