package com.raystech.basics;

public class TypeCasting_MaxtoMin {

	public static void main(String[] args) {
		
		int a = 10;//without typecast we can store data from min. data type to max. size
		double d = a;//1
		short s = 20;
		int b = s;//2
		float c = 10.10f;
		double e = c;//3
		System.out.println(d);
		System.out.println(b);
		System.out.println(e);
		double k = 20.66; // Using typecast to store data from small data type to big data type.
		int i = (int) k;
		int j = 50;
		short l = (short) j;
		System.out.println(i);
		System.out.println(l);
	}
}
