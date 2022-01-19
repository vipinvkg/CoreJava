package com.raystec.Threads;

public class Test_Runnable extends DemoThread implements Runnable {

	public Test_Runnable(String n) {
		super(n);
		}
@Override
public void run() {
for (int i = 0; i <10; i++) {
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
System.out.println(i+" " + name);
}
}
public static void main(String[] args) {
	DemoThread t1 = new DemoThread("Vipin");
	DemoThread t2 = new DemoThread("Raj");
	
	Thread one = new Thread(t1);
	Thread two = new Thread(t2);
	
	one.start();
	two.start();
}
}
