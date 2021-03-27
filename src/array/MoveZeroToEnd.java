package array;

import java.util.Scanner;

public class MoveZeroToEnd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		print(move(arr, n));
	}

	static int[] move(int[] arr, int n) {
		int index = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				if (index != i) {
					int temp = arr[index];
					arr[index] = arr[i];
					arr[i] = temp;
				}
				index++;
			}
		}
		return arr;
	}

	static void print(int[] arr) {
		for (int ele : arr) {
			System.out.print(ele + ", ");
		}
		System.out.println();
	}
}
