package Exersice;

public class Triangle extends Shape {

	private int base;
	private int height;
	
	public Triangle() {
		}
	public Triangle(int b, int h) {
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
	double area = (double)1/2*base*height;
	return area;

}
}
