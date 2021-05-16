package array.slidingwindow;

import java.util.Scanner;

public class FindSubarrayWithGivenSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int sum = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(maxSum(arr, n, k, sum) ? "Yes" : "No");
	}

	static boolean maxSum(int[] arr, int n, int k, int sum) {
		int currSum = 0;

		for (int i = 0; i < k; i++) {
			currSum += arr[i];
		}

		if (currSum == sum) {
			return true;
		}

		for (int i = k; i < n; i++) {
			currSum += (arr[i] - arr[i - k]);
			if (currSum == sum) {
				return true;
			}
		}

		return false;
	}
}
