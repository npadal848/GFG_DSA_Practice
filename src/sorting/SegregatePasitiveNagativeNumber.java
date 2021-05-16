package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SegregatePasitiveNagativeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int j = 0; j < n; j++) {
			arr[j] = sc.nextInt();
		}

//		segregate1(arr, n);
		segregate2(arr, 0, n - 1);
		Arrays.stream(arr).forEach(num -> System.out.print(num + " "));

		sc.close();
	}

//	TC - O(n) and SC - 0(n)
	static void segregate1(int[] arr, int n) {
		int i = 0;
		int[] temp = new int[n];
		for (int j = 0; j < n; j++) {
			if (arr[j] < 0) {
				temp[i] = arr[j];
				i++;
			}
		}
		for (int j = 0; j < n; j++) {
			if (arr[j] >= 0) {
				temp[i] = arr[j];
				i++;
			}
		}

		for (int j = 0; j < n; j++) {
			arr[j] = temp[j];
		}
	}

//	TC - Theta(n) and SC - 0(1)
	static int segregate2(int[] arr, int l, int h) {
		int i = l - 1;
		int temp = 0;
		for (int j = l; j < h; j++) {
			if (arr[j] < 0) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		temp = arr[i];
		arr[i] = arr[h];
		arr[h] = temp;

		return i;
	}
}
