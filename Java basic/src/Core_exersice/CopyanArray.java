package Core_exersice;

public class CopyanArray {

	public static void main(String[] args) {
		char [] a = {'a','b','c','d','e','f','g','h'};
	char [] copyto = new char [10];
	System.arraycopy(a, 2, copyto, 0, 6);
	System.out.println(new String (copyto));
	
	
	
	}
}
