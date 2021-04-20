package sorting;

public class CountInversionOfArray {

	public static void main(String[] args) {
//		int[] arr = { 50, 40, 30, 20, 10 };
		int[] arr = { 8, 5, 2, 11, 9, 3, 6, 13 };
		int n = arr.length;

		System.out.println(count1(arr, n));
		System.out.println(count2(arr, 0, n - 1));
	}

//	TC-O(n^2) SC-O(1)
	static int count1(int[] arr, int n) {
		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					count++;
				}
			}
		}
		return count;
	}

//	TC-O(nlogn) SC-O(n)
	static int count2(int[] arr, int start, int end) {
		int res = 0;

		if (start < end) {
			int mid = (start + end) / 2;
			res += count2(arr, start, mid);
			res += count2(arr, mid + 1, end);
			res += countAndMerge(arr, start, mid, end);
		}
		return res;
	}

	static int countAndMerge(int[] arr, int start, int mid, int end) {
		int res = 0;
		int n1 = mid - start + 1;
		int n2 = end - mid;

		int[] left = new int[n1];
		int[] right = new int[n2];
		for (int i = 0; i < n1; i++) {
			left[i] = arr[start + i];
		}
		for (int i = 0; i < n2; i++) {
			right[i] = arr[mid + 1 + i];
		}

		int i = 0;
		int j = 0;
		int index = start;

		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				arr[index] = left[i];
				i++;
			} else {
				arr[index] = right[j];
				res += n1 - i;
				j++;
			}
			index++;
		}

		while (i < n1) {
			arr[index] = left[i];
			i++;
			index++;
		}

		while (j < n2) {
			arr[index] = right[j];
			j++;
			index++;
		}

		return res;
	}
}
