package com.zc.login.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zc.login.bean.LoginBean;

public class LoginDao {

	private String dburl ="jdbc:mysql://localhost:3306/loginregister";
	private String dbuname = "root";
	private String dbpassword = "ZcMysqL@2021";
	private String dbdriver = "com.mysql.jdbc.Driver";
	
	public void loadDriver(String dBDriver) {
		try {
			Class.forName(dBDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(dburl, dbuname, dbpassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	public boolean validate(LoginBean logBean) {
		
		loadDriver(dbdriver);
		
		Connection con = getConnection();
		boolean status = false;
		String sql = "select * from userdetails where username=? and password=?";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, logBean.getUsername());
			ps.setString(2, logBean.getPassword());
			ResultSet rs = ps.executeQuery();
			status = rs.next();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return status;
		
	}
	
}
