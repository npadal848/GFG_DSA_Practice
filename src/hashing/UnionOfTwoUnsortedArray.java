package hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoUnsortedArray {

	public static void main(String[] args) {
		int[] a = { 10, 15, 20, 5, 30 };
		int[] b = { 30, 5, 30, 80 };

		int[] c = { 10, 20 };
		int[] d = { 20, 30 };

		int[] m = { 10, 10, 10 };
		int[] n = { 10, 10, 10 };

		count2(a, b);
		count2(c, d);
		count2(m, n);

		count1(a, b);
		count1(c, d);
		count1(m, n);
	}

	static void count1(int[] a, int[] b) {
		int m = a.length;
		int n = b.length;
		int[] dist = new int[m + n];
		dist[0] = a[0];
		int index = 1;
		for (int i = 1; i < m; i++) {
			boolean flag = false;
			for (int j = 0; j < index; j++) {
				if (a[i] == dist[j]) {
					flag = true;
				}
			}
			if (!flag) {
				dist[index] = a[i];
				index++;
			}
		}

		for (int i = 0; i < n; i++) {
			boolean flag = false;
			for (int j = 0; j < index; j++) {
				if (b[i] == dist[j]) {
					flag = true;
				}
			}
			if (!flag) {
				dist[index] = b[i];
				index++;
			}
		}

		System.out.println(index);
	}

//	TC - O(m+n) and SC - O(m+n)
	static void count2(int[] a, int[] b) {
		Set<Integer> aSet = new HashSet<>();

		Arrays.stream(a).forEach(ele -> aSet.add(ele));
		Arrays.stream(b).forEach(ele -> aSet.add(ele));

		System.out.println(aSet.size());
	}
}
