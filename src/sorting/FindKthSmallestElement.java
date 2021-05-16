package sorting;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class FindKthSmallestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int index = findKthSmallestElement(arr, 0, n - 1, k);
		System.out.println(index);

		sc.close();
	}

	static int findKthSmallestElement(int[] arr, int l, int h, int k) {
		while (l <= h) {
			int p = partition(arr, l, h);
			if (p == k - 1) {
				return p;
			} else if (p > k - 1) {
				h = p - 1;
			} else {
				l = p + 1;
			}
		}
		return -1;
	}

	static int randomPartition(int[] arr, int l, int h) {
		int pivot = ThreadLocalRandom.current().nextInt(l, h);
		swap(arr, l, pivot);
		return partition(arr, l, h);
	}

	static int partition(int[] arr, int l, int h) {
		int i = l - 1;
		int pivot = arr[h];
		for (int j = l; j < h; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, h);

		return i + 1;
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
