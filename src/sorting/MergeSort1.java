package sorting;

import java.util.Arrays;

public class MergeSort1 {

	public static void main(String[] args) {
		int[] a = { 1, 3, 5 };
		int[] b = { 2, 4, 6, 7, 8, 9, 10 };

//		int[] a = { 10, 20, 35 };
//		int[] b = { 5, 6, 6, 15 };

		int[] arr = merge(a, b);
		Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
	}

	static int[] merge(int[] a, int[] b) {
		int m = a.length;
		int n = b.length;
		int[] arr = new int[m + n];
		int index = 0;
		int i = 0;
		int j = 0;

		while (i < m && j < n) {
			if (a[i] <= b[j]) {
				arr[index] = a[i];
				i++;
			} else {
				arr[index] = b[j];
				j++;
			}
			index++;
		}

		while (i < m) {
			arr[index] = a[i];
			i++;
			index++;
		}

		while (j < n) {
			arr[index] = b[j];
			j++;
			index++;
		}

		return arr;
	}
}
