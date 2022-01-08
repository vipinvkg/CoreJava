package com.raystech.OOP;

public class TestArray_Shapes {

	public static void main(String[] args) {
		
		Shape_override [] s = new Shape_override[3];
		s[0]= new Circle_Override(10);//314 area
		s[1] = new Triangle_override(10, 20);//100 area
		s[2] = new Rectangle_override(20, 30);//600 area
		double totalArea = calcArea(s);
		System.out.println(totalArea);
	}
public static double calcArea(Shape_override[] s) {
	double totalArea =0;
	for (int i = 0; i < s.length; i++) {
		totalArea = totalArea + s[i].area();
			}
	return totalArea;
 

}
}

