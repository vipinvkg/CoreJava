package com.raystech.OOP;

public class Account {

	private String number;
	private String accountType;
	private double balance;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public void withdraw(double w) {
		balance = balance-w;
		System.out.println("Withdraw amount is "+ balance);
	}
 public void deposit(double d) {
	balance = balance + d;
	System.out.println("Deposit amount is "+ d);
}
public void fundtransfer(double f) {
	balance = balance-f;	
	System.out.println("fundtransfer amount is "+ balance);
}
public void paybill(double k) {
	balance = balance-k;
	System.out.println("Bill paid & balance is " + balance);
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance ;
}
}