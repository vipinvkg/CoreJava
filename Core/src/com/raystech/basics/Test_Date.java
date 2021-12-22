package com.raystech.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test_Date {

	public static void main(String[] args) throws ParseException {

		Date d = new Date();

		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String str = sdf.format(d);// Converted Date to String
		System.out.println(str);
		String s = "05/11/2021";
		Date dd = sdf.parse(s); // Converted String to date
		System.out.println(dd);

	}

}
