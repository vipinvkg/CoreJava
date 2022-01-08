package jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class BatchProcess {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		conn.setAutoCommit(false);
		PreparedStatement stmt = conn.prepareStatement("insert into employee (ID,Fname,Salary,Dept_id) values (?,?,?,?)");
		stmt.setInt(1, 14);
		stmt.setString(2, "Shyam");
		stmt.setInt(3, 20000);
		stmt.setInt(4, 3);
		stmt.addBatch();
		
		stmt.setInt(1, 15);
		stmt.setString(2, "vijay");
		stmt.setInt(3, 23000);
		stmt.setInt(4, 4);
		stmt.addBatch();
		
		int []count = stmt.executeBatch();
		System.out.println("executed");
		conn.commit();
		conn.close();
		stmt.close();
		
	}
}
