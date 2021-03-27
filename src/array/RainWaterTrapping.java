package array;

import java.util.Scanner;

public class RainWaterTrapping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(countUnitOfWater1(arr, n));
		System.out.println(countUnitOfWater2(arr, n));
		System.out.println(countUnitOfWater3(arr, n));
	}

	// Method-2 TC - O(n^2) SC - O(1)
	static int countUnitOfWater1(int[] arr, int n) {
		int res = 0;

		for (int i = 1; i < n - 1; i++) {
			int lMax = arr[i];
			for (int j = 0; j < i; j++) {
				lMax = Math.max(lMax, arr[j]);
			}

			int rMax = arr[i];
			for (int j = i + 1; j < n; j++) {
				rMax = Math.max(rMax, arr[j]);
			}

			res += Math.min(lMax, rMax) - arr[i];
		}

		return res;
	}

	// Method-2 TC - O(n) SC - O(n)
	static int countUnitOfWater2(int[] arr, int n) {
		int res = 0;
		int[] lMax = new int[n];
		int[] rMax = new int[n];

		lMax[0] = arr[0];
		for (int i = 1; i < n; i++) {
			lMax[i] = Math.max(lMax[i - 1], arr[i]);
		}

		rMax[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			rMax[i] = Math.max(arr[i], rMax[i + 1]);
		}

		for (int i = 1; i < n - 1; i++) {
			res += Math.min(lMax[i], rMax[i]) - arr[i];
		}
		return res;
	}

	// Method-3 TC - O(n) SC - O(1) - Optimized Solutions
	static int countUnitOfWater3(int[] height, int n) {
		int res = 0;
		int left = 0;
		int right = n - 1;
		int lMax = 0;
		int rMax = 0;

		while (left <= right) {
			if (height[left] <= height[right]) {
				if (height[left] >= lMax)
					lMax = height[left];
				else
					res += lMax - height[left];

				left++;
			} else {
				if (height[right] >= rMax)
					rMax = height[right];
				else
					res += rMax - height[right];

				right--;
			}
		}

		return res;
	}
}
