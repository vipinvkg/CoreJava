package com.raystec.collection;

public class Marksheet implements Comparable<Marksheet> {

	private String rollNo;
	private String Fname;
	private String Lname;
	private int phy;
	private int che;
	private int mat;
	
	public Marksheet() {
		// TODO Auto-generated constructor stub
	}
	public Marksheet(String roll,String fn,String ln,int p,int c,int m) {
		rollNo = roll;
		Fname = fn;
		Lname = ln;
		phy = p;
		che = c;
		mat = m;
	}
	public String getRollNo() {
		return rollNo;
	}
	public String getFname() {
		return Fname;
	}
	public String getLname() {
		return Lname;
	}
	public int getPhy() {
		return phy;
	}
	public int getChe() {
		return che;
	}
	public int getMat() {
		return mat;
	}
	@Override
	public int compareTo(Marksheet o) {
		
		return this.rollNo.compareTo(o.rollNo);
	}
}
