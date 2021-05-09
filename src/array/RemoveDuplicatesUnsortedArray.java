package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesUnsortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		removeDuplicates1(arr, n);
	}

	/*
	 * Naive Solution Time Complexity: O(n) Space Complexity: O(n)
	 */
	static void removeDuplicates1(int[] arr, int n) {
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
//		Below code is not working for LinkedHashSet
//		set = (LinkedHashSet<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toSet());
		Arrays.stream(arr).forEach(ele->set.add(ele));
		set.stream().forEach(ele-> System.out.print(ele+" "));
	}

	static int deleteDuplicates2(int[] arr, int n) {
		int index = 1;

		for (int i = 1; i < n; i++) {
			if (arr[index - 1] != arr[i]) {
				if (index != i) {
					arr[index] = arr[i];
					arr[i] = -1;
				}
				index++;
			} else {
				arr[i] = -1;
			}
		}

		for (int ele : arr) {
			System.out.print(ele + ", ");
		}
		System.out.println();
		return index;
	}
}
