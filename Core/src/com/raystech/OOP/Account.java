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
		
		if ((balance - w) >= 500) {			
			balance = balance - w;
			System.out.println("Withdraw amount is " + w);
		} else {
			Account_exception e = new Account_exception();
			try {
				throw e;
			} catch (Account_exception e1) {
				System.out.println(e1.getMessage());
			}

		}

	}

	public void deposit(double d) {
		balance = balance + d;
		System.out.println("Deposit amount is " + d);
	}

	public void fundtransfer(double f) {
		balance = balance - f;
		System.out.println("fundtransfer amount is " + f);
	}

	public void paybill(double k) {
		balance = balance - k;
		System.out.println("Bill paid of rs. " + k);
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}