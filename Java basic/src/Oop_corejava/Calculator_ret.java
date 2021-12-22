package Oop_corejava;

//Return type
public class Calculator_ret {

	public static void main(String[] args) {
		Calculator_ret calculate = new Calculator_ret();
		int sum = calculate.division(20, 5);
		System.out.println("This is sum --" + sum);
	}

	public int addition(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public int Substraction(int a, int b) {
		int sub = a - b;
		return sub;
	}

	public int multy(int a, int b) {
		int mul = a * b;
		return mul;
	}

	public int division(int a, int b) {
		int div = a / b;
		return div;
	}
}
