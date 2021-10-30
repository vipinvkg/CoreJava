package collectionIntrface;

import java.util.Comparator;

public class TestComprator_Phy implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		return o1.getPhy()- o2.getPhy();
	}

}
