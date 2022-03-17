package Exersice;

public class TestCircle {

	public static void main(String[] args) {
		Shape [] s = new Shape [2];
		s[0] = new Circle(20);
		s[1] = new Triangle(20, 30);
		double totalArea = calArea(s);
		System.out.println(totalArea);
	}

	private static double calArea(Shape[] s) {
		double totalArea = 0;
		for (int i = 0; i < s.length; i++) {
			totalArea = totalArea + s[i].area();
		}
		return totalArea;
	}
}
