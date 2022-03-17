package com.raystec.hibernate;

public class Employeehiber {

	private int id;
	private String fname;
	private String lname;
	private Address empaddr;
	public Employeehiber() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Address getEmpaddr() {
		return empaddr;
	}
	public void setEmpaddr(Address empaddr) {
		this.empaddr = empaddr;
	}
	
	
}
