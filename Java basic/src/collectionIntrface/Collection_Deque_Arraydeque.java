package collectionIntrface;

import java.util.ArrayDeque;
import java.util.Deque;

public class Collection_Deque_Arraydeque {

	public static void main(String[] args) {
		
		Deque d = new ArrayDeque<>();
		
		d.add(10);
		d.add("vipin");
		d.add(2.5);
		d.add('g');
		d.add("kumar");
		d.add(90);
		//d.addFirst(99);
		//d.offerFirst(100);
		//d.removeLast();
		//d.pollFirst();
		System.out.println(d);
		//System.out.println(d.getFirst());
	}
}
