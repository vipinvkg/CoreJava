package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Crud_prepared {

	public static void main(String[] args) throws Exception {

		// testinsert();
		// testupdate();
		// testdelete();
		testget(1);
		// testselect();
	}

	private static void testselect() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		PreparedStatement ps = conn.prepareStatement("select * from employee");

		ResultSet rs = ps.executeQuery();
		System.out.println("ID\tFNAME\tSALARY");
		while (rs.next()) {
			System.out.print(rs.getString(1));
			System.out.print("\t" + rs.getString(2));
			System.out.println("\t" + rs.getString(3));
		}
		rs.close();
		conn.close();
	}

	private static void testget(int i) throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		PreparedStatement ps = conn.prepareStatement("select * from employee where id = ?");
		ps.setInt(1, i);

		ResultSet rs = ps.executeQuery();

		System.out.println("ID\tFNAME\tSALARY");

		rs.next();
		System.out.print(rs.getString(1));
		System.out.print("\t" + rs.getString(2));
		System.out.println("\t" + rs.getString(3));

		rs.close();
		conn.close();
	}

	private static void testdelete() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		int id = 8;
		PreparedStatement ps = conn.prepareStatement("delete from employee where id = ?");

		ps.setInt(1, id);

		int i = ps.executeUpdate();
		System.out.println("Deleted");

		ps.close();
		conn.close();
	}

	private static void testupdate() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		String fname = "kanish";
		int id = 8;

		PreparedStatement ps = conn.prepareStatement("update employee set fname = ? where id = ?");
		ps.setString(1, fname);
		ps.setInt(2, id);

		ps.executeUpdate();
		System.out.println("Updated");

		ps.close();
		conn.close();
	}

	private static void testinsert() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		int id = 8;
		String fname = "Uday";
		int Salary = 15000;
		int did = 5;
		PreparedStatement ps = conn.prepareStatement("insert into employee values (?,?,?,?)");

		ps.setInt(1, id);
		ps.setString(2, fname);
		ps.setInt(3, Salary);
		ps.setInt(4, did);

		ps.executeUpdate();
		System.out.println("inserted");
		ps.close();
		conn.close();
	}
}
