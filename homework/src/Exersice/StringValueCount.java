package Exersice;

public class StringValueCount {
public static void main(String[] args) {
	String s = "vijay dinanath chouhan";
	char[] ch= s.toCharArray();
	char n = 'a';
	
	int count =0;	
	for (int i = 0; i < s.length(); i++) {
		if (ch[i]==n) {
			count++;
		}
		
	}
	System.out.println(count);
}
}
