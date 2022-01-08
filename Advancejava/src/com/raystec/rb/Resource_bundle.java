package com.raystec.rb;

import java.util.Locale;
import java.util.ResourceBundle;

public class Resource_bundle {

	public static void main(String[] args) {
		
		ResourceBundle rb = ResourceBundle.getBundle("com.raystec.rb.app", new Locale("hi"));
		ResourceBundle rs = ResourceBundle.getBundle("com.raystec.rb.app_hindi");
		
		System.out.println(rb.getString("url"));
		System.out.println(rb.getString("greeting"));
		System.out.println(rs.getString("hi"));
	}
}