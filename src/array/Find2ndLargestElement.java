package array;

import java.util.Scanner;

public class Find2ndLargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		find2ndLargestEle1(arr, n);
		find2ndLargestEle2(arr, n);
	}

//	Naive Solution with 2 times traversal of the array
	static void find2ndLargestEle1(int[] arr, int n) {
		if (n < 2)
			System.out.println("Invalid Input");

		int index1 = 0;
		int index2 = -1;
		for (int i = 0; i < n; i++) {
			if (arr[index1] < arr[i]) {
				index1 = i;
			}
		}

		for (int i = 0; i < n; i++) {
			if (arr[index1] != arr[i]) {
				if (index2 == -1) {
					index2 = i;
				} else if (arr[index2] < arr[i]) {
					index2 = i;
				}
			}
		}
		if (index2 == -1)
			System.out.println("Don't have 2nd Largest Element");
		else
			System.out.println("2nd Largest Element: " + arr[index2]);
	}

//	Efficient Solution with 1 time traversal of the array
	static void find2ndLargestEle2(int[] arr, int n) {
		if (n < 2)
			System.out.println("Invalid Input");

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] != first && arr[i] > second) {
				second = arr[i];
			}
		}
		if (second == Integer.MIN_VALUE)
			System.out.println("Don't have 2nd Largest Element");
		else
			System.out.println("2nd Largest Element: " + second);
	}
}
