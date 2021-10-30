package collectionIntrface;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_Sorting {

	public static void main(String[] args) {

		ArrayList a = new ArrayList<>();
		a.add(10);
		a.add(7);
		a.add(90);
		a.add(105);
		a.add(1000);

		//System.out.println(a);
		Collections.sort(a);

		System.out.println(a);
	}

}