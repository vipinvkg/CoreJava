package Exercise_4;

public class AverageOddEven_14 {

	public static void main(String[] args) {

		int sumeven = 0;
		int sumodd = 0;
		int counteven = 0;
		int countodd = 0;

		for (int i = 1; i <=100; i++) {
			
			if (i % 2 ==0) {
				sumeven = sumeven+i;
				counteven++;
				
			} else {
				sumodd=sumodd+i;
				countodd++;
			}
		}
	System.out.println("Average of all even numbers between 1-100 is -- "+ sumeven/counteven);
	System.out.println("Average of all odd numbers between 1-100 is -- "+ sumodd/countodd);
	}
}
