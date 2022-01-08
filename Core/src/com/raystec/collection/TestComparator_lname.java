package com.raystec.collection;

import java.util.Comparator;

public class TestComparator_lname implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		
			return o1.getLname().compareTo(o2.getLname());
	}

}
