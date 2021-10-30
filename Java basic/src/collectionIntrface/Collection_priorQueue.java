package collectionIntrface;

import java.util.PriorityQueue;
import java.util.Queue;

public class Collection_priorQueue {

	public static void main(String[] args) {
		Queue a = new PriorityQueue<>();
	a.add("vipin");
	a.add("gupta");
	a.add("Sonu");
	a.add("rajat");
	a.offer("kumar");
	//a.remove();
	//a.remove();
	//a.poll();
	System.out.println(a);
	//System.out.println(a.element());
	//System.out.println(a.peek());
	
	}
}
