package array;

import java.util.Scanner;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		System.out.println(Math.ceil(11/2));
		System.out.println(Math.floor(4.5));
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] arr1 = new int[m];
		int[] arr2 = new int[n];
		for (int i = 0; i < m; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}

//		mergeWithExtraSpace(arr1, arr2, m, n);
		mergeWithoutExtraSpace(arr1, arr2, m, n);
	}

	static void mergeWithExtraSpace(int[] arr1, int[] arr2, int m, int n) {
		int[] arr3 = new int[n + m];

		int i = 0;
		int j = 0;
		int index = 0;
		while (i < m && j < n) {
			if (arr1[i] < arr2[j]) {
				arr3[index] = arr1[i];
				i++;
			} else {
				arr3[index] = arr2[j];
				j++;
			}
			index++;
		}

		while (i < m) {
			arr3[index] = arr1[i];
			index++;
			i++;
		}
		while (j < n) {
			arr3[index] = arr2[j];
			index++;
			j++;
		}

		print(arr3);
	}

	/*
	 * I/P: 
	 * 	5 
	 * 	3 
	 * 	1 4 7 8 10
	 *  2 3 9
	 * 
	 * O/P: 
	 * 	1 2 3 4 7 
	 * 	8 9 10
	 */
	static void mergeWithoutExtraSpace(int[] arr1, int[] arr2, int m, int n) {
		int i = 0;
		int j = 0;
		int temp = 0;
		while (i < m && j < n) {
			if (arr1[i] > arr2[j]) {
				temp = arr1[i];
				arr1[i] = arr2[j];
				arr2[j] = temp;

				while (j < n - 1) {
					if (arr2[j] > arr2[j + 1]) {
						temp = arr2[j];
						arr2[j] = arr2[j + 1];
						arr2[j + 1] = temp;
						j++;
					} else
						break;
				}
				j = 0;
			}
			i++;
		}
		printTwoArray(arr1, arr2);
	}

	static void printTwoArray(int[] arr1, int[] arr2) {
		for (int ele : arr1) {
			System.out.print(ele + " ");
		}
		System.out.println();
		for (int ele : arr2) {
			System.out.print(ele + " ");
		}
	}

	static void print(int[] arr) {
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
	}
}
