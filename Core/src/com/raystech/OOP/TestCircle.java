package com.raystech.OOP;

public class TestCircle {

	public static void main(String[] args) {
		Circle c = new Circle();

		c.setBorderwidth(5);
		c.setColor("Red");
		c.setRadius(10);
		
		c.area();
		System.out.println(c.getBorderwidth());
		System.out.println(c.getColor());

	}
}
