package Oop_corejava;

public class Test_Cal_ret {

	public static void main(String[] args) {
		Test_Cal_ret addition = new Test_Cal_ret();
		int sum = addition.addition(15, 5);
		System.out.println(sum);

		Test_Cal_ret subs = new Test_Cal_ret();
		int sub = subs.substract(20, 10);
		System.out.println(sub);
		
		Test_Cal_ret multi = new Test_Cal_ret();
		int mul = multi.multiply(10,5);
		System.out.println(mul);
	}

	public int addition(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public int substract(int a, int b) {
		int sub = a - b;
		return sub;

	}
public int multiply(int a, int b) {
	int mul = a * b;
	return mul;

}
}
