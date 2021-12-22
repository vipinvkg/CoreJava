package Exersice;

public class Bufferclass {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("vijay");
	sb.append ("dinanath chouhan");
	
	System.out.println(sb.length());
	System.out.println(sb.capacity());
	System.out.println(sb.charAt(18));
	System.out.println(sb.indexOf("dinanath"));
	System.out.println(sb.replace(0, 5, "vipin"));
	System.out.println(sb.reverse());
}
}
