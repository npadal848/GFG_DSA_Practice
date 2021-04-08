package searching;

import java.util.Scanner;

public class Count1sInSortedBinaryArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(count(arr, 0, n - 1, n, 1));
	}

	static int count(int[] arr, int start, int end, int n, int k) {
		if (arr[0] == 1)
			return n;
		if (arr[n - 1] == 0)
			return 0;
		
		int startIndex = getIndexOfFirstOccurance(arr, start, end, n, k);
		if (startIndex == -1)
			return 0;
		else {
			return (n - startIndex);
		}
	}

	static int getIndexOfFirstOccurance(int[] arr, int start, int end, int n, int k) {
		if (start > end) {
			return -1;
		}

		int mid = (start + end) / 2;

		if (k == arr[mid]) {
			if (mid == 0 || arr[mid - 1] != k)
				return mid;
			else
				return getIndexOfFirstOccurance(arr, start, mid - 1, n, k);
		} else if (k < arr[mid])
			return getIndexOfFirstOccurance(arr, start, mid - 1, n, k);
		else
			return getIndexOfFirstOccurance(arr, mid + 1, end, n, k);
	}
}
