package Exersice;

public class TestCircle {

	public static void main(String[] args) {
		Circle c = new Circle(5);
		Shape a = new Shape(10, "new");
		
		c.area();
		//System.out.println(c.getRadius());
		System.out.println(a.getBorderwidth());
		System.out.println(a.getColor());
	}
}
