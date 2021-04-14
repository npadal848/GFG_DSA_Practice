package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 8, 2, 8, 16, 3 };
		int n = arr.length;

		int[] nums = sort(arr, n);
		print(nums);
	}

	static int[] sort(int[] arr, int n) {

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		return arr;
	}

	static void print(int[] arr) {
		for (int num : arr)
			System.out.print(num + " ");
		System.out.println();
	}
}
