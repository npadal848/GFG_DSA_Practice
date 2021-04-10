package two_pointer;

import java.util.Scanner;

public class MedianOfTwoSortedArray {

	public static void main(String[] args) {
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

		find(arr1, arr2, m, n);
	}

	static void find(int[] arr1, int[] arr2, int m, int n) {
		int[] arr3 = new int[m + n];
		int i = 0;
		int j = 0;
		int index = 0;
		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				arr3[index] = arr1[i];
				i++;
			} else if (arr1[i] > arr2[j]) {
				arr3[index] = arr2[j];
				j++;
			}
			index++;
		}

		while (i < m) {
			arr3[index] = arr1[i];
			i++;
			index++;
		}

		while (j < n) {
			arr3[index] = arr2[j];
			j++;
			index++;
		}

		int len = arr3.length;

		if (len % 2 == 0) {
			int mid = (len / 2) - 1;
			System.out.println((double) (arr3[mid] + arr3[mid + 1]) / 2);
		} else {
			System.out.println(arr3[len / 2]);
		}
	}
}
