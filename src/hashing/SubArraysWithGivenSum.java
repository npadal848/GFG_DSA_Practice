package hashing;

import java.util.HashSet;
import java.util.Set;

public class SubArraysWithGivenSum {

	public static void main(String[] args) {
		int[] arr1 = { 5, 8, 6, 13, 3, -1 };
		int sum1 = 22;

		int[] arr2 = { 5, 2, 8, 10, -5, -8, 6 };
		int sum2 = 3;

		int[] arr3 = { 3, 2, 5, 6 };
		int sum3 = 10;

		int[] arr4 = { 6, 5, 9, -10, 8, 3 };
		int sum4 = 0;

		System.out.println(checkGivenSumSubArrays1(arr1, sum1));
		System.out.println(checkGivenSumSubArrays1(arr2, sum2));
		System.out.println(checkGivenSumSubArrays1(arr3, sum3));
		System.out.println(checkGivenSumSubArrays1(arr4, sum4));

		System.out.println();

		System.out.println(checkGivenSumSubArrays2(arr1, sum1));
		System.out.println(checkGivenSumSubArrays2(arr2, sum2));
		System.out.println(checkGivenSumSubArrays2(arr3, sum3));
		System.out.println(checkGivenSumSubArrays1(arr4, sum4));
	}

//	TC - O(n^2) and SC - O(1)
	static boolean checkGivenSumSubArrays1(int[] arr, int sum) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int currSum = 0;
			for (int j = i; j < n; j++) {
				currSum += arr[j];
				if (currSum == sum)
					return true;
			}
		}
		return false;
	}

//	TC - O(n) and SC - O(n)
	static boolean checkGivenSumSubArrays2(int[] arr, int sum) {
		Set<Integer> sumSet = new HashSet<Integer>();
		int prefixSum = 0;
		for (int ele : arr) {
			prefixSum += ele;
			if (prefixSum == sum)
				return true;
			if (sumSet.contains(prefixSum - sum))
				return true;
			sumSet.add(prefixSum);
		}
		return false;
	}
}
