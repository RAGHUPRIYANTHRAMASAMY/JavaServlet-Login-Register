package com.zc.register.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.zc.register.bean.RegisterBean;

public class RegisterDao {
	
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
	
	public boolean insert(RegisterBean regBean) {
		
		loadDriver(dbdriver);
		
		Connection con = getConnection();
		
		boolean status = true;
		
		String sql = "insert into loginregister.userdetails value(?,?,?,?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, regBean.getUname());
			ps.setString(2, regBean.getUpass());
			ps.setString(3, regBean.getUemail());
			ps.setInt(4, regBean.getUphone());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			status = false;
		}
		
		return status;
	}
	
}
