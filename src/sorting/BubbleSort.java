package sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		print(bubuleSort(arr, n));
	}

	static int[] bubuleSort(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			boolean flag = false;
			for (int j = 0; j < (n - i) - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					flag = true;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			if (!flag)
				break;
		}
		return arr;
	}

	static void print(int[] arr) {
		for (int num : arr)
			System.out.print(num + " ");
		System.out.println();
	}
}
