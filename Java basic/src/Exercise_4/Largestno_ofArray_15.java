package Exercise_4;

public class Largestno_ofArray_15 {
	public static void main(String[] args) {
		int[] a = { 22, 4, 61, 99, 10 };
		int largest = a[0];

		for (int num : a) {
			if (largest < num)
				largest = num;
		}
		System.out.println("Largest element = " + largest);
	}
}
