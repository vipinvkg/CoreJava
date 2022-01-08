package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TestTrans_Handle {

	public static void main(String[] args) throws Exception {
		//Transhandle();
		Rollback();
	}

	private static void Rollback() throws Exception{
		Class.forName("com.mysql.jdbc.Driver").newInstance();

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		conn.setAutoCommit(false);
		Statement stmt = conn.createStatement();
		try {
		int i = stmt.executeUpdate("INSERT into employee values (12,'Megha',10000,Null)");
		int j = stmt.executeUpdate("INSERT into employee values (13,'Megha',10000,Null)");
		conn.commit();
		System.out.println("value inserted");
		}catch (SQLException e) {
			conn.rollback();
			System.out.println(e.getMessage());
		}
	stmt.close(); conn.close();
	}

	private static void Transhandle() throws Exception{
		
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
			
			conn.setAutoCommit(false);// this is the function to handle where if any value will be duplicate will not run the program.
			Statement stmt = conn.createStatement();
			int i = stmt.executeUpdate("INSERT into employee values (8,'Megha',10000,Null)");
			int j = stmt.executeUpdate("INSERT into employee values (9,'Megha',10000,Null)");
			int k = stmt.executeUpdate("INSERT into employee values (8,'Megha',10000,Null)");
			int l = stmt.executeUpdate("INSERT into employee values (9,'Megha',10000,Null)");
			System.out.println("Record Updated");
			
			conn.commit();
		stmt.close();
		conn.close();
		}
	}
