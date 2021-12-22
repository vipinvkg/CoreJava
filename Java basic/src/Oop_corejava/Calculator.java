package Oop_corejava;

//to create a object
public class Calculator {

	
	public static void main(String[] args) {
Calculator calculator = new Calculator();
calculator.Substraction();
calculator.addition();
calculator.division();
calculator.multiply();
calculator.remainder();
	}

	public void addition() {
		int a = 5;
		int b = 5;
		int sum = a + b;
		System.out.println(sum);
	}

	public void Substraction() {
		int a = 5;
		int b = 5;
		int sub = a - b;
		System.out.println(sub);
	}

	public void multiply() {
		int a = 5;
		int b = 5;
		int mul = a * b;
		System.out.println(mul);
	}

	public void division() {
		int a = 5;
		int b = 5;
		int div = a / b;
		System.out.println(div);
	}
private void remainder() {
	int a = 5;
	int b = 5;
	int rem = a % b;
System.out.println(rem);
}
	
}
