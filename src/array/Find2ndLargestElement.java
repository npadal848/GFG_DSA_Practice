package array;

import java.util.Scanner;

public class Find2ndLargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(find2ndLargestEle1(arr, n));
	}

//	Naive Solution with 2 times traversal of the array
	static int find2ndLargestEle1(int[] arr, int n) {
		int index1 = 0;
		int index2 = -1;
		for (int i = 0; i < n; i++) {
			if (arr[index1] < arr[i]) {
				index1 = i;
			}
		}

		for (int i = 0; i < n; i++) {
			if (arr[index1] != arr[i]) {
				if (index2 == -1) {
					index2 = i;
				} else if (arr[index2] < arr[i]) {
					index2 = i;
				}
			}
		}

		return index2;
	}

//	Efficient Solution with 1 time traversal of the array
	static int find2ndLargestEle2(int[] arr, int n) {
		int largest = 0;
		int res = -1;
		for (int i = 0; i < n; i++) {
			if (arr[largest] < arr[i]) {
				res = largest;
				largest = i;
			}

			if (arr[largest] != arr[i]) {
				if (res == -1 || arr[res] < arr[i]) {
					res = i;
				}
			}
		}
		return res;
	}
}
