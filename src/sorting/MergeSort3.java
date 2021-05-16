package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		mergeSort(arr, 0, n - 1);
		Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
		sc.close();
	}

	static void mergeSort(int[] arr, int low, int high) {
		if (low < high) {
			int mid = low + (high - low) / 2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}

	static void merge(int[] arr, int low, int mid, int high) {

		int n1 = mid - low + 1;
		int n2 = high - mid;

		int[] left = new int[n1];
		int[] right = new int[n2];

		for (int i = 0; i < n1; i++) {
			left[i] = arr[low + i];
		}

		for (int j = 0; j < n2; j++) {
			right[j] = arr[mid + 1 + j];
		}

		int index = low;
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
	}
}
