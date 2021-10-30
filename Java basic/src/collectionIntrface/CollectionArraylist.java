package collectionIntrface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionArraylist {

	public static void main(String[] args) {
		List v = new ArrayList();
		v.add(5);
		v.add(3.5);
		v.add("vipin");
		v.add('V');
		v.add(9);
		v.add(30);
		v.add("kumar");
		//v.remove(2);
		System.out.println(v);
		List k = new ArrayList();
		k.add(5);
		k.add(8.5);
		k.add('m');
		k.add("gupta");
		k.add("kumar");
		//k.removeAll(k);
		//k.addAll(v);
		//System.out.println(k);
		//System.out.println(k.containsAll(v));
		for (Object L : k) {
			System.out.println(L);
	//System.out.println(k.contains('V'));
		//System.out.println(v.retainAll(k));
		//System.out.println(v);
	//System.out.println(v.size());
	
	}
	}
}