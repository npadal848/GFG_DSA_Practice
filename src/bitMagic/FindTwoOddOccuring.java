package bitMagic;

import java.util.Scanner;

/*
 * 1. Brute force
 * 2. optimized
 */
public class FindTwoOddOccuring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		find1(arr, n);
		find2(arr, n);
	}

	private static void find1(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}

	private static void find2(int[] arr, int n) {
		int res1 = 0;
		int res2 = 0;
		int xor = 0;
		for (int i = 0; i < n; i++) {
			xor = xor ^ arr[i];
		}

//		res1 = xor & ~(xor - 1);
//		res2 = xor & (xor - 1);
		int sn = xor & ~(xor - 1);

		for (int i = 0; i < n; i++) {
			if ((arr[i] & sn) != 0) {
				res1 = res1 ^ arr[i];
			} else {
				res2 = res2 ^ arr[i];
			}
		}
		System.out.print(res1 + " " + res2);
	}
}
