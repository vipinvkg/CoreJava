package Practise;

public class Exceptionconditons_tryinsidetry {

	public static void main(String[] args) {
    try{
		try {
	double div = 15/0;
	System.out.println(div);
} catch (ArithmeticException e) {

	System.out.println("Invalid No.");
}		
    }catch (Exception e) {
			e.printStackTrace();
		}
    }
}
