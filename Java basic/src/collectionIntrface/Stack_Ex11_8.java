package collectionIntrface;

import java.util.Stack;

public class Stack_Ex11_8 {

	public static void main(String[] args) {
		
		Stack a = new Stack<>();
		Stack b = new Stack<>();
		
		for (char i = 'A'; i <='Z'; i++) {
			a.push(i);
			
		}
		System.out.println(a);
		
	for (int i = a.size(); i > args.length ; i--) {
		b.push(a.pop());
	}
	System.out.println(b);
	
	for (int i = b.size(); i > args.length; i--) {
		b.pop();
	}
	System.out.println(b);
	}
}
