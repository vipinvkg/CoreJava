package com.raystec.Threads;

public class TestDemoThread {

	public static void main(String[] args) {
		
		DemoThread t1 = new DemoThread("Ram");
		DemoThread t2 = new DemoThread("Shyam");
		
		t1.start();
		t2.start();
	}
}
