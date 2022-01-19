package com.raystec.Threads;

public class ThreadInfo {

	public static void main(String[] args) {
		
		Thread t = new Thread("My Thread");
		log(" ",t);
	}

	private static void log(String indent, Thread t) {
		System.out.println(indent+"THREAD Name: " + t.getName());
		System.out.println(indent+"ID: "+ t.getId());
		System.out.println(indent+"Priority: "+ t.getPriority());
		System.out.println(indent+"State: "+ t.getState());
		System.out.println(indent+"Thread Group: "+ t.getThreadGroup().getName());
		System.out.println(indent+"Is Alive: "+ t.isAlive());
		System.out.println(indent+"Is Daemon: "+ t.isDaemon());
	}
}
