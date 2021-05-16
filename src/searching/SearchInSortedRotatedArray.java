package searching;

public class SearchInSortedRotatedArray {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 8, 9 };
		int n = arr.length;
		int k = 30;

//		int[] arr = { 100, 200, 300, 10, 20 };
//		int n = arr.length;
//		int k = 30;

		System.out.println(search1(arr, n, k));
		System.out.println(search2(arr, 0, n - 1, k));
	}

//	TC - O(n) and SC - O(1)
	static int search1(int[] arr, int n, int k) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == k)
				return i;
		}

		return -1;
	}

//	TC - O(log n) and SC - O(1)
	static int search2(int[] arr, int start, int end, int k) {

		if (start > end) {
			return -1;
		}

		int mid = (start + end) / 2;
		if (arr[mid] == k)
			return mid;
		else if (arr[start] < arr[mid]) {
			if (k >= arr[start] && k < arr[mid])
				return search2(arr, start, mid - 1, k);
			else
				return search2(arr, mid + 1, end, k);
		} else {
			if (k > arr[mid] && k <= arr[end])
				return search2(arr, mid + 1, end, k);
			else
				return search2(arr, start, mid - 1, k);
		}
	}
}
