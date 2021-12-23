package string;

import java.util.Arrays;

public class LeftMostNonRepeatingCharacter {

	public static void main(String[] args) {
		String s1 = "geeksforgeeks"; // O/P: 5
		String s2 = "abbcca"; // O/P: -1
		String s3 = "abcd"; // O/P: 0
		String s4 = "cabd"; // O/P: 0

		System.out.println(find1(s1));
		System.out.println(find1(s2));
		System.out.println(find1(s3));
		System.out.println(find1(s4));
		System.out.println();
		System.out.println(find2(s1));
		System.out.println(find2(s2));
		System.out.println(find2(s3));
		System.out.println(find2(s4));
		System.out.println();
		System.out.println(find3(s1));
		System.out.println(find3(s2));
		System.out.println(find3(s3));
		System.out.println(find3(s4));
	}

//	TC - O(n^2) and TC - O(1)
	static int find1(String s) {
		for (int i = 0; i < s.length(); i++) {
			boolean flag = true;
			for (int j = 0; j < s.length(); j++) {
				if (i != j && s.charAt(i) == s.charAt(j)) {
					flag = false;
					break;
				}
			}
			if (flag)
				return i;
		}
		return -1;
	}

//	TC - Theta(n+char) and TC - O(char)
	static int find2(String s) {
		int[] count = new int[256];
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i)]++;
		}

		for (int i = 0; i < s.length(); i++) {
			if (count[s.charAt(i)] == 1)
				return i;
		}

		return -1;
	}

//	TC - Theta(n+char) and TC - O(char)
	static int find3(String s) {
		int[] count = new int[256];
		Arrays.fill(count, -1);
		int res = Integer.MAX_VALUE;
		for (int i = 0; i < s.length(); i++) {
			if (count[s.charAt(i)] == -1)
				count[s.charAt(i)] = i;
			else
				count[s.charAt(i)] = -2;
		}

		for (int i = 0; i < 256; i++) {
			if (count[i] >= 0)
				res = Math.min(res, count[i]);
		}
		return (res == Integer.MAX_VALUE) ? -1 : res;
	}
}
