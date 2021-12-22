package Oop_corejava;

public class Test_circle {

	public static void main(String[] args) {
		Test_circle setcolor = new Test_circle();
		setcolor.setcolor("Red");
		Test_circle setborder = new Test_circle();
		setborder.setborder("blue");
		Test_circle circlesize = new Test_circle();
		circlesize.circlesize(50);
		Test_circle shape = new Test_circle();
		shape.shape(false);
	}
public void setcolor(String color) {
	System.out.println("Circle is now " + color);
}
public void setborder(String color) {
	System.out.println("The border is "+ color);
}
public void circlesize(int size) {
	System.out.println("Circle size is " + size);
}
public void shape(boolean shape) {
	System.out.println("circle shape is " + shape);

}
}
