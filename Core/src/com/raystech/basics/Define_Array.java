package com.raystech.basics;

public class Define_Array {

	public static void main(String[] args) {

		int[] a = { 2, 4, 6, 8, 10, 12, 14 };// Static
		int[] b = new int[10];// Dynamic
		b[0] = 2;
		b[1] = 4;
		b[2] = 6;
		b[3] = 8;
		b[4] = 10;
		b[5] = 12;
		b[6] = 14;
		b[7] = 16;
		
		for (int j : a) {
			System.out.print(j);
		}
		
		System.out.println("");
		for (int i : b) {
			System.out.println(i);
			
		}
	}
}
