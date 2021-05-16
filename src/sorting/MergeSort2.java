package sorting;

import java.util.Arrays;

public class MergeSort2 {

	public static void main(String[] args) {
		int[] a = { 5, 10, 30, 7, 15 };
		int n = a.length;
		int[] arr = merge(a, 0, n / 2, n - 1);
		Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
	}

	static int[] merge(int[] arr, int start, int mid, int end) {

		int n1 = mid - start + 1;
		int n2 = end - mid;

		int[] left = new int[n1];
		int[] right = new int[n2];

		for (int i = 0; i < n1; i++) {
			left[i] = arr[start + i];
		}

		for (int j = 0; j < n2; j++) {
			right[j] = arr[mid+1 + j];
		}

		int index = start;
		int i = 0;
		int j = 0;

		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				arr[index] = left[i];
				i++;
			} else {
				arr[index] = right[j];
				j++;
			}
			index++;
		}

		while (i < n1) {
			arr[index] = left[i];
			i++;
			index++;
		}

		while (j < n2) {
			arr[index] = right[j];
			j++;
			index++;
		}

		return arr;
	}
}
