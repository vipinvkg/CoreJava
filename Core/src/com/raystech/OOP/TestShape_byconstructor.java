package com.raystech.OOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestShape_byconstructor {

	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		d = f.parse("10/10/1999");
		Shape_byconstructor s = new Shape_byconstructor("Red", 10, d);
		
		
	System.out.println(s.getBorderwidth());
	System.out.println(s.getColor());
	System.out.println(f.format(s.getDate()));
	}
}
