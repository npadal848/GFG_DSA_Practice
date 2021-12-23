package string;

import java.util.Arrays;

public class LeftMostRepeatingCharacter {

	public static void main(String[] args) {
		String s1 = "geeksforgeeks"; // O/P: 0
		String s2 = "abbcc"; // O/P: 1
		String s3 = "abcd"; // O/P: -1

		System.out.println(find1(s1));
		System.out.println(find1(s2));
		System.out.println(find1(s3));
		System.out.println();
		System.out.println(find2(s1));
		System.out.println(find2(s2));
		System.out.println(find2(s3));
		System.out.println();
		System.out.println(find3(s1));
		System.out.println(find3(s2));
		System.out.println(find3(s3));
		System.out.println();
		System.out.println(find4(s1));
		System.out.println(find4(s2));
		System.out.println(find4(s3));
	}

//	TC - O(n^2) and SC - O(1)
	static int find1(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j))
					return i;
			}
		}
		return -1;
	}

//	TC - Theta(n+char) and SC - Theta(char)
	static int find2(String s) {
		int[] count = new int[256];
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i)]++;
		}

		for (int i = 0; i < s.length(); i++) {
			if (count[s.charAt(i)] > 1)
				return i;
		}
		return -1;
	}

//	TC - O(n) and SC - O(1)
	static int find3(String s) {
		int res = Integer.MAX_VALUE;
		int[] firstIndex = new int[256];
		Arrays.fill(firstIndex, -1);

		for (int i = 0; i < s.length(); i++) {
			if (firstIndex[s.charAt(i)] == -1)
				firstIndex[s.charAt(i)] = i;
			else
				res = Math.min(res, firstIndex[s.charAt(i)]);

		}
		if (res == Integer.MAX_VALUE)
			return -1;
		return res;
	}

//	TC - O(n) and SC - O(1)
	static int find4(String s) {
		int res = Integer.MAX_VALUE;
		boolean[] flags = new boolean[256];
		Arrays.fill(flags, false);

		for (int i = s.length() - 1; i >= 0; i--) {
			if (flags[s.charAt(i)])
				res = Math.min(res, i);
			else
				flags[s.charAt(i)] = true;

		}
		if (res == Integer.MAX_VALUE)
			return -1;
		return res;
	}
}
