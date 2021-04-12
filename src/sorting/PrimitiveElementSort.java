package sorting;

import java.util.Arrays;

public class PrimitiveElementSort {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 0, 3, 4, 5 };
		
		Arrays.sort(arr, 0, 3);
		print(arr);
		
		Arrays.sort(arr);
		print(arr);
		
	}

	static void print(int[] arr) {
		for (int num : arr)
			System.out.print(num+" ");
		System.out.println();
	}
}
