package Exersice;

public class Rectangle extends Shape{

	private int length;
	private int width;
	
	public Rectangle() {
	
	}
	public Rectangle(int l , int w) {
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
	double area = length * width;
	return area;

}	
}
