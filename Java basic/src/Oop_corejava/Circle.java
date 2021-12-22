package Oop_corejava;
//how to pass value in arguments
public class Circle {
	public static void main(String[] args) {
		Circle circle =new Circle();
		circle.setcolor("Red");
	}
public void setcolor(String color) {
	System.out.println("Circle is now--" + color);
}

}
