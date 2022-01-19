package com.raystec.Threads;

public class DemoThread extends Thread{

	protected String name;
	
	public DemoThread(String n) {
	name = n;
	}
@Override
public void run() {
	for (int i = 0; i <50; i++) {
		try {
			Thread.sleep(1000);//its milisecond which print after 1 second (1sec=1000milisecond) its optional. 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i+ "" + name);
	super.run();
}
}
}

