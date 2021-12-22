package com.raystech.OOP;

public class TestTriangle {

	public static void main(String[] args) {
		
		Triangle t = new Triangle();
		
		t.setBorderwidth(30);
		t.setColor("Green");
		t.setBase(10);
		t.setHeight(20);
		
		t.area();
		System.out.println(t.getBorderwidth());
		System.out.println(t.getColor());
	}
}
