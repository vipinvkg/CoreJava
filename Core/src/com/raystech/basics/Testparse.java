package com.raystech.basics;

public class Testparse {

	public static void main(String[] args) {
		String s = "144.567";
		String s1 = "100";
		System.out.println(s+s1);
		
		float a = Float.parseFloat(s);
		int b = Integer.parseInt(s1);
		System.out.println(a+b);
	}
}
