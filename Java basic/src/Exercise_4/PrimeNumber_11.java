package Exercise_4;

public class PrimeNumber_11 {
	public static void main(String[] args) {
		int primeN = 11;
		int temp = 0;
		for (int i = 2; i <= primeN - 1; i++) {
			if (primeN % i == 0) {
				temp = temp + 1;
			}

		}
		if (temp == 0) {
			System.out.println(primeN + ": is a prime number");
		} else {
			System.out.println(primeN + ": is not a prime number");

		}

	}
}
