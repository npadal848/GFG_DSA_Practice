package hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindPairWithGivenSumUnsortedArray {

	public static void main(String[] args) {
		int[] arr1 = { 8, 3, 9, 4 };
		int sum1 = 13;

		int[] arr2 = { 2, 1, 6, 3 };
		int sum2 = 6;

		int[] arr3 = { 5, 8, -3, 6 };
		int sum3 = 3;

//		total pair formula = (n*(n-1))/2

		System.out.println(checkPairSum1(arr1, sum1));
		System.out.println(checkPairSum1(arr2, sum2));
		System.out.println(checkPairSum1(arr3, sum3));

		System.out.println(checkPairSum2(arr1, sum1));
		System.out.println(checkPairSum2(arr2, sum2));
		System.out.println(checkPairSum2(arr3, sum3));

		System.out.println(checkPairSum3(arr1, sum1));
		System.out.println(checkPairSum3(arr2, sum2));
		System.out.println(checkPairSum3(arr3, sum3));
	}

//	TC - O(n^2) and SC - O(1)
	static boolean checkPairSum1(int[] arr, int sum) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((arr[i] + arr[j]) == sum) {
					return true;
				}
			}
		}
		return false;
	}

//	TC - O(n log n) and SC - O(1)	
	static boolean checkPairSum2(int[] arr, int sum) {
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int currSum = arr[start] + arr[end];
			if (currSum == sum)
				return true;
			else if (currSum > sum)
				end--;
			else
				start++;
		}
		return false;
	}

//	TC - O(n) and SC - O(1)
	static boolean checkPairSum3(int[] arr, int sum) {
		Set<Integer> set = new HashSet<>();
		for (Integer ele : arr) {
			if (set.contains(sum - ele))
				return true;
			else
				set.add(ele);
		}
		return false;
	}
}
