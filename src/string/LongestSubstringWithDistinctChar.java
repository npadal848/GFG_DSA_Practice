package string;

import java.util.Arrays;

public class LongestSubstringWithDistinctChar {

	public static void main(String[] args) {
		String str1 = "abaacdbab";
		String str2 = "aaa";
		String str3 = "";

		System.out.println(longestSubString(str1));
		System.out.println(longestSubString(str2));
		System.out.println(longestSubString(str3));
		System.out.println("=====================");
		System.out.println(longestDistinct(str1));
		System.out.println(longestDistinct(str2));
		System.out.println(longestDistinct(str3));
	}

//	Time: O(n^2) and Space: O(1)
	static int longestSubString(String str) {
		if (str.length() == 0)
			return 0;
		int max = Integer.MIN_VALUE;
		int n = str.length();
		for (int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder(str.charAt(i));
			for (int j = i + 1; j < n; j++) {
				if (sb.toString().indexOf(str.charAt(j)) >= 0)
					break;
				sb.append(str.charAt(j));
			}
			max = Math.max(max, sb.length());
		}
		return max;
	}

//	Time: O(n) and Space: O(1)
	static int longestDistinct(String str) {
		int n = str.length();
		int res = 0;
		int prev[] = new int[256];
		Arrays.fill(prev, -1);
		int i = 0;
		for (int j = 0; j < n; j++) {
			i = Math.max(i, prev[str.charAt(j)] + 1);
			int maxEnd = j - i + 1;
			res = Math.max(res, maxEnd);
			prev[str.charAt(j)] = j;
		}
		return res;
	}
}
