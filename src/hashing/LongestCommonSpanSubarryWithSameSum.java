package hashing;

public class LongestCommonSpanSubarryWithSameSum {

	public static void main(String[] args) {
		int[] arr1 = { 0, 1, 0, 0, 0, 0 };
		int[] arr2 = { 1, 0, 1, 0, 0, 1 };

		int[] arr3 = { 0, 1, 0, 1, 1, 1, 1 };
		int[] arr4 = { 1, 1, 1, 1, 1, 0, 1 };

		int[] arr5 = { 0, 0, 0 };
		int[] arr6 = { 1, 1, 1 };

		int[] arr7 = { 0, 0, 1, 0 };
		int[] arr8 = { 1, 1, 1, 1 };

		System.out.println(find1(arr1, arr2));
		System.out.println(find1(arr3, arr4));
		System.out.println(find1(arr5, arr6));
		System.out.println(find1(arr7, arr8));
	}

//	TC - Theta(n^2) and O(1)
	static int find1(int[] arr1, int[] arr2) {
		int maxLength = 0;
		for (int i = 0; i < arr1.length; i++) {
			int preffSum1 = 0;
			int preffSum2 = 0;
			for (int j = i; j < arr1.length; j++) {
				preffSum1 += arr1[j];
				preffSum2 += arr2[j];
				if (preffSum1 == preffSum2) {
					maxLength = Math.max(maxLength, (j - i) + 1);
				}
			}
		}
		return maxLength;
	}

//	TC - Theta(n) and O(n)
	static int find2(int[] arr1, int[] arr2) {
		int maxLength = 0;

		return maxLength;
	}
}
