package com.raystech.OOP;

public class Rectangle_override extends Shape_override {

private int length;
private int width;

public Rectangle_override() {
	// TODO Auto-generated constructor stub
}
public Rectangle_override(int l, int w) {
length = l;
width = w;
}
public int getLength() {
	return length;
}
public int getWidth() {
	return width;
}
public double area() {
	double area = (double) length*width;
	return area;

}
}
