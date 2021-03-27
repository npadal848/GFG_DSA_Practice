package array;

import java.util.Scanner;

public class MaxLengthEvenOddSubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(maxLength1(a, n));
		System.out.println(maxLength2(a, n));
	}

//	Method-1 TC - O(n^2) SC - O(1)
	static int maxLength1(int[] arr, int n) {
		int res = 1;

		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (((arr[j - 1] % 2 == 0) && (arr[j] % 2 != 0)) || ((arr[j - 1] % 2 != 0) && (arr[j] % 2 == 0))) {
					count++;
				} else {
					break;
				}
			}
			res = Math.max(res, count);
		}
		return res;
	}

//	Method-2 TC - O(n) SC - O(1)
	static int maxLength2(int[] arr, int n) {
		int res = 1;
		int count = 1;
		for (int i = 1; i < n; i++) {
			if (((arr[i - 1] % 2 == 0) && (arr[i] % 2 != 0)) || ((arr[i - 1] % 2 != 0) && (arr[i] % 2 == 0))) {
				count++;
				res = Math.max(count, res);
			} else {
				count = 1;
			}
		}
		return res;
	}
}
