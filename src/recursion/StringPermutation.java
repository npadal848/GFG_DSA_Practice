package recursion;

import java.util.Scanner;

public class StringPermutation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		permutation(s, "");
	}

	static void permutation(String str, String ans) {

		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String lPart = str.substring(0, i);
			String rPart = str.substring(i + 1);
			String s = lPart + rPart;

			permutation(s, ans + ch);
		}
	}
}
