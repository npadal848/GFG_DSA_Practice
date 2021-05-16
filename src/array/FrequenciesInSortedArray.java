package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class FrequenciesInSortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		frequency1(arr, n);
		frequency2(arr, n);
	}

// 	TC - O(n) and SC - O(n)
	static void frequency1(int[] arr, int n) {
		HashMap<Integer, Integer> map=new HashMap<>();
		Arrays.stream(arr).forEach(ele->{
			if(!map.containsKey(ele))
				map.put(ele, 1);
			else
				map.put(ele, map.get(ele)+1);
		});
		System.out.println(map);
	}
	
// 	TC - O(n) and SC - O(1)
	static void frequency2(int[] arr, int n) {
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
