package Exercise_4;

public class Integers_greatertthan100_7 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 100; i <= 200; i++) {

			if (i % 7 == 0) {

				System.out.print(i + " ");
				sum = sum + i;
			}

		}
		System.out.println();
		System.out.println();
		System.out.println("sum of two numbers between 100 to 200 & divisible by 7 is...." + sum);
	}

}
