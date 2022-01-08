package com.raystech.OOP;

public class TestAccount {

	public static void main(String[] args) {
		Account a= new Account();
		a.setAccountType("Saving");
		a.setBalance(1000.00);
		a.setNumber("123456");
		
		String s = a.getAccountType();
		double d = a.getBalance();
		String s1 = a.getNumber();
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(d);
		a.deposit(700);
		System.out.println(a.getBalance());
		a.paybill(300);
		a.fundtransfer(300);
		System.out.println(a.getBalance());
		a.withdraw(601);
		System.out.println(a.getBalance());
	}
}
