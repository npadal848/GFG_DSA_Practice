package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 20, 5, 40, 60, 10, 30 };
		int n = arr.length;

		int[] nums = sort(arr, n);
		print(nums);
	}

	static int[] sort(int[] arr, int n) {
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && key < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		return arr;
	}

	static void print(int[] arr) {
		for (int num : arr)
			System.out.print(num + " ");
		System.out.println();
	}
}
