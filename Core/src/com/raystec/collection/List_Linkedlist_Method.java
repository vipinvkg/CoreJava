package com.raystec.collection;

import java.util.LinkedList;
import java.util.List;

public class List_Linkedlist_Method {

	public static void main(String[] args) {
		
		List l = new LinkedList<>();
		l.add('V');
		l.add(123);
		l.add(2.5);
		l.add("vipin");
		
		
		//l.removeAll(l);
		System.out.println(l);
	}
}
