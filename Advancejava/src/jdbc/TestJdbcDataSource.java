package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJdbcDataSource {

	public static void main(String[] args) throws Exception {
		
		String sql = "select id,rollno,fname,lname from marksheet;";
		
		Connection conn = JdbcDataSource.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		System.out.println("DB Pool Connection");
		System.out.println("ID\tRollno\tFname\tLname");
		while (rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getString(3));
			System.out.println("\t" + rs.getString(4));
		}
	JdbcDataSource.closeConnection(conn, stmt, rs);
	}
}
