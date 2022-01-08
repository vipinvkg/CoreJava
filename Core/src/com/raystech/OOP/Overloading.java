package com.raystech.OOP;

public class Overloading {

	public void add(int a, int b) {
		System.out.println(a+b);

	}
	public int add(int a, int b,int c) {//to different return type 
		int d = a+b+c;
		return d;

	}
	public void add(int a, double b) {
		System.out.println(a+b);

	}
	public void add(double a, int b) {
		System.out.println(a+b);
	}
public static void main(String[] args) {
	Overloading o = new Overloading();
	o.add(10, 20);
	o.add(30, 40);
	int e = o.add(10, 20, 30);
	System.out.println(e);
}
}

