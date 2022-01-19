package com.raystec.Threads;

public class Test_Account_aSynchronize extends Thread{

	public static Account_asynchronize data = new Account_asynchronize();
	String name = null;
	public Test_Account_aSynchronize(String name) {
	this.name = name;
	}
@Override
public void run() {
for (int i = 0; i <5; i++) {
	data.deposit(name, 1000);
}
	super.run();
}
public static void main(String[] args) {
	Test_Account_aSynchronize t1 = new Test_Account_aSynchronize("vipin");
	Test_Account_aSynchronize t2 = new Test_Account_aSynchronize("Manoj");
	
	t1.start();
	t2.start();
}
}

