package array.slidingwindow;

import java.util.Scanner;

public class MaxSumOfKConsecutiveElem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(maxSum1(arr, n, k));
		System.out.println(maxSum2(arr, n, k));
	}

//	Method-1 TC - O(n^2) SC - O(1)
	static int maxSum1(int[] arr, int n, int k) {
		int maxSum = 0;

		for (int i = 0; i < n - k + 1; i++) {
			int sum = 0;
			for (int j = i; j < k + i; j++) {
				sum += arr[j];
			}
			maxSum = Math.max(maxSum, sum);
		}

		return maxSum;
	}

//	Method-2 TC - O(n) SC - O(1)
	static int maxSum2(int[] arr, int n, int k) {
		int maxSum = 0;
		int currSum = 0;

//		Find current sum of first Kth window element
		for (int i = 0; i < k; i++) {
			currSum += arr[i];
		}

		maxSum = currSum;

		/*
		 * Slide Kth element window by adding one element and subtracting previous
		 * window's first element and find max sum of slide window sum sub array
		 */
		for (int i = k; i < n; i++) {
			currSum += (arr[i] - arr[i - k]);
			maxSum = Math.max(maxSum, currSum);
		}

		return maxSum;
	}
}
