package com.raystec.collection;

import java.util.List;
import java.util.Stack;

public class Stack_List_Method {

	public static void main(String[] args) {
		
		Stack l = new Stack<>();
		l.push(12);
		l.push('n');
		l.push("vipin");
		
		
		System.out.println(l.peek());//it prints top elements but doesn't remove from stack
		System.out.println(l);
System.out.println(l.pop());//it print top element and removes element from stack.
		System.out.println(l);
	}
}
