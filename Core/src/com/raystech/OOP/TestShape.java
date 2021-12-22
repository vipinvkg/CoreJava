package com.raystech.OOP;

public class TestShape {

	public static void main(String[] args) {
		Shape s = new Shape();
		
		s.setBorderwidth(10);
		s.setColor("Red");
		
		int a = s.getBorderwidth();
		String b = s.getColor();
		
		System.out.println(a);
		System.out.println(b);
		
		//System.out.println(s.getBorderwidth());
		//System.out.println(s.getColor());
	}
}
