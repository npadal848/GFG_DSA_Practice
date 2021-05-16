package hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountDistinctCommonElement {

	public static void main(String[] args) {
		int[] a = { 10, 15, 20, 5, 30 };
		int[] b = { 30, 5, 30, 80 };

		int[] c = { 10, 20 };
		int[] d = { 20, 30 };

		int[] m = { 10, 10, 10 };
		int[] n = { 10, 10, 10 };

		countDistinctCommonEle1(a, b);
		countDistinctCommonEle1(c, d);
		countDistinctCommonEle1(m, n);

		countDistinctCommonEle2(a, b);
		countDistinctCommonEle2(c, d);
		countDistinctCommonEle2(m, n);
	}

//	TC - O(m*(m+n)) and SC - O(1)
	static void countDistinctCommonEle1(int[] a, int[] b) {
		int m = a.length;
		int n = b.length;
		int count = 0;
		for (int i = 0; i < m; i++) {
			boolean flag = false;
			for (int j = i + 1; j < m; j++) {
				if (a[i] == a[j]) {
					flag = true;
				}
			}
			if (flag)
				continue;

			for (int j = 0; j < n; j++) {
				if (a[i] == b[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);

	}

//	TC - Theta (n) and SC - O(n)
	static void countDistinctCommonEle2(int[] a, int[] b) {
		Set<Integer> aSet = new HashSet<>();
		int count = 0;

		Arrays.stream(a).forEach(ele -> aSet.add(ele));
		for (Integer ele : b) {
			if (aSet.contains(ele)) {
				count++;
				aSet.remove(ele);
			}
		}
		System.out.println(count);
	}
}
