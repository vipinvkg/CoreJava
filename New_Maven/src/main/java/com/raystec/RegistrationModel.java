package com.raystec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegistrationModel extends RegistrationBean {


public static Integer nextPK() throws SQLException {
		
		Connection conn =null;
		int pk =0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
			PreparedStatement ps = conn.prepareStatement("select max(id) from registration");
					ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				pk = rs.getInt(1);
			}
		rs.close();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			conn.close();
		}
		return pk+1;
	}
public static void add(RegistrationBean bean) throws Exception {
	
	
	int pk = 0;
	pk = nextPK();
	Connection conn = JdbcDataSource.getConnection();
	conn.setAutoCommit(false);
	PreparedStatement ps = conn.prepareStatement("insert into registration values(?,?,?,?,?,?,?,?)");

	ps.setInt(1, pk);
	ps.setString(2, bean.getFname());
	ps.setString(3, bean.getLname());
	ps.setString(4, bean.getLoginid());
	ps.setString(5, bean.getPassword());
	ps.setString(6, bean.getConpassword());
	ps.setString(7, bean.getGender());
	ps.setString(8, bean.getDob());
	

	ps.executeUpdate();
	conn.commit();
	System.out.println("inserted");
JdbcDataSource.closeConnection(conn, ps);	
}
public static void authentication(String userid, String password) throws Exception {
	String e= userid;
	String p= password;
	
	try {
	Connection conn = JdbcDataSource.getConnection();
	PreparedStatement ps = conn.prepareStatement("select Loginid from registration where Loginid = ?");
	ps.setString(1,e);
	ResultSet rs = ps.executeQuery();
	PreparedStatement ps1 = conn.prepareStatement("select password from registration where Password = ?");
	ps1.setString(1,p);
	ResultSet rsp = ps1.executeQuery();
	if (rs.next() && rsp.next()) {
		System.out.println("Successfully login");
	} else {
		System.out.println("Invalid login id or password");
		System.exit(1);
	}
	}catch (Exception e2) {
		System.out.println("Login ID & password is invalid");
		
	}
	}
public RegistrationBean authent(RegistrationBean bean) throws SQLException  {
	String log = bean.getLoginid();
	String pwd = bean.getPassword();
	Connection conn = null;
	PreparedStatement ps =null;
	ResultSet rs = null;
	try { conn = JdbcDataSource.getConnection();

	 ps = conn.prepareStatement("select * from registration where Loginid =? and password=?");
	
	ps.setString(1, log);
	ps.setString(2, pwd);
	
	rs=ps.executeQuery();
	while(rs.next()) {
		bean.setID(rs.getInt(1));
		bean.setFname(rs.getString(2));
		bean.setLname(rs.getString(3));
		bean.setLoginid(rs.getString(4));
		bean.setPassword(rs.getString(5));
		bean.setConpassword(rs.getString(6));
		bean.setGender(rs.getString(7));
		bean.setDob(rs.getString(8));
	}
	
	}catch (Exception e) {
		System.out.println("Login is not possible : "+ e.getMessage());
	}
	JdbcDataSource.closeConnection(conn, ps, rs);
	return bean;
}
public RegistrationBean forgotPassword(RegistrationBean bean) throws Exception {
	String email = bean.getLoginid();
	Connection conn = JdbcDataSource.getConnection();
	PreparedStatement ps = conn.prepareStatement("select password from registration where Loginid=?");
	ps.setString(1, email);
	ResultSet rs = ps.executeQuery();
	while (rs.next()) {
		bean.setPassword(rs.getString(1));
	}
JdbcDataSource.closeConnection(conn, ps, rs);
return bean;
}
}
	
	
