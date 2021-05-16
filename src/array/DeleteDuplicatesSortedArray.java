package array;

import java.util.Scanner;

public class DeleteDuplicatesSortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(deleteDuplicate(arr, n));
		System.out.println(deleteDuplicateWithoutExtraSpace(arr, n));
	}

	/*
	 * Naive Solution Time Complexity: O(n) Space Complexity: O(n)
	 */
	static int deleteDuplicate(int[] arr, int n) {
		int res = 1;
		int[] temp = new int[n];
		temp[0] = arr[0];

		for (int i = 1; i < n; i++) {
			if (temp[res - 1] != arr[i]) {
				temp[res] = arr[i];
				res++;
			}
		}

		for (int i = 0; i < res; i++) {
			arr[i] = temp[i];
		}

		return res;
	}

	static int deleteDuplicateWithoutExtraSpace(int[] arr, int n) {
		int index = 1;

		for (int i = 1; i < n; i++) {
			if (arr[index - 1] != arr[i]) {
				if (index != i) {
					arr[index] = arr[i];
					arr[i] = -1;
				}
				index++;
			} else {
				arr[i] = -1;
			}
		}

		for (int ele : arr) {
			System.out.print(ele + ", ");
		}
		System.out.println();
		return index;
	}
}
