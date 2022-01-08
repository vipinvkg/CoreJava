package com.raystech.OOP;

public class Circle_Override extends Shape_override {

	private int radius;

	public Circle_Override() {
	
	}
	
	public Circle_Override(int r) {
		radius = r;
	}
	
	public int getRadius() {
		return radius;
	}
public double area() {
	double area = (double) 3.14*radius*radius;
	return area;

}
}
