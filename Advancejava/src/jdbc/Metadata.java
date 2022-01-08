package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.ResultSetMetaData;

public class Metadata {

public static void main(String[] args) throws Exception{
	
	Class.forName("com.mysql.jdbc.Driver").newInstance();

	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery("select id,rollno,fname,lname from marksheet");
	ResultSetMetaData rsmt = (ResultSetMetaData) rs.getMetaData();

	System.out.println("Catelog Name:" + rsmt.getCatalogName(1));
	System.out.println("Table Name:" + rsmt.getTableName(1));
	
	int columnCount = rsmt.getColumnCount();
	System.out.println("Total Columns:"+ columnCount);
	
	for (int i = 1; i <=columnCount; i++) {
		System.out.println("Column:"+ (i));
		System.out.println("Label :"+ rsmt.getColumnLabel(i));
		System.out.println("Name :"+ rsmt.getColumnName(i));
		System.out.println("Type :"+ rsmt.getColumnTypeName(i));
		System.out.println("Size :"+ rsmt.getColumnDisplaySize(i));
		System.out.println("Precision :"+ rsmt.getPrecision(i));
		System.out.println();
		
	}
}	
}
