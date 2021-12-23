package string;

import java.util.Scanner;

public class CheckPalindromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(checkPaindrom1(str));
		System.out.println(checkPaindrom2(str));
		sc.close();
	}

//	TC - Theta (n) and SC - Theta(n)
	static boolean checkPaindrom1(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();

		return str.equals(sb.toString());
	}

//	TC - O(n) and SC - Theta(1)
	static boolean checkPaindrom2(String str) {
		int start = 0;
		int end = str.length() - 1;

		while (start < end) {
			if (str.charAt(start) != str.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}
}
