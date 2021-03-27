package array;

import java.util.Scanner;

public class MajorityElementOfAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(find(arr, n));
	}

	static int find(int[] arr, int n) {
		int times = n / 2;
		boolean flag = false;
		int i;
		for (i = 0; i < n; i++) {
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > times) {
				return i;
			}
		}
		return -1;
	}
}
