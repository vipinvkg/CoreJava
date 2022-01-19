package jDK8;

import java.util.Arrays;

public class Test_ParellelSort {

	public static void main(String[] args) {
		int[] arr = {3,5,2,4,1,6,8,7};
		Arrays.parallelSort(arr);
		for (int i : arr) {
		System.out.println(i);	
		}
		
	}
}
