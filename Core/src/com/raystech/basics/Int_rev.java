package com.raystech.basics;

public class Int_rev {

	public static void main(String[] args) {
		
		int num= 102;
		int rem = 0;
		int rev = 0;
		
		while (num!=0) {
			rem = num%10;
			rev=rev*10+rem;
			num= num/10;			
		}
		System.out.println(rev);
	}
}
