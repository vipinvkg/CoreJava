package com.raystech.OOP;

public class Shapeclass_method_if extends Shape{

	public static void main(String[] args) {
		Shape_override s = getShape(3);
	System.out.println(s.area());
	}

	private static Shape_override getShape(int a) {
		if (a==1) {
			return new Circle_Override(10);
		}
		if (a==2) {
			return new Triangle_override(10, 20);
		}
		if (a==3) {
			return new Rectangle_override(20, 30);
		}
		return new Shape_override();
		
	}
}
