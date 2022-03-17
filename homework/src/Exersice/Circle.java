package Exersice;

public class Circle extends Shape{

	private int radius;

	public Circle () {
		System.out.println("thic is circle");
	}
	public Circle (int r) {
		radius = r;
	}
	
	public int getRadius() {
		return radius;
	}


 public double area() {
	 double area = (double)3.14 * radius * radius;
	 return area;

}
}

