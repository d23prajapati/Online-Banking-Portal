package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.User;

public class UserDao {
	public User checkLogin(String email, String pass)
		throws SQLException, ClassNotFoundException {
		//JDBC driver name and DB url
		final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://localhost/pro1";
		
		//Database Credentials
		final String USER = "root";
		final String PASS = "root12345678";
		System.out.println("hi");
		
		Connection conn = null;
		
		//Register JDBC driver
		Class.forName(JDBC_DRIVER);
		
		//open a connection
		conn = DriverManager.getConnection(DB_URL, USER, PASS); 
		String sql = "SELECT * FROM customer WHERE email = ? " + "and pass = ?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		stmt.setString(1, email);
		stmt.setString(2, pass);
		
		ResultSet result = stmt.executeQuery();
		
		User user = null;
		
		if(result.next()) {
			user = new User();
			user.setEmail(result.getString("email"));
			user.setPass(result.getString("pass"));
		}
		conn.close();
		
		return user;
	}
}
