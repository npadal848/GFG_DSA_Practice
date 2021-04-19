package sorting;

import java.util.Scanner;

public class IntersectionOfTwoSortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int m = 8;
//		int n = 5;
//		int[] arr1 = { 3, 5, 10, 10, 10, 15, 15, 20 };
//		int[] arr2 = { 5, 10, 10, 15, 30 };

//		int m = 5;
//		int n = 7;
//		int[] arr1 = { 1, 1, 3, 3, 3 };
//		int[] arr2 = { 1, 1, 1, 1, 3, 5, 7 };

		int m = 5;
		int n = 4;
		int[] arr1 = { 2, 20, 20, 40, 60 };
		int[] arr2 = { 10, 20, 20, 20 };
		printCommonElement1(arr1, arr2, m, n);
		System.out.println();
		printCommonElement2(arr1, arr2, m, n);
		sc.close();
	}

//  TC - O(m*n) SC - O(1)
	private static void printCommonElement1(int[] arr1, int[] arr2, int m, int n) {
		for (int i = 0; i < m; i++) {
			if (i > 0 && arr1[i] == arr1[i - 1])
				continue;
			for (int j = 0; j < n; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(arr1[i] + " ");
					break;
				}
			}
		}
	}

//  TC - O(m*n) SC - O(1)
	private static void printCommonElement2(int[] arr1, int[] arr2, int m, int n) {
		int i = 0;
		int j = 0;

		while (i < m && j < n) {
			if (i > 0 && arr1[i] == arr1[i - 1]) {
				i++;
				continue;
			}

			if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr1[i] > arr2[j]) {
				j++;
			} else {
				System.out.print(arr1[i] + " ");
				i++;
				j++;
			}
		}
	}
}
