package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSortUsingLomutoPartition {

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
			sort(arr, l, p - 1);
			sort(arr, p + 1, h);
		}
	}

	static int partition(int[] arr, int l, int h) {
		int i = l - 1;
		int pivot = arr[h];
		int temp = 0;

		for (int j = l; j < h; j++) {
			if (arr[j] < pivot) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		temp = arr[i + 1];
		arr[i + 1] = arr[h];
		arr[h] = temp;
		return i + 1;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
