package recursion;

import java.util.Scanner;

/*
 * 1. checkPallindrom1: TimeComplexity: BigO(n), Space Complexity Theta(n)
 * 2. checkPallindrom2: TimeComplexity: BigO(n), Space Complexity Theta(n)
 */
public class PalindromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] ch = str.toCharArray();
		int len = ch.length;
		StringBuilder sb = new StringBuilder();
		System.out.println(checkPallindrom1(ch, sb, len));
		System.out.println(checkPallindrom2(str, 0, len-1));
	}

	static boolean checkPallindrom2(String str, int start, int end) {

		if (start >= end) {
			return true;
		}
		
		return ((str.charAt(start) == str.charAt(end)) && (checkPallindrom2(str, start+1, end-1)));
	}

	static boolean checkPallindrom1(char[] ch, StringBuilder sb, int length) {

		if (length == 0) {
			if (String.valueOf(ch).equals(sb.toString())) {
				return true;
			} else {
				return false;
			}
		}

		sb.append(ch[length - 1]);

		return checkPallindrom1(ch, sb, length - 1);
	}
}
