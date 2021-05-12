package hashing;

public class SubArraysWithZeroSum {

	public static void main(String[] args) {
		int[] arr1 = { 1, 4, 13, -3, -10, 5 };
		int[] arr2 = { -1, 4, -3, 5, -1 };
		int[] arr3 = { 3, 1, -2, 5, 6 };
		int[] arr4 = { 5, 6, 0, 8 };

		System.out.println(checkZeroSumSubArrays1(arr1, arr1.length));
		System.out.println(checkZeroSumSubArrays1(arr2, arr2.length));
		System.out.println(checkZeroSumSubArrays1(arr3, arr3.length));
		System.out.println(checkZeroSumSubArrays1(arr4, arr4.length));
	}

//	TC - O(n^2) and SC - O(1)
	static boolean checkZeroSumSubArrays1(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum += arr[j];
				if (sum == 0)
					return true;
			}
		}
		return false;
	}
}
