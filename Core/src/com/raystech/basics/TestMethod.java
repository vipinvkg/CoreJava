package com.raystech.basics;

public class TestMethod {

	public void add() {
		System.out.println(10 + 5);
	}

	public void subs(int a, int b) {
		System.out.println(a - b);
	}

	public int mul(int a, int b) {
		return (a * b);
	}

	public static int div(int a, int b) {
		return (a / b);
	}

	public static void main(String[] args) {
		TestMethod a = new TestMethod();
		a.add();
		a.subs(10, 5);
		int c = a.mul(10, 5);
		System.out.println(c);
		int d = div(10, 5);
		System.out.println(d);
	}
}
