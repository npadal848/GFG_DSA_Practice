package recursion;

import java.util.Scanner;

public class SubSetOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		printSubSet(str, "", 0);
		sc.close();
	}

	static void printSubSet(String s, String curr, int index) {

		if (index == s.length()) {
			System.out.println(curr);
			return;
		}
		
		printSubSet(s, curr, index+1);
		printSubSet(s, curr + s.charAt(index), index+1);
	}
}
