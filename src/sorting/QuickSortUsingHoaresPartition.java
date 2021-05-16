package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSortUsingHoaresPartition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		sort(arr, 0, n - 1);
		Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
		sc.close();
	}

	static void sort(int[] arr, int l, int h) {
		if (l < h) {
			int p = partition(arr, l, h);
			sort(arr, l, p);
			sort(arr, p + 1, h);
		}
	}

	static int partition(int[] arr, int l, int h) {
		int i = l - 1;
		int j = h + 1;
		int pivot = arr[l];

		while (true) {
			do {
				i++;
			} while (arr[i] < pivot);
			do {
				j--;
			} while (arr[j] > pivot);

			if (i >= j)
				return i;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}
