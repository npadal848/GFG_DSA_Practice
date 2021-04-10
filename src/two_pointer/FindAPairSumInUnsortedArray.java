package two_pointer;

import java.util.Arrays;
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
		System.out.println("================");
		find2(arr, n, k);
	}

//	TC - O(n^2) and SC - O(1)
	static void find1(int[] arr, int n, int k) {
		for (int i = 0; i < n-1; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((arr[i] + arr[j]) == k) {
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}
	}

//	TC - O(n) and SC - O(1)
	static void find2(int[] arr, int n, int k) {
		Arrays.sort(arr);

		int start = 0;
		int end = n - 1;

		while (start < end) {
			int sum = arr[start] + arr[end];
			if (sum == k) {
				System.out.println(arr[start] + " " + arr[end]);
				start++;
				end--;
			} else if (sum < k)
				start++;
			else
				end--;
		}
	}
}
