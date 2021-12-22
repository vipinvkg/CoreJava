package com.raystech.basics;

public class Methods {

	public void add() { // Create a Method
		System.out.println(10 + 20);
	}

	public void subs(int a, int b) {// Prarameter pass in method
		System.out.println(a - b);
	}

	public int mul(int a, int b) {// Return value of method
		return a * b;
	}

	public static int div(int a, int b) {//Static.. direct call from main method
		return a / b;
	}

	public static void main(String[] args) {
		Methods a = new Methods();
		a.add();
		a.subs(20, 10);
		int c = a.mul(10, 5);
		System.out.println(c);
		int d = div(20, 10);
		System.out.println(d);
	}
}
