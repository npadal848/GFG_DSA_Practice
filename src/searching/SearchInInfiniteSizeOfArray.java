package searching;

public class SearchInInfiniteSizeOfArray {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int k = 90;
		System.out.println(search1(arr, k));
		System.out.println(search2(arr, k));
	}

//	TC - O(position of element) SC - O(1)
	static int search1(int[] arr, int k) {
		int i = 0;
		while (true) {
			if (arr[i] == k)
				return i;
			if (arr[i] > k)
				return -1;
			i++;
		}
	}

//	TC - log(position of element) SC - O(1)
	static int search2(int[] arr, int k) {
		if (arr[0] == k)
			return 0;

		int i = 1;
		while (arr[i] < k)
			i = i * 2;
		if (arr[i] == k)
			return i;

		return binarySearch(arr, (i / 2 + 1), i - 1, k);
	}

//	TC - O(log(position of element)) SC - O(1)
	static int binarySearch(int[] arr, int start, int end, int k) {
		if (start > end)
			return -1;

		int mid = (start + end) / 2;

		if (arr[mid] == k)
			return mid;
		if (arr[mid] > k)
			return binarySearch(arr, start, mid - 1, k);
		else
			return binarySearch(arr, mid + 1, end, k);
	}
}
