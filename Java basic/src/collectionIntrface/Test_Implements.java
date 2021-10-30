package collectionIntrface;

import java.util.ArrayList;

public class Test_Implements {

	public static void main(String[] args) {
		ArrayList v = new ArrayList<>();
		v.add("vipin");
		v.add("Kumar");
		v.add("Gupta");
		
		Integer i = new Integer(8);
		v.add(i);
		
		Integer value = (Integer) v.get(3);
		System.out.println(i);
	}
}
