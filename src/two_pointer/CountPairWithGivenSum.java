package two_pointer;

import java.util.Scanner;

public class CountPairWithGivenSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(count(arr, n, x));
	}

	static int count(int[] arr, int n, int x) {
		int start = 0;
		int end = n - 1;
		int count = 0;
		while (start < end) {
			int sum = arr[start] + arr[end];
			if (sum == x) {
				count++;
				start++;
				end--;
			} else if (sum > x)
				end--;
			else
				start++;
		}

		return count;
	}
}
