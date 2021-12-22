package Exersice;

public class StringValueCount_2nd {
public static void main(String[] args) {
	String s = "vijay dinanath chouhan";
	char n = 'a';
	
	int count = 0;
	
	for (int i = 0; i <s.length(); i++) {
		if (s.charAt(i)==n) {
			count++;
		}
	
}
System.out.println(count);
}
}
