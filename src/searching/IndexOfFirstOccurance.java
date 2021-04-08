package searching;

import java.util.Scanner;

public class IndexOfFirstOccurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(search(arr, 0, n - 1, k));
	}

	static int search(int[] arr, int start, int end, int k) {
		if (start > end) {
			return -1;
		}

		int mid = (start + end) / 2;

		if (k == arr[mid]) {
			if (mid == 0 || arr[mid - 1] != k)
				return mid;
			else
				return search(arr, start, mid - 1, k);
		} else if (k < arr[mid])
			return search(arr, start, mid - 1, k);
		else
			return search(arr, mid + 1, end, k);
	}
}
