package recursion;

import java.util.Scanner;

public class CheckPallindromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		System.out.println(isPallindrom(s, 0, s.length()-1));
	}

	static boolean isPallindrom(String s, int start, int end) {

		if (start == end) {
			return true;
		}

		if (s.charAt(start) != s.charAt(end)) {
			return false;
		}

		if (start < end) {
			return isPallindrom(s, start + 1, end - 1);
		}

		return false;
	}
}
