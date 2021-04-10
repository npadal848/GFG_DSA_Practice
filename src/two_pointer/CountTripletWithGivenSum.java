package two_pointer;

import java.util.Scanner;

public class CountTripletWithGivenSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(count1(arr, n, x));
		System.out.println("=================");
		System.out.println(count2(arr, n, x));
	}

//	TC - O(n^3) SC - O(1)
	static int count1(int[] arr, int n, int x) {
		int count = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == x) {
						count++;
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
					}
				}
			}
		}
		return count;
	}

//	TC - O(n^2) SC - O(1)
	static int count2(int[] arr, int n, int x) {
		int count = 0;

		for (int i = 0; i < n - 2; i++)
			count += twoSum(arr, i + 1, n - 1, i, x);
		return count;
	}

	static int twoSum(int[] arr, int start, int end, int i, int x) {
		int count = 0;
		while (start < end) {
			int sum = arr[i] + arr[start] + arr[end];
			if (sum == x) {
				count++;
				System.out.println(arr[i] + " " + arr[start] + " " + arr[end]);
				start++;
				end--;
			} else if (sum < x)
				start++;
			else
				end--;
		}
		return count;
	}
}
