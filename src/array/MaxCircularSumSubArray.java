package array;

import java.util.Scanner;

public class MaxCircularSumSubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(maxSum1(arr, n));
		System.out.println(findCircularMaxSum(arr, n));
	}

//	Method-1 TC - O(n^2) SC - O(1)
	static int maxSum1(int[] arr, int n) {
		int res = arr[0];
		for (int i = 0; i < n; i++) {
			int sum = 0;
			int currMaxSum = arr[i];
			for (int j = 0; j < n; j++) {
				int index = (i + j) % n;
				sum += arr[index];
				currMaxSum = Math.max(sum, currMaxSum);
			}

			res = Math.max(res, currMaxSum);
		}
		return res;
	}

	/*
	 * find array sum and invert the array to find min sub array sum by invoking
	 * kadaneSum() method. It returns max sum of sub array of inverted array which is min sum of 
	 * sub array of original array which have
	 * to subtract from original array sum to get max sum in circular sub array
	 * 
	 * As we have inverted the array, will get +ve value which is nothing but a -ve sum value
	 * so arraySum-(-invertedSubArraySum) 
	 * => maxSumOfCircularSubArray = arraySum+invertedSubArraySum
	 */
	
//	Method-2 TC - O(n) SC - O(1)
	static int findCircularMaxSum(int[] arr, int n) {
		int noramlMaxSum = kadaneSum(arr, n);
		if (noramlMaxSum < 0) {
			return noramlMaxSum;
		}

		int arraySum = 0;
		for (int i = 0; i < n; i++) {
			arraySum += arr[i];
			arr[i] = -arr[i];
		}
		int circularMaxSum = arraySum + kadaneSum(arr, n);

		return Math.max(noramlMaxSum, circularMaxSum);
	}
	
	static int kadaneSum(int[] arr, int n) {
		int res = arr[0];
		int maxEnding = arr[0];
		for (int i = 1; i < n; i++) {
			maxEnding = Math.max(maxEnding + arr[i], arr[i]);
			res = Math.max(maxEnding, res);
		}
		return res;
	}

	
}
