package com.raystech.OOP;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		
		r.setLength(20);
		r.setWidth(10);
		r.setBorderwidth(30);
		r.setColor("Blue");
		
		r.area();
		System.out.println(r.getBorderwidth());
		System.out.println(r.getColor());
		
	}
}
