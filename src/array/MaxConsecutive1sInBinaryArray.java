package array;

import java.math.MathContext;
import java.util.Scanner;

public class MaxConsecutive1sInBinaryArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(count1(arr, n));
	}

//	Method-1 TC - O(n^2) SC - O(1)
	static int count1(int[] arr, int n) {
		int maxCount = 0;

		for (int i = 0; i < n; i++) {
			int count = 0;
			if (arr[i] != 0) {
				for (int j = i; j < n; j++) {
					if (arr[i] == arr[j]) {
						count++;
					} else {
						break;
					}
				}
				maxCount = Math.max(maxCount, count);
			}
		}
		return maxCount;
	}

//	Method-2 TC - O(n) SC - O(1)
	static int count2(int[] arr, int n) {
		int maxCount = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				count = 0;
			} else {
				count++;
				maxCount = Math.max(maxCount, count);
			}
		}

		return maxCount;
	}
}
