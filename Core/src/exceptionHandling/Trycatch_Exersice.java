package exceptionHandling;

public class Trycatch_Exersice {

	public static void main(String[] args) {

		
		try{double d = 15/0;
		System.out.println(d);
		}catch (Exception e) {
			System.out.println("not wright");
			System.exit(0);
		}
		finally {
			System.out.println("thanks");
		}
	}
		
	}


		
	
