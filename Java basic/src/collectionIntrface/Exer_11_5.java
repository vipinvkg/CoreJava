package collectionIntrface;

import java.util.ArrayList;
import java.util.HashSet;

public class Exer_11_5 {

	public static void main(String[] args) {
		int v;
		double t=0;
		double p =0;
		
		ArrayList a = new ArrayList<>();
	for (int i = 0; i < 100000; i++) {
		a.add(i);
		t=System.currentTimeMillis();
	}
		
		HashSet b = new HashSet<>();
		b.addAll(a);
		for (int j = 0; j <= 50; j++) {
			v=(int) (Math.random()*b.size());
			System.out.println(v);
		p=System.currentTimeMillis();
		}
	System.out.println("Arraylist Time is " +t);
	System.out.println("Hashset Time is " +p);
	}
	}

