package two_pointer;

import java.util.Scanner;

/*
 * Find if there is a triplet a, b, c such that a^2+b^2=c^2 
 */
public class FindTripletWithGivenExpression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(count1(arr, n));
		System.out.println("=================");
		System.out.println(count2(arr, n));
	}

//	TC - O(n^3) SC - O(1)
	static int count1(int[] arr, int n) {
		int count = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					int sum = (int) (Math.pow(arr[i], 2) + Math.pow(arr[j], 2));
					if (sum == Math.pow(arr[k], 2)) {
						count++;
						System.out.println((int) Math.pow(arr[i], 2) + " " + (int) Math.pow(arr[j], 2) + " "
								+ (int) Math.pow(arr[k], 2));
					}
				}
			}
		}
		return count;
	}

//	TC - O(n^2) SC - O(1)
	static int count2(int[] arr, int n) {
		int count = 0;

		for (int i = 0; i < n - 2; i++)
			count += twoSum(arr, i + 1, n - 1, i);
		return count;
	}

	static int twoSum(int[] arr, int start, int end, int i) {
		int count = 0;
		while (start < end) {
			int sum = (int) (Math.pow(arr[i], 2) + Math.pow(arr[start], 2));
			if (sum == Math.pow(arr[end], 2)) {
				count++;
				System.out.println((int) Math.pow(arr[i], 2) + " " + (int) Math.pow(arr[start], 2) + " "
						+ (int) Math.pow(arr[end], 2));
				start++;
				end--;
			} else if (sum < Math.pow(arr[end], 2))
				start++;
			else
				end--;
		}
		return count;
	}
}
