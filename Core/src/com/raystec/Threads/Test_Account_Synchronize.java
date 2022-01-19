package com.raystec.Threads;

public class Test_Account_Synchronize extends Thread{

	public static Account_Synchronize data = new Account_Synchronize();
	String name = null;
	public Test_Account_Synchronize(String name) {
	this.name=name;
	}
@Override
public void run() {
	for (int i = 0; i <5; i++) {
		data.deposit(name, 1000);
		super.run();	
}

}
public static void main(String[] args) {
	Test_Account_Synchronize t1 = new Test_Account_Synchronize("vipin");
	Test_Account_Synchronize t2 = new Test_Account_Synchronize("manoj");
	
	t1.start();
	t2.start();
}
}
