package Practise;

public class Exceptionconditons_tryinsidetry {

	public static void main(String[] args) {

		try {double d = 15/2;
		System.out.println(d);
		}catch(Exception e){
			System.out.println("Can't divide");
			System.exit(0);
		}finally {
		System.out.println("final");
		
	}
	}
}