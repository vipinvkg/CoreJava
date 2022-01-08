package com.raystech.OOP;

public class TestCicle_Override {

	public static void main(String[] args) {

		
		Shape_override s = new Circle_Override(10);
		s.setBorderwidth(20);
		s.setColor("kala");		s.area();
		
		System.out.println(s.getBorderwidth());
		System.out.println(s.getColor());
		
	}
}
