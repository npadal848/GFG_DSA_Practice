package array;

import java.util.Scanner;

public class MaximumDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(maxDifference(arr, n));
	}

	// Method-1 TC-O(n^2) SC-O(1)
	static int maxDifference(int[] arr, int n) {
		int res = Integer.MIN_VALUE;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				res = Math.max(arr[j] - arr[i], res);
			}
		}
		return res;
	}
}
