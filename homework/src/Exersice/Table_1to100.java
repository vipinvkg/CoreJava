package Exersice;

public class Table_1to100 {

	public static void main(String[] args) {
		int a = 9;
		int total;

		for (int i = 0; i <= a; i++) {
			for (int j = 1; j <= 100; j=j+10) {

				total = i + j;

				System.out.print(total + " ");
			}
			System.out.println();
		}
	}
}
