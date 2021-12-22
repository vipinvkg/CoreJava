package com.raystech.basics;

public class Calcuate_ifelse {

	public static void main(String[] args) {
		
		int a = 40;
		int b = 10;
		
		char c = '/';
		
		if (c=='+') {
			System.out.println(a+b);
		}else if(c== '-') {
			System.out.println(a-b);
		}else if (c== '*') {
			System.out.println(a*b);
		}else if (c== '/') {
			System.out.println(a/b);
		} else {
			System.out.println("There Operator required");
		}
	}
}
