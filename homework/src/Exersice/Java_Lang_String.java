package Exersice;

public class Java_Lang_String {

	public static void main(String[] args) {
		
	
	String name = "vijay dinanath chouhan";
	
	System.out.println(name.length());
	System.out.println(name.charAt(8));
	System.out.println(name.indexOf("dina"));
	System.out.println(name.lastIndexOf('a'));
	System.out.println(name.replace('a', 'p'));
	System.out.println(name.replaceAll("cho", "mno"));
	System.out.println(name.toLowerCase());
	System.out.println(name.toUpperCase());
	System.out.println(name.startsWith("vijay"));
	System.out.println(name.endsWith("kumar"));
	System.out.println(name.substring(4));
	
	}
}
