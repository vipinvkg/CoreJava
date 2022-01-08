package com.raystec.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheet {

	public static void main(String[] args) {
		
		Marksheet m = new Marksheet("3", "Vipin", "Gupta", 98, 99, 97);
		Marksheet m1 = new Marksheet("5", "Amar", "Jain", 88, 89, 87);
		Marksheet m2 = new Marksheet("4", "Ritesh", "Gupta", 77, 78, 68);
		Marksheet m3 = new Marksheet("1", "Paras", "Soni", 82, 86, 78);
		Marksheet m4 = new Marksheet("2", "Amar", "Soni", 72, 77, 76);
		
		ArrayList<Marksheet> l = new ArrayList<Marksheet>();
		l.add(m);
		l.add(m1);
		l.add(m2);
		l.add(m3);
		l.add(m4);
		Collections.sort(l, new TestComparator_fname());
		
		Iterator<Marksheet> it = l.iterator();
		while (it.hasNext()) {
			Marksheet o = it.next();
			System.out.println(o.getRollNo()+" "+ o.getFname()+" "+o.getLname()+" "+o.getPhy()+" "+o.getChe()+" "+o.getMat());
		}
	}
}
