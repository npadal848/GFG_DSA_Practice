package array;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		arr=reverse(arr, n);
		
		for(int ele: arr) {
			System.out.print(ele+", ");
		}
	}

	static int[] reverse(int[] arr, int n) {
		int start = 0;
		int end = n - 1;
		
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

		return arr;
	}
}
