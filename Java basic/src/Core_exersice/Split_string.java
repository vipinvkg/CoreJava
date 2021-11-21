package Core_exersice;

public class Split_string {

	public static void main(String[] args) {
		String s= "vijy dinanath chouhan";
		String str[]=s.split(" ");
		for (String string : str) {
			System.out.println(string);
		}
	}
}
