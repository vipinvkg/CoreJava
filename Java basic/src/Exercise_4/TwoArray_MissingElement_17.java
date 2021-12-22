package Exercise_4;

public class TwoArray_MissingElement_17 {

	public static void main(String[] args) {
		int sum = 0;
		int sum1 =0;
		
		int a[] = {10,20,30,40,50,60,70,80};
		int b[] = {10,20,30,40,50,60,70};
		for (int i = 0; i <=a.length-1; i++) {
			sum = sum +a [i];
		}
		for (int j = 0; j <=b.length-1; j++) {
			sum1 = sum1 + b[j];
		}
	int s = sum-sum1;
	System.out.println(s);
	}
}
