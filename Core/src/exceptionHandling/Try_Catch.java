package exceptionHandling;

public class Try_Catch {

	public static void main(String[] args) {
		
		try {
			String s =null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("Length is not proper");
		}finally {
			System.out.println("Thanks");
		}
		
	}
}
