package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindLengthOfLargestWithGivenSum {

	public static void main(String[] args) {
		int[] arr1 = { 6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7 };
		int sum1 = 0;

		int[] arr2 = { 5, 8, -4, -4, 9, -2, 2 };
		int sum2 = 0;

		int[] arr3 = { 3, 1, 0, 1, 8, 2, 3, 6 };
		int sum3 = 5;

		int[] arr4 = { 8, 3, 7 };
		int sum4 = 15;

		findLongestSubArray1(arr1, sum1);
		findLongestSubArray1(arr2, sum2);
		findLongestSubArray1(arr3, sum3);
		findLongestSubArray1(arr4, sum4);
		System.out.println();
		findLongestSubArray2(arr1, sum1);
		findLongestSubArray2(arr2, sum2);
		findLongestSubArray2(arr3, sum3);
		findLongestSubArray2(arr4, sum4);
	}

//	TC - O(n^2) and SC - O(1)
	static void findLongestSubArray1(int[] arr, int sum) {
		int n = arr.length;
		int maxLength = 0;
		int startIndex = 0;
		int endIndex = 0;

		for (int i = 0; i < n; i++) {
			int prefSum = 0;
			int currLength = 0;
			for (int j = i; j < n; j++) {
				prefSum += arr[j];
				currLength = (j - i) + 1;
				if (prefSum == sum && currLength > maxLength) {
					maxLength = currLength;
					startIndex = i;
					endIndex = j;
				}
			}
		}
		System.out.println(
				"Largest Subarray length is " + maxLength + " and found from Index " + startIndex + " to " + endIndex);
	}

//	TC - O(n) and SC - O(n)
	static void findLongestSubArray2(int[] arr, int sum) {
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		int maxLength = 0;
		int startIndex = 0;
		int endIndex = 0;
		int prefSum = 0;
		for (int i = 0; i < arr.length; i++) {
			prefSum += arr[i];

			if (prefSum == sum) {
				maxLength = (i - 0) + 1;
				startIndex = 0;
				endIndex = i;
			}
			List<Integer> list = new ArrayList<>();
			if (map.containsKey(prefSum - sum)) {
				list = map.get(prefSum - sum);
				for (int j = 0; j < list.size(); j++) {
					int currLength = (i - list.get(j));
					if (currLength > maxLength) {
						maxLength = currLength;
						startIndex = list.get(j) + 1;
						endIndex = i;
					}
				}
			}
			list.add(i);
			map.put(prefSum, list);
		}
		System.out.println(
				"Largest Subarray length is " + maxLength + " and found from Index " + startIndex + " to " + endIndex);
	}
}
