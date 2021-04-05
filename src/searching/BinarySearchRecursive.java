package searching;

import java.util.Scanner;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(binarySearch(arr, 0, n - 1, k));
	}

	static int binarySearch(int[] arr, int start, int end, int k) {

		if (start > end)
			return -1;

		int mid = (start + end) / 2;

		if (arr[mid] == k)
			return mid;
		else if (k > arr[mid])
			return binarySearch(arr, mid + 1, end, k);
		else
			return binarySearch(arr, start, mid - 1, k);
	}

}
