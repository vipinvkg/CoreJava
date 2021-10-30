package Practise;

public class Exception_Classinsidetryclass {
public static void main(String[] args) {
 try{
	 String s = "vipin";
	 System.out.println(s.charAt(6));
 }
catch (StringIndexOutOfBoundsException e) {
 System.out.println("Invalid No.");
}
 try{
	double div = 15/0;
System.out.println(div);

}catch (Exception e) {
	System.out.println("Can not print");
}
}
}