package Exercise_4;
public class PrimeNumber_11 {
public static void main(String[] args) {
	int primeN = 10;
for (int i = 2; i <primeN; i++) {
	if (primeN%i ==0) {
		System.out.println(primeN + " is not a prime number");
		break;
}

}
System.out.println(primeN + " is a prime number");
}
}
