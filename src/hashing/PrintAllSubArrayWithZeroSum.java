package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrintAllSubArrayWithZeroSum {

	public static void main(String[] args) {
		int[] arr1 = { 6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7 };
		int n1 = arr1.length;

		int[] arr2 = { 6, 3, -1, -3, 4, -2, 2 };
		int n2 = arr2.length;

		print1(arr1, n1);
		System.out.println();
		print1(arr2, n2);
		System.out.println();
		print2(arr1, n1);
		System.out.println();
		print2(arr2, n2);
		System.out.println();
	}

//	TC - O(n^2) and SC - O(1)
	static void print1(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			int preffSum = 0;
			for (int j = i; j < n; j++) {
				preffSum += arr[j];
				if (preffSum == 0) {
					System.out.println("Subarray found from Index " + i + " to " + j);
				}
			}
		}
	}

//	TC - O(n) and SC - O(n)
	static void print2(int[] arr, int n) {
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		ArrayList<Pair> pairList = new ArrayList<>();
		int prefSum = 0;
		for (int i = 0; i < n; i++) {
			prefSum += arr[i];

			if (prefSum == 0)
				pairList.add(new Pair(0, i));
			List<Integer> list = new ArrayList<Integer>();
			if (map.containsKey(prefSum)) {
				list = map.get(prefSum);
				for (int j = 0; j < list.size(); j++) {
					pairList.add(new Pair(list.get(j) + 1, i));
				}
			}
			list.add(i);
			map.put(prefSum, list);
		}

		if (pairList.size() > 0)
			printPair(pairList);
	}

	static void printPair(List<Pair> list) {
		list.stream().forEach(pair -> {
			System.out.println("Subarray found from Index " + pair.start + " to " + pair.end);
		});
	}
}

class Pair {
	int start;
	int end;

	public Pair(int start, int end) {
		this.start = start;
		this.end = end;
	}

}
