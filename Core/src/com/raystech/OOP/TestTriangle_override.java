package com.raystech.OOP;

public class TestTriangle_override {

	public static void main(String[] args) {

		Shape_override s = new Triangle_override(30, 40);
		s.setBorderwidth(40);
		s.setColor("hara");
		s.area();

		System.out.println(s.getBorderwidth());
		System.out.println(s.getColor());
	}
}
