package two_pointer;

import java.util.Scanner;

public class FindTripletInSortedArrayGivenSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		find1(arr, n, x);
		find2(arr, n, x);
	}

	static void find1(int[] arr, int n, int x) {
		for (int i = 0; i < n-2; i++) {
			for (int j = i + 1; j < n -1; j++) {
				for (int k = j + 1; k < n; k++) {
					if ((arr[i] + arr[j] + arr[k]) == x) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
						return;
					}
				}
			}
		}
		System.out.println("Not Found");
	}

	static void find2(int[] arr, int n, int x) {
		for (int i = 0; i < n - 2; i++) {
			int start = i + 1;
			int end = n - 1;

			while (start < end) {
				int sum = arr[i] + arr[start] + arr[end];
				if (sum == x) {
					System.out.println(arr[i] + " " + arr[start] + " " + arr[end]);
					return;
				} else if (sum > x)
					end--;
				else
					start++;
			}
		}
		System.out.println("Not Found");
	}
}
