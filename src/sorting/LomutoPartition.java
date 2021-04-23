package sorting;

import java.util.Arrays;

public class LomutoPartition {

	public static void main(String[] args) {
		int[] arr = { 70, 60, 80, 40, 30 };
		int n = arr.length;

		partition(arr, 0, n - 1);
		Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
	}

//	TC- O(n) and SC - O(1)
	static int partition(int[] arr, int l, int h) {
		int i = l - 1;
		int pivot = arr[h];

		for (int j = l; j < h; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[h];
		arr[h] = temp;
		return i + 1;
	}
}
