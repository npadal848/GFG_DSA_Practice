package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindLengthOfLargestWithZeroSum {

	public static void main(String[] args) {
		int[] arr1 = { 6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7 };
		int n1 = arr1.length;

		int[] arr2 = { 6, 3, -1, -3, 4, -2, 2 };
		int n2 = arr2.length;

		find1(arr1, n1);
		find1(arr2, n2);
		
		System.out.println();
		
		find2(arr1, n1);
		find2(arr2, n2);
	}

//	TC - O(n^2) and SC - O(1)
	static void find1(int[] arr, int n) {
		int maxLength = 0;
		int startIndex = 0;
		int endIndex = 0;
		for (int i = 0; i < n; i++) {
			int preffSum = 0;
			int currLength = 0;
			for (int j = i; j < n; j++) {
				preffSum += arr[j];
				currLength = (j - i) + 1;
				if (preffSum == 0 && currLength > maxLength) {
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
	static void find2(int[] arr, int n) {
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		int currLength = 0;
		int maxLength = 0;
		int startIndex = 0;
		int endIndex = 0;
		int prefSum = 0;
		for (int i = 0; i < n; i++) {
			prefSum += arr[i];
			currLength = (i - 0) + 1;
			if (prefSum == 0 && currLength > maxLength) {
				maxLength = currLength;
				startIndex = 0;
				endIndex = i;
			}

			List<Integer> list = new ArrayList<>();
			if (map.containsKey(prefSum)) {
				list = map.get(prefSum);
				for (int j = 0; j < list.size(); j++) {
					currLength = (i - list.get(j)) + 1;
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
