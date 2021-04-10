package searching;

public class FindAPeakElement {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = arr.length;
		System.out.println(find1(arr, n));
		System.out.println(find2(arr, 0, n - 1, n));
	}

//	TC - O(n^2) and TC - O(1)
	static int find1(int[] arr, int n) {
		int res = 0;
		if (n == 1)
			return arr[0];
		if (arr[0] >= arr[1])
			return arr[0];
		if (arr[n - 1] >= arr[n - 2])
			return arr[n - 1];

		for (int i = 1; i < n - 1; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				res = arr[i];
				break;
			}
		}
		return res;
	}

//	TC - O(log n) and TC - O(1)
	static int find2(int[] arr, int start, int end, int n) {
		if (start > end)
			return -1;

		if (n == 1)
			return arr[0];
		int mid = (start + end) / 2;

		if ((mid == 0 && arr[mid] >= arr[mid + 1]) || (mid == n - 1 && arr[mid] >= arr[mid - 1])
				|| ((mid != 0 && arr[mid] >= arr[mid - 1]) && (mid != n - 1 && arr[mid] >= arr[mid + 1]))) {
			return arr[mid];
		}
		if (mid > 0 && arr[mid] <= arr[mid - 1])
			return find2(arr, start, mid - 1, n);
		else
			return find2(arr, mid + 1, end, n);

	}
}
