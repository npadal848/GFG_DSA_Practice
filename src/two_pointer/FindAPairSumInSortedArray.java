package two_pointer;

import java.util.Scanner;

// This is for Unsorted Array
public class FindAPairSumInSortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		find(arr, n, k);
	}

//	TC - O(n) and SC - O(1)
	static void find(int[] arr, int n, int k) {
		int start = 0;
		int end = n - 1;

		while (start < end) {
			int sum = arr[start] + arr[end];
			if (sum == k) {
				System.out.println(arr[start] + " " + arr[end]);
				return;
			} else if (sum > k)
				end--;
			else
				start++;
		}
		System.out.println("Not Found");
	}
}
