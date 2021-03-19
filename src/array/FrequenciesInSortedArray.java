package array;

import java.util.Scanner;

public class FrequenciesInSortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		frequency(arr, n);
	}

	static void frequency(int[] arr, int n) {
		int prev = arr[0];
		int freq = 1;

		for (int i = 1; i < n; i++) {
			if (prev == arr[i]) {
				freq++;
			} else {
				System.out.println(prev + " : " + freq);
				prev = arr[i];
				freq = 1;
			}
		}
		System.out.println(prev + " : " + freq);
	}
}
