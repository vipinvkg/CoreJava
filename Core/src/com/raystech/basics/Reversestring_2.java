package com.raystech.basics;

public class Reversestring_2 {

	public static void main(String[] args) {
		
		String s = "vipin";
		String [] sh= s.split("");
		for (int i = s.length()-1; i >=0; i--) {

		System.out.print(sh [i]);
		}
	}
}
