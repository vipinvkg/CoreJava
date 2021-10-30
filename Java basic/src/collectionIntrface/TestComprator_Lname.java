package collectionIntrface;

import java.util.Comparator;

public class TestComprator_Lname implements Comparator<Marksheet>{

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		if (o1.getLname()!=o2.getLname()) {
			return o1.getLname().compareTo(o2.getLname());	
		} else {
			return o1.getFname().compareTo(o2.getFname());

		}
		
		
	}

}
