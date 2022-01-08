package com.raystec.rb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

public class Delete_rb {
	
	public static void main(String[] args) throws Exception {
	
		ResourceBundle rb = ResourceBundle.getBundle("com.raystec.rb.app");
		
		String Driver = rb.getString("Driver");
		String url = rb.getString("url");
		String user = rb.getString("Userid");
		String password = rb.getString("password");
		
		Class.forName(Driver);

		Connection conn = DriverManager.getConnection(url,user,password);

		int id = 8;
		PreparedStatement ps = conn.prepareStatement("delete from employee where id = ?");

		ps.setInt(1, id);

		int i = ps.executeUpdate();
		System.out.println("Deleted");

		ps.close();
		conn.close();
	}
	}

