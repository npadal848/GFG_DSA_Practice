package string;

import java.util.Scanner;

public class CheckIfStringSubsequenceOfOtherString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();

		System.out.println(isSubSequence1(s1, s2));
		sc.close();
	}

	static boolean isSubSequence1(String s1, String s2) {
		if (s2.length() > s1.length())
			return false;

		int i = 0;
		int j = 0;
		while (i < s2.length() && j < s1.length()) {
			if (s2.charAt(i) == s1.charAt(j)) {
				i++;
				j++;
			} else
				j++;
		}
		return (i == s2.length());
	}
}
