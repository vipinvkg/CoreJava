package com.raystech.OOP;

public class Customer_ShallowCloning implements Cloneable{
	
	private int id;
	private String name;
	private Account_ShallowCloning acc;
	
	public Customer_ShallowCloning() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account_ShallowCloning getAcc() {
		return acc;
	}

	public void setAcc(Account_ShallowCloning acc) {
		this.acc = acc;
	}
@Override
protected Object clone() throws CloneNotSupportedException {
	
	return super.clone();
}
}
