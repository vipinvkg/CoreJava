package Exersice;

public class Triiii {
public static void main(String[] args) {

	int primeN= 9;
 int Temp =0;
	
	for (int i = 2; i < primeN; i++) {
		
		if (primeN%i==0) {
			Temp = Temp + 1;
		}
	}
		if (Temp==0) {
			System.out.print("is a prime no.");
		} else {
System.out.print("is not a prime no.");
		}
		}
	
	}
	


