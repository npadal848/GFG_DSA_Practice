package array;

import java.util.Scanner;

/*Majority element is an element that appears more than n/2 times in an array of size n. 
 * In this video, two methods to find majority element in an array are discussed.
 */
public class MajorityElementOfAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(find(arr, n));
		System.out.println(findMajorityEel(arr, n));
	}

//	Method-1 TC - O(n^2) SC - O(1)
	static int find(int[] arr, int n) {
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
				return i;
			}
		}
		return -1;
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
