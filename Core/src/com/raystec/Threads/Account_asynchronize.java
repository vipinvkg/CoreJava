package com.raystec.Threads;

public class Account_asynchronize {

	private int balance = 0;
	
	public void deposit(String msg, int amt) {
		int bal = getBalance();
		setBalance(bal+amt);
		System.out.println(msg + "now Balance is"+ getBalance());

	}

	public int getBalance() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return balance;
	}

	public void setBalance(int balance) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.balance = balance;
	}
	
	
}
