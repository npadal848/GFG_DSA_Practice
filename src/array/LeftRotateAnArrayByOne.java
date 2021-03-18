package array;

import java.util.Scanner;

public class LeftRotateAnArrayByOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		leftRotate(arr, n);
	}

	static void leftRotate(int[] arr, int n) {

		int temp = arr[0];
		int i;

		for (i = 0; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = temp;

		print(arr);
	}

	static void print(int[] arr) {
		for (int ele : arr) {
			System.out.print(ele + ", ");
		}
		System.out.println();
	}
}
