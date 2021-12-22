package com.raystech.OOP;

import java.util.Date;

public class Shape_byconstructor {

	private int borderwidth;
	private String color;
	private Date date;
	public static final double pi = 3.14;// constant value (which can't change)

	public Shape_byconstructor() {
		System.out.println("Default constroctor..");
	}

	public Shape_byconstructor(String c, int w, Date d) {
	 color = c;
	 borderwidth = w;
	 date = d;
	}

	public int getBorderwidth() {
		return borderwidth;
	}

	public Date getDate() {
		return date;
	}

	public String getColor() {
		return color;
	}
}
