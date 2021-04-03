package array;

import java.util.Scanner;

public class FindIfEquilibriumPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(find1(arr, n));
		System.out.println(find2(arr, n));
	}

	static boolean find1(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			int prefSum = 0;
			int sufSum = 0;

			for (int j = 0; j < i; j++) {
				prefSum += arr[j];
			}

			for (int k = i + 1; k < n; k++) {
				sufSum += arr[k];
			}

			if (prefSum == sufSum) {
				return true;
			}
		}
		return false;
	}

	static boolean find2(int[] arr, int n) {
		int[] prefSum = new int[n];
		int[] sufSum = new int[n];
		prefSum[0] = arr[0];
		for (int j = 1; j < n; j++) {
			prefSum[j] = prefSum[j - 1] + arr[j];
		}

		sufSum[n - 1] = arr[n - 1];
		for (int k = n - 2; k >= 0; k--) {
			sufSum[k] = sufSum[k + 1] + arr[k];
		}

		for (int i = 0; i < n - 1; i++) {
			if (i == 0) {
				if (sufSum[i + 1] == 0)
					return true;
			} else if (prefSum[i - 1] == sufSum[i + 1])
				return true;
		}

		return false;
	}
}
