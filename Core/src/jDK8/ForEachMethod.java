package jDK8;

import java.util.ArrayList;

public class ForEachMethod {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(22);
		l.add(15);
		l.add(20);
		l.add(32);
		l.forEach(li-> System.out.println(li));
	}
}
