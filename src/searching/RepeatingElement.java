package searching;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatingElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

//		findRepeatElement1(arr, n);
		findRepeatElement2(arr, n);
	}

//	TC- O(n^2) SC-O(1)
	static void findRepeatElement1(int[] arr, int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
					return;
				}
			}
		}
	}

//	TC- O(n log n) SC-O(1)
	static void findRepeatElement2(int[] arr, int n) {
		Arrays.sort(arr);
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.println(arr[i]);
				return;
			}
		}
	}

//	TC- O(n) SC-O(1)
	static void findRepeatElement3(int[] arr, int n) {
		
	}
}
