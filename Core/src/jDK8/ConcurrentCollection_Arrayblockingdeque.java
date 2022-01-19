package jDK8;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class ConcurrentCollection_Arrayblockingdeque {

	public static void main(String[] args) {
		
		ArrayBlockingQueue<Integer> l = new ArrayBlockingQueue<Integer>(10);//it will add item after iterator.
		l.add(10);
		l.add(12);
		l.add(15);
		l.add(28);
		l.add(18);
		
		Iterator<Integer> it = l.iterator();
		l.add(20);
		
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
		}
	}
}
