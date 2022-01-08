package com.raystec.collection;

import java.util.Comparator;

public class TestComparator_fname implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		if (o1.getFname()!= o2.getFname()) {
			return o1.getFname().compareTo(o2.getFname());
		} else {
			return o1.getLname().compareTo(o2.getLname());
		}
		
	}

}
