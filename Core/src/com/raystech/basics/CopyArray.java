package com.raystech.basics;

public class CopyArray {

	public static void main(String[] args) {

		int[] a = { 5, 10, 15, 20, 25, 30, 35 };
		int[] b = new int[6];

		System.arraycopy(a, 2, b, 0, 5);

		for (int i : b) {
			System.out.println(i);
		}

		char c[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
		char d[] = new char[7];

		System.arraycopy(c, 1, d, 0, 5);
		System.out.println(d);
	}
}
