package string;

import java.util.Arrays;

public class CheckForAnagramString {

	public static void main(String[] args) {
		String s1 = "abaac";
		String s2 = "aacba";

		System.out.println(checkAnagram1(s1, s2));
		System.out.println(checkAnagram2(s1, s2));
	}

//	TC - O(n^2) and SC - O(1)
	static boolean checkAnagram1(String s1, String s2) {
		char[] ch1 = s1.toCharArray();
		Arrays.sort(ch1);
		s1 = new String(ch1);

		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch2);
		s2 = new String(ch2);

		return s1.equals(s2);
	}

//	TC - O(n) and SC - O(char)
	static boolean checkAnagram2(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		int[] count = new int[256];
		for (int i = 0; i < s1.length(); i++) {
			count[s1.charAt(i) - 'a']++;
			count[s2.charAt(i) - 'a']--;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0)
				return false;
		}
		return true;
	}
}
