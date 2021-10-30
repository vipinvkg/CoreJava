package collectionIntrface;

import java.util.List;
import java.util.Stack;

public class CollectionStack {

	public static void main(String[] args) {
		Stack s = new Stack<>();
		s.push(10);
		s.push("vipin");
		s.push('c');
		s.push(2.5);
		s.push(50);
		// s.pop();
		// s.pop();
		s.pop();
		System.out.println(s);
		// System.out.println(s.peek());

	}

}
