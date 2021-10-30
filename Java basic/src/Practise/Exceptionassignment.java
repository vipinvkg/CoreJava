package Practise;

public class Exceptionassignment {
public static void main(String[] args) {
	try{
	String s = "vipin";
	System.out.println(s.length());
	System.out.println(s.charAt(6));
	System.out.println(s);
}
catch (StringIndexOutOfBoundsException e) {
	System.out.println("No. not found");
}	
	catch (NullPointerException e) {
	System.out.println("Invalid Name");
	}

finally {
	System.out.println("I will be there");
}

}

}
