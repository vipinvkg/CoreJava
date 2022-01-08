package com.raystec.marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MarksheetModel extends MarksheetBean {

	public static Integer nextPK() throws SQLException {
		
		Connection conn =null;
		int pk =0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
			PreparedStatement ps = conn.prepareStatement("select max(id) from marksheet");
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

	
	
	public static void add(MarksheetBean bean) throws Exception {
		
		
		int pk = 0;
		pk = nextPK();
		Connection conn = JdbcDataSource.getConnection();
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("insert into Marksheet values(?,?,?,?,?,?,?)");

		ps.setInt(1, pk);
		ps.setString(2, bean.getRollno());
		ps.setString(3, bean.getFname());
		ps.setString(4, bean.getLname());
		ps.setInt(5, bean.getPhysics());
		ps.setInt(6, bean.getChemistry());
		ps.setInt(7, bean.getMath());

		ps.executeUpdate();
		conn.commit();
		System.out.println("inserted");
	JdbcDataSource.closeConnection(conn, ps);	
	}

	public static void update(MarksheetBean bean) throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("update Marksheet set fname = ? where id = ?");
		ps.setString(1, bean.getFname());
		ps.setInt(2, bean.getId());
		ps.executeUpdate();
		conn.commit();
		System.out.println("Updated");
		JdbcDataSource.closeConnection(conn, ps);
	}

	public static void delete(MarksheetBean bean) throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("delete from Marksheet where id = ?");
		ps.setInt(1, bean.getId());
		ps.executeUpdate();
		conn.commit();
		System.out.println("Deleted");
		JdbcDataSource.closeConnection(conn, ps);
	}

	public static void get(MarksheetBean bean) throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("select * from marksheet where rollno = ?");
		ps.setString(1, bean.getRollno());
		ResultSet rs = ps.executeQuery();
		conn.commit();

		System.out.println("ID\tRollNo.\tFNAME\tLNAME\tPhysics\tChemistry Math");

		rs.next();
		System.out.print(rs.getString(1));
		System.out.print("\t" + rs.getString(2));
		System.out.print("\t" + rs.getString(3));
		System.out.print("\t" + rs.getString(4));
		System.out.print("\t" + rs.getString(5));
		System.out.print("\t" + rs.getString(6));
		System.out.println("\t" + rs.getString(7));
		JdbcDataSource.closeConnection(conn, null, rs);
	}
	
	public static void search() throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("select * from marksheet");
		ResultSet rs = ps.executeQuery();
		conn.commit();
		System.out.println("ID\tRollNo.\tFNAME\tLNAME\tPhysics\tChemistry\tMath");
		while (rs.next()) {
			System.out.print(rs.getString(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getString(3));
			System.out.print("\t" + rs.getString(4));
			System.out.print("\t" + rs.getString(5));
			System.out.print("\t" + rs.getString(6));
			System.out.println("\t" + rs.getString(7));
		}
		JdbcDataSource.closeConnection(conn, null, rs);
	}
	public static void getmeritlist(MarksheetBean bean) throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("select *, ((Chemistry+Physics+Math)/3) AS Percentage from Marksheet where physics>40 and chemistry>40 and math>40 order by percentage desc limit 0,5");
		ResultSet rs = ps.executeQuery();
		conn.commit();
		System.out.println("ID\tRollNo.\tFNAME\tLNAME\tPhysics\tChemistry\tMath\tPercentage");
		while (rs.next()) {
			System.out.print(rs.getString(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getString(3));
			System.out.print("\t" + rs.getString(4));
			System.out.print("\t" + rs.getString(5));
			System.out.print("\t" + rs.getString(6));
			System.out.print("\t" + rs.getString(7));
			System.out.print("\t" + rs.getString(8));
			System.out.println();
		}
		JdbcDataSource.closeConnection(conn, null, rs);
	}
}
