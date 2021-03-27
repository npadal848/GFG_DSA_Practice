package array;

import java.util.Scanner;

public class DeleteAnElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int ele=sc.nextInt();
		print(delete(arr, arr.length, ele));
	}

	static void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
	
	static int[] delete(int[] arr, int n, int ele) {

		if (arr[n - 1] == ele) {
			arr[n - 1] = 0;
			return arr;
		}

		boolean isDeleted = false;
		for (int i = 0; i < n - 1; i++) {
			if (ele == arr[i]) {
				isDeleted = true;
				arr[i] = arr[i + 1];
			}

			if (isDeleted) {
				arr[i]=arr[i+1];
			}
		}
		arr[n-1]=0;
		return arr;
	}
}
