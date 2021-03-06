package searching;

public class CountTheOccuranceInSortedArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 3, 3, 4 };
		int n = arr.length;
		int k = 3;

		System.out.println(k + " occured " + count2(arr, 0, n - 1, n, k) + " times");

	}

//  TC - log(n) and SC(1)
	static int count2(int[] arr, int start, int end, int n, int k) {
		int count = 0;

		if (findLastOccurance(arr, start, end, count, k) == -1) {
			return count;
		} else {
			return (findLastOccurance(arr, start, end, count, k) - findFirstOccurance(arr, start, end, count, k)) + 1;
		}
	}

	static int findFirstOccurance(int[] arr, int start, int end, int n, int k) {
		if (start > end) {
			return -1;
		}

		int mid = (start + end) / 2;
		if (arr[mid] == k) {
			if (mid == 0 || arr[mid - 1] != k)
				return mid;
			else
				return findFirstOccurance(arr, start, mid - 1, n, k);
		} else if (k < arr[mid]) {
			return findFirstOccurance(arr, start, mid - 1, n, k);
		} else
			return findFirstOccurance(arr, mid + 1, end, n, k);
	}

	static int findLastOccurance(int[] arr, int start, int end, int n, int k) {
		if (start > end) {
			return -1;
		}

		int mid = (start + end) / 2;
		if (arr[mid] == k) {
			if (mid == n - 1 || arr[mid + 1] != k)
				return mid;
			else
				return findLastOccurance(arr, mid + 1, end, n, k);
		} else if (k < arr[mid]) {
			return findLastOccurance(arr, start, mid - 1, n, k);
		} else
			return findLastOccurance(arr, mid + 1, end, n, k);
	}
}
