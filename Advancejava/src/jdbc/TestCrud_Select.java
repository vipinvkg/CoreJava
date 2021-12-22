package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestCrud_Select {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT ID,FNAME,SALARY FROM EMPLOYEE");
		System.out.println("ID\tFNAME\tSALARY");
		while (rs.next()) {
			System.out.print(rs.getString(1));
			System.out.print("\t" + rs.getString(2));
			System.out.println("\t" + rs.getString(3));
		}
		stmt.close();
		conn.close();
	}
}
