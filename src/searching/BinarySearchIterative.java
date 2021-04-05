package searching;

import java.util.Scanner;

public class BinarySearchIterative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(binarySearchByIterative2(arr, n, k));
	}

	static int binarySearchByIterative1(int[] arr, int n, int k) {

		for (int i = 0; i < n; i++) {
			if (arr[i] == k)
				return i;
		}
		return -1;
	}

	static int binarySearchByIterative2(int[] arr, int n, int k) {

		int start = 0;
		int end = n - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (arr[mid] == k)
				return mid;
			if (k > arr[mid])
				start = mid + 1;
			if (k < arr[mid])
				end = mid - 1;
		}

		return -1;
	}
}
