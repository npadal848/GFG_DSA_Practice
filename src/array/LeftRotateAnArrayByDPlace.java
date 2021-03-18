package array;

import java.util.Scanner;

public class LeftRotateAnArrayByDPlace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		leftRotateWithExtraSpace(arr, n, d);
	}

	static void leftRotateWithExtraSpace(int[] arr, int n, int d) {

		int[] temp = new int[d];
		int i;

		// Copy left element of array in temp array
		for (i = 0; i < d; i++) {
			temp[i] = arr[i];
		}

		// move array by d place
		for (int j = i; j < n; j++) {
			arr[j - d] = arr[j];
		}
		int start=n-d;
		//rotate array to left
		for (i = 0; i < d; i++) {
			arr[i+start] = temp[i];
		}
		print(arr);
	}

	static void print(int[] arr) {
		for (int ele : arr) {
			System.out.print(ele + ", ");
		}
		System.out.println();
	}
}
