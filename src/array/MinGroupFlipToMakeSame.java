package array;

import java.util.Scanner;

/*
 * Given a binary array, we need to find the minimum of number of group flips to make all array 
 * elements same.  In a group flip, we can flip any set of consecutive 1s or 0s.
 */
public class MinGroupFlipToMakeSame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		minFlip(arr, n);
	}

	static void minFlip(int[] arr, int n) {

		for (int i = 1; i < n; i++) {
			if (arr[i] != arr[i - 1]) {
				if (arr[i] != arr[0]) {
					System.out.print("From " + i);
				} else {
					System.out.print(" to " + (i - 1));
					System.out.println();
				}
			}
		}

		if (arr[n - 1] != arr[0]) {
			System.out.print(" to " + (n - 1));
		}
	}
}
