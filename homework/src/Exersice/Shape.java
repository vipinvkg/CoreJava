package Exersice;

public class Shape {

	private int borderwidth;
	private String color;
	
	public Shape() {
		//System.out.println("this is default");
	}
		public Shape (int b,String c) {
			borderwidth = b;
			color = c;
		}
	
	public int getBorderwidth() {
		return borderwidth;
	}
	public String getColor() {
		return color;
	}
}

