package array;

import java.util.Scanner;

public class LeaderInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

//		findLeader1(arr, n);
		findLeader2(arr, n - 1);
	}

	/*
	 * Method-1 TC - O(n^2), SC - Theta(1)
	 */
	static void findLeader1(int[] arr, int n) {
		for (int i = 0; i < n - 1; i++) {
			boolean flag = true;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] <= arr[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print(arr[i] + ", ");
			}
		}
		System.out.print(arr[n - 1]);
	}

	/*
	 * Method-1 TC - O(n), SC - Theta(1)
	 */
	static void findLeader2(int[] arr, int n) {
		int currLeader = arr[n];
		System.out.print(currLeader + " ");
		for (int i = n - 1; i >= 0; i--) {
			if (currLeader < arr[i]) {
				System.out.print(arr[i] + " ");
				currLeader = arr[i];
			}
		}
	}

}
