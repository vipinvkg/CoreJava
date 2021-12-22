package Core_exersice;

public class Parse_String {

	public static void main(String[] args) {
		String s ="321";
		String s1="223";
		int a = Integer.parseInt(s);
		int b = Integer.parseInt(s1);
		
		long c = Long.parseLong(s);
		short d = Short.parseShort(s1);
		System.out.println(d+c);
	}
}
