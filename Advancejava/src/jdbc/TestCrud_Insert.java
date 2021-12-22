package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestCrud_Insert {

	public static void main(String[] args) throws Exception {
		
		testselect();
	}

	public static void testselect() throws Exception{
		Class.forName("com.mysql.jdbc.Driver").newInstance();

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("INSERT into employee values (7,'Megha',10000,Null)");
		System.out.println(i+"Record Updated");
		
	stmt.close();
	conn.close();
	}
}
