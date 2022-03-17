package Exersice;

public class NewShape_if extends Shape {

	public static void main(String[] args) {
		Shape s = getArea(3);
		System.out.println(s.area());
	}

	private static Shape getArea(int a) {
		if (a==1) {
			return new Circle(20);
		}
		if (a==2) {
			return new Triangle(20, 30);
		}
		if (a==3) {
			return new Rectangle(10, 20);
		}
		return new Shape();
	}
}
