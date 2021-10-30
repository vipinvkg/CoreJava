package collectionIntrface;

import java.util.LinkedList;
import java.util.List;

public class Collection_List_Linkedlist {
public static void main(String[] args) {
	List l = new LinkedList();
	l.add(5);
	l.add(8.5);
	l.add("vipin");
	l.add('c');
	l.add(0, 6);
	//l.remove(3);
	//l.set(3, "gupta");
	System.out.println(l);
	
	//System.out.println(l.subList(0, 2));
	//System.out.println(l.get(4));

}
}
