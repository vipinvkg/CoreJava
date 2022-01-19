package com.raytesc.InOutputStream;

import java.io.Serializable;

public class Employee_Serialization implements Serializable {

	private int id;
	private String fname;
	private String lname;
	private String loginid;
	private transient String password;//it will not be read or write

public Employee_Serialization() {
	// TODO Auto-generated constructor stub
}
public Employee_Serialization(int id,String fname,String lname,String loginid,String password) {
this.id=id;
this.fname=fname;
this.lname=lname;
this.loginid= loginid;
this.password=password;	
}
public int getId() {
	return id;
}
public String getFname() {
	return fname;
}
public String getLname() {
	return lname;
}
public String getLoginid() {
	return loginid;
}
public String getPassword() {
	return password;
}
}