package com.raystec.Studentmgt;

import com.raystec.JdbcDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentModel extends StudentBean {
	public static void main(String[] args) throws Exception {

	}

	public static void add(StudentBean bean) throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?,?)");
		ps.setString(1, bean.getRollNo());
		ps.setString(2, bean.getFirstName());
		ps.setString(3, bean.getLastName());
		ps.setString(4, bean.getSession());

		ps.executeUpdate();
		conn.commit();
		System.out.println("inserted");
		JdbcDataSource.closeConnection(conn, ps);
	}

	public static void update(StudentBean bean) throws Exception {

		Connection conn = JdbcDataSource.getConnection();
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("update student set FirstName = ?,Lastname=?, Session=? where RollNo = ?");
		ps.setString(4, bean.getRollNo());
		ps.setString(1, bean.getFirstName());
		ps.setString(2, bean.getLastName());
		ps.setString(3, bean.getSession());
				
		ps.executeUpdate();
		conn.commit();
		System.out.println("updated");
		JdbcDataSource.closeConnection(conn, ps);
	}

	public static void delete(StudentBean bean) throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("delete from student where RollNo= ?");
		ps.setString(1, bean.getRollNo());
		ps.executeUpdate();
		conn.commit();
		System.out.println("deleted");
		JdbcDataSource.closeConnection(conn, ps);

	}

	public StudentBean get(StudentBean bean) throws Exception {
		String RollNo = bean.getRollNo();
		Connection conn = JdbcDataSource.getConnection();
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("select* from student where RollNo=?");
		ps.setString(1, RollNo);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			bean.setRollNo(rs.getString(1));
			bean.setFirstName(rs.getString(2));
			bean.setLastName(rs.getString(3));
			bean.setSession(rs.getString(4));
		}	
		JdbcDataSource.closeConnection(conn, null, rs);
		return bean;
	}

	public static List search(StudentBean bean) throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("select * from student");
		ResultSet rs = ps.executeQuery();
		conn.commit();
		System.out.println("RollNo.\tFNAME\tLNAME\tSession");
		StudentBean bean1;
		List list = new ArrayList();
		while (rs.next()) {
			bean1 = new StudentBean();
			bean1.setRollNo(rs.getString(1));
			bean1.setFirstName(rs.getString(2));
			bean1.setLastName(rs.getString(3));
			bean1.setSession(rs.getString(4));
			list.add(bean1);
			
		}
		JdbcDataSource.closeConnection(conn, null, rs);
		return list;
	}
}
