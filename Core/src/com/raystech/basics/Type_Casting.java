package com.raystech.basics;

public class Type_Casting {

	public static void main(String[] args) {
		
		float result;
		int i,j;
		i = 25;
		j = 10;
		result = i/j;
		System.out.println(result);//without typecasting
		
		result = (float) i/j;
		System.out.println(result);// After typecasting
	}
}
