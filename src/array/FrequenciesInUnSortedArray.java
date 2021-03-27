package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FrequenciesInUnSortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		frequency(arr, n);
	}

	static void frequency(int[] arr, int n) {
		LinkedHashMap<Integer, Integer> frequencyMap = new LinkedHashMap<>();

		for (int i = 0; i < n; i++) {
			if (frequencyMap.containsKey(arr[i])) {
				frequencyMap.put(arr[i], frequencyMap.get(arr[i]) + 1);
			} else {
				frequencyMap.put(arr[i], 1);
			}
		}
		List<Integer> list = new ArrayList<>(frequencyMap.keySet());
		list.forEach(num -> System.out.println(num + " : " + frequencyMap.get(num)));
	}
}
