package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class Callable_Statement {

	public static void main(String[] args) throws Exception {
		
//testproc();	
testfunc();
	}

	private static void testfunc() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		CallableStatement callstmt = conn.prepareCall("{?= CALL empcount()}");
		
		callstmt.registerOutParameter(1, Types.INTEGER);
		
		callstmt.execute();
		System.out.println("count " + callstmt.getInt(1));
	}

	private static void testproc() throws Exception{
		Class.forName("com.mysql.jdbc.Driver").newInstance();

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
	CallableStatement callstmt	= conn.prepareCall("{Call emp_count(?)}");
		
	callstmt.registerOutParameter(1, Types.INTEGER);
		callstmt.execute();
		
		int count = callstmt.getInt(1);
		
		System.out.println("Count " + count);
		
		callstmt.close();
		conn.close();
	}
}
