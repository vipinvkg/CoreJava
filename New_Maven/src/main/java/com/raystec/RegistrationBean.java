package com.raystec;

public class RegistrationBean {

	private int ID;
private String fname;
private String lname;
private String loginid;
private String password;
private String conpassword;
private String gender;
private String dob;

public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getLoginid() {
	return loginid;
}
public void setLoginid(String loginid) {
	this.loginid = loginid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConpassword() {
	return conpassword;
}
public void setConpassword(String conpassword) {
	this.conpassword = conpassword;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
}
