package com.raystec.Threads;

public class Test_HelloWithoutThread {

	public static void main(String[] args) {
		
		HelloWithoutThread t1 = new HelloWithoutThread("Raina");
		HelloWithoutThread t2 = new HelloWithoutThread("virat");
		
		t1.run();
		t2.run();
		
	}
}
