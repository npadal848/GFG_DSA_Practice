package two_pointer;

import java.util.Scanner;

// This is for Unsorted Array
public class FindAPairSumInUnsortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		find1(arr, n, k);
	}

	static void find1(int[] arr, int n, int k) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((arr[i] + arr[j]) == k) {
					System.out.println(arr[i] + " " + arr[j]);
					return;
				}
			}
		}
	}
}
