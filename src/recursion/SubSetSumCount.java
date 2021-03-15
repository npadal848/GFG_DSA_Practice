package recursion;

import java.util.Scanner;

public class SubSetSumCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];

		int sum = sc.nextInt();
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		if (sum == 0) {
			System.out.println(1);
			return;
		}

		System.out.println(subSetCout(arr, size, sum));
		System.out.println(subSetCoutRecursion(arr, sum, 0, 0));
	}

	static int subSetCout(int[] arr, int size, int sum) {
		int count = 0;

		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (sum == (arr[i] + arr[j])) {
					count++;
				}
			}
		}

		return count;
	}

	static int subSetCoutRecursion(int[] arr, int sum, int count, int size) {

		for (int j = size + 1; j < arr.length; j++) {
			if (sum == (arr[size] + arr[j])) {
				return count++;
			}
		}

		return count + subSetCoutRecursion(arr, sum, count, size + 1);
	}
}
