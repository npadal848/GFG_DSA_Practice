package hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithEqual0And1 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 0, 1, 1, 1, 0, 0 };
		int[] arr2 = { 1, 1, 1, 1 };
		int[] arr3 = { 0, 0, 1, 1, 1, 1, 1, 0 };
		int[] arr4 = { 0, 0, 1, 0, 1, 1 };

		System.out.println(findSubArray1(arr1));
		System.out.println(findSubArray1(arr2));
		System.out.println(findSubArray1(arr3));
		System.out.println(findSubArray1(arr4));
		System.out.println();
		System.out.println(findSubArray2(arr1));
		System.out.println(findSubArray2(arr2));
		System.out.println(findSubArray2(arr3));
		System.out.println(findSubArray2(arr4));
	}

//	TC - O(n^2) and O(1)
	static int findSubArray1(int[] arr) {
		int n = arr.length;
		int maxLength = 0;

		for (int i = 0; i < n; i++) {
			int count0 = 0;
			int count1 = 0;
			for (int j = i; j < n; j++) {
				if (arr[j] == 0)
					count0++;
				else
					count1++;
				if (count0 == count1)
					maxLength = Math.max(maxLength, count0 + count1);
			}
		}

		return maxLength;
	}

//	TC - Theta(n) and O(n)
	static int findSubArray2(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			if (arr[i] == 0)
				arr[i] = -1;
		}

		return findLongestSubArrayWithZeroSum(arr, n);
	}

	static int findLongestSubArrayWithZeroSum(int[] arr, int n) {
		Map<Integer, Integer> map = new HashMap<>();
		int maxLength = 0;
		int preffSum = 0;

		for (int i = 0; i < n; i++) {
			preffSum += arr[i];
			if (preffSum == 0)
				maxLength = Math.max(maxLength, i + 1);
			if (map.containsKey(preffSum))
				maxLength = Math.max(maxLength, i - map.get(preffSum));
			else
				map.put(preffSum, i);

		}
		return maxLength;
	}
}
