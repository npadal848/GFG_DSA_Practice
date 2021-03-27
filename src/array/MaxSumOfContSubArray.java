package array;

import java.util.Scanner;

public class MaxSumOfContSubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(maxSum1(arr, n));
	}

//	Method-1 TC - O(n^2) SC - O(1)
	static int maxSum1(int[] arr, int n) {
		int maxSum = arr[0];

		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum += arr[j];
				maxSum = Math.max(maxSum, sum);
			}
		}
		return maxSum;
	}

//	Method-2 TC - O(n) SC - O(1)
	static int maxSum2(int[] arr, int n) {
		int maxSum = arr[0];
		int maxEnding = arr[0];
		for (int i = 1; i < n; i++) {
			maxEnding = Math.max(maxEnding + arr[i], arr[i]);
			maxSum = Math.max(maxEnding, maxSum);
		}
		return maxSum;
	}
}
