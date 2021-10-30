package collectionIntrface;

import java.util.ArrayList;
import java.util.Iterator;


public class Collection_Arraylist_Iterator {
public static void main(String[] args) {
	
	ArrayList a = new ArrayList<>();
	
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(40);
	
	Iterator it = a.iterator();
	while (it.hasNext()) {
		Object o = (Object) it.next();
		System.out.println(o);
	//for (Object o : a) {
		//System.out.println(o);
		
	}
	}
}
	
	