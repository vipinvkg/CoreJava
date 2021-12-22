package com.raystech.OOP;

public class TestAutomobile {

	public static void main(String[] args) {

		Automobile a = new Automobile();

		a.setColor("Black");
		a.setMake("Lamborghini");
		a.setSpeed(200);

		System.out.println(a.getColor());
		System.out.println(a.make);
		System.out.println(a.speed);
	}
}
