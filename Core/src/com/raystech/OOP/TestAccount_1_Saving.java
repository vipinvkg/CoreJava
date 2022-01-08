package com.raystech.OOP;

public class TestAccount_1_Saving {

	public static void main(String[] args) {
		
		Account_1 s = new Account_1();
		Account_1 a = new SavingAccount();
		SavingAccount sa = new SavingAccount();
		
		System.out.println(s.getamount());
		System.out.println(a.getamount());
		System.out.println(sa.getamount());
	}
}
