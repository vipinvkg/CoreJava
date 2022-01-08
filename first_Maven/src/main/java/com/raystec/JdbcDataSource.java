package com.raystec;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class JdbcDataSource {

	private static JdbcDataSource jds = null;
	private ComboPooledDataSource ds = null;
	
	private JdbcDataSource() {
		ResourceBundle rb = ResourceBundle.getBundle("com.raystec.app");
		try {
		ds = new ComboPooledDataSource();
		
		ds.setDriverClass(rb.getString("Driver"));
		ds.setJdbcUrl(rb.getString("url"));
		ds.setUser(rb.getString("Userid"));
		ds.setPassword(rb.getString("password"));
		ds.setInitialPoolSize(5);
		ds.setAcquireIncrement(5);
		ds.setMaxPoolSize(5);
		}catch (PropertyVetoException e) {
			e.printStackTrace();
		}
	}
public static JdbcDataSource getInstance() {
	if (jds==null) {
		jds = new JdbcDataSource();
	}
	return jds;
}

public static Connection getConnection() {
	try {
		return getInstance().ds.getConnection();
	}catch (SQLException e) {
		return null;
	}
}
public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) {
	try {
		if (rs != null) rs.close();
		if (stmt != null) stmt.close();
		if (conn != null) conn.close();
	}catch (SQLException e) {
		e.printStackTrace();
	}
}
public static void closeConnection (Connection conn,Statement stmt) {
	closeConnection (conn,stmt,null);
}
public static void closeConnection(Connection conn) {
	closeConnection (conn,null,null);
}
}
