package com.raystec.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_example {

	public static void main(String[] args) {
		
		Collection c = new ArrayList<>();
		
		c.add("Bura mat Dekho");
		c.add("Bura mat suno");
		c.add("Bura mat bolo");
		
		System.out.println(c.size());
	for (Object ele : c) {
		//System.out.println(ele);
	}
	Object [] oArray = c.toArray();
	
	for (Object ele : oArray) {
		String s = (String) ele;
		System.out.println(s);
	}
	}
 }
