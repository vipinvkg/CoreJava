package com.raystec.collection;

import java.util.ArrayList;
import java.util.List;

public class List_Arraylist_Method {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		l.add(5);
		l.add('V');
		l.add(5.5);
		l.add("vipin");
		
		System.out.println(l);

		List a = new ArrayList();
		a.add(7);
		a.add('K');
		a.add(5.8);
		a.add("Gupta");
		a.addAll(l);
		//a.clear();
		//System.out.println(l.contains('V'));
		//System.out.println(a.isEmpty());
		System.out.println(a);
		//System.out.println(a.remove(2));
		System.out.println(a.size());
		
	}
}
