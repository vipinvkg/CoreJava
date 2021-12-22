package com.raystech.basics;

public class Calculate_switch {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		
		switch ('*') {
		case '+':
			System.out.println("Sum of a & B== " + (a+b));
			break;
		case '-':
			System.out.println("Subs of a & B == " + (a-b));
			break;
		case '*':
			System.out.println("Sum of a & B== " + a*b);
			break;
		case '/':
			System.out.println("Sum of a & B== " + a/b);
			break;

		default:
			System.out.println("There Operator required");
			break;
		}
	}
}
