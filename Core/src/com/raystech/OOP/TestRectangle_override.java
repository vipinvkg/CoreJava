package com.raystech.OOP;

public class TestRectangle_override {

	public static void main(String[] args) {
		
		Shape_override s = new Rectangle_override(20, 40);
		s.setBorderwidth(20);
		s.setColor("Bhura");
		s.area();
		
		System.out.println(s.getBorderwidth());
		System.out.println(s.getColor());
	}
}
