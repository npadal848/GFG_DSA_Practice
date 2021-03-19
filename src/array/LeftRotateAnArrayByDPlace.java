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

//		leftRotateWithExtraSpace(arr, n, d);
//		rotate(arr, n, d);
		
		leftRotateBetterSol(arr, n, d);
	}

	/*
	 * Method-1 TC- Theta(n) SP-Theta(d)
	 */
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
		int start = n - d;
		// rotate array to left
		for (i = 0; i < d; i++) {
			arr[i + start] = temp[i];
		}
		print(arr);
	}

	/*
	 * Method-2 TC- Theta(nd) SP-Theta(1)
	 */
	static void rotate(int[] arr, int n, int d) {
		for (int i = 0; i < d; i++) {
			leftRotate(arr, n);
		}

		print(arr);
	}

	static void leftRotate(int[] arr, int n) {

		int temp = arr[0];

		for (int i = 1; i < n; i++) {
			arr[i - 1] = arr[i];
		}
		arr[n - 1] = temp;
	}

	static void print(int[] arr) {
		for (int ele : arr) {
			System.out.print(ele + ", ");
		}
		System.out.println();
	}

	/*
	 * Method-3 TC- Theta(n) SP-Theta(1)
	 */
	static void leftRotateBetterSol(int[] arr, int n, int d) {
		reverse(arr, 0, d - 1);
		reverse(arr, d, n - 1);
		reverse(arr, 0, n - 1);
		
		print(arr);
	}

	static void reverse(int[] arr, int start, int end) {
		
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
