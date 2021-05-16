package searching;

public class IndexOfFirstOccurance {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 3, 4 };
		int n = arr.length;
		int k = 3;

		System.out.println(search(arr, 0, n - 1, k));
	}

	static int search(int[] arr, int start, int end, int k) {
		if (start > end) {
			return -1;
		}

		int mid = (start + end) / 2;

		if (k == arr[mid]) {
			if (mid == 0 || arr[mid - 1] != k)
				return mid;
			else
				return search(arr, start, mid - 1, k);
		} else if (k < arr[mid])
			return search(arr, start, mid - 1, k);
		else
			return search(arr, mid + 1, end, k);
	}
}
