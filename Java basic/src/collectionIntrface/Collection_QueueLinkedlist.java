package collectionIntrface;

import java.util.LinkedList;
import java.util.Queue;

public class Collection_QueueLinkedlist {
public static void main(String[] args) {
	Queue a = new LinkedList<>();
	a.add(10);
	a.add(20);
	a.add("Vipin");
	a.add("Gupta");
	//a.remove();
	//a.remove();
			System.out.println(a);
System.out.println(a.peek());

}
}
