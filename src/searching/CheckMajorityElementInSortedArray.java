package searching;

public class CheckMajorityElementInSortedArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 3, 3, 10 };
//		int[] arr = { 2, 3, 3 };
		int n = arr.length;
		int x = 3;

		System.out.println(check1(arr, n, x));
		System.out.println(isMajorityElement(arr, n, x));
	}

//	TC - O(1) SC - O(1)
	/*
	 * It works when majority element is present in sorted array
	 */
	static boolean check1(int[] arr, int n, int x) {
		if (arr[n / 2] == x)
			return true;
		return false;
	}

//	TC - O(log n) SC - O(1)
	static int check2(int[] arr, int n, int x) {
		int start = 0;
		int end = n - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x) {
				return mid;
			} else if (x < arr[mid])
				end = mid - 1;
			else
				start = mid + 1;
		}
		return -1;
	}

	static boolean isMajorityElement(int[] arr, int n, int x) {
		int count = 0;
		for (int num : arr) {
			if (num == x) {
				count++;
			}
		}

		if (count > (n / 2))
			return true;
		return false;
	}
}
