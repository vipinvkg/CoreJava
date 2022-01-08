package com.raystech.OOP;

public class Triangle_override extends Shape_override{

	private int base;
	private int height;
	
	public Triangle_override() {
		// TODO Auto-generated constructor stub
	}
	public Triangle_override(int b , int h) {
	base = b;
	height = h;
	}
	
	public int getBase() {
		return base;
	}
	public int getHeight() {
		return height;
	}
	
	public double area() {
		double area = (double) 1/2 * base * height;
		return area;
	}
}
