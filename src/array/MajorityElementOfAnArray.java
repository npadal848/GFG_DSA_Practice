package array;

import java.util.Arrays;
import java.util.HashMap;

/*Majority element is an element that appears more than n/2 times in an array of size n. 
 * In this video, two methods to find majority element in an array are discussed.
 */
public class MajorityElementOfAnArray {

	public static void main(String[] args) {
		int[] arr = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };
//		int[] arr = {3, 3, 4, 2, 4, 4, 2, 4};
		int n = arr.length;

		System.out.println(find1(arr, n));
		System.out.println(find2(arr, n));
		System.out.println(find4(arr, n));
		System.out.println(find3(arr, n));
		System.out.println(findMajorityEel(arr, n));
	}

//	Method-1 TC - O(n^2) SC - O(1)
	static int find1(int[] arr, int n) {
		int times = n / 2;
		int i;
		for (i = 0; i < n; i++) {
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > times) {
				return arr[i];
			}
		}
		return -1;
	}

//	TC O(n) and SC - O(n)
	static int find2(int[] arr, int n) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			if (map.containsKey(arr[i])) {
				int count = map.get(arr[i]) + 1;
				if (count > (n / 2)) {
					return arr[i];
				} else {
					map.put(arr[i], count);
				}
			} else {
				map.put(arr[i], 1);
			}
		}
		return -1;
	}

//	TC O(n log n) and SC - O(1)
	static int find3(int[] arr, int n) {
		Arrays.sort(arr);
		int count = 1;
		int maj = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] == maj) {
				count++;
			} else {
				maj = arr[i];
				count = 1;
			}
			if (count > (n / 2))
				return arr[i];
		}
		return -1;
	}

//	TC O(n) and SC - O(1)
	static int find4(int[] arr, int n) {
		int cand = getCandidate(arr, n);

		if (isMajorityElement(arr, n, cand))
			return cand;
		return -1;
	}

	static int getCandidate(int[] arr, int n) {
		int count = 1;
		int majIndex = 0;

		for (int i = 1; i < n; i++) {
			if (arr[majIndex] == arr[i])
				count++;
			else
				count--;
			if (count == 0) {
				majIndex = i;
				count = 1;
			}
		}
		return arr[majIndex];
	}

	static boolean isMajorityElement(int[] arr, int n, int cand) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == cand) {
				count++;
			}
		}
		if (count > (n / 2))
			return true;
		return false;
	}
	
//	Method-2 TC - O(n) SC - O(1)
	static int findMajorityEel(int[] arr, int n) {
		int times = n / 2;
		int count = 1;
		int res = 0;
		for (int i = 1; i < n; i++) {
			if (arr[res] == arr[i]) {
				count++;
			} else {
				count--;
			}

			if (count == 0) {
				count = 1;
				res = i;
			}
		}

		count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[res] == arr[i]) {
				count++;
			}
		}

		if (count > times) {
			return res;
		}
		return -1;
	}
}
