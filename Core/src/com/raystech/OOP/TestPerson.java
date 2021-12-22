package com.raystech.OOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {

	public static void main(String[] args) throws ParseException {
		Person p = new Person();
		Date d = new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		//Date str=sdf.parse("12/10/1999");
		
		p.setAddress("Vijay Nagar");
		p.setName("Vpin");
		p.setDob(sdf.parse("12/12/1990"));
		
	String s = p.getAddress();
	String s1 = p.getName();
	String k = sdf.format(p.getDob());
	
	System.out.println(s);
	System.out.println(s1);
	System.out.println(k);
	}
}
