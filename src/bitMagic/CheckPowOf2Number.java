package bitMagic;

import java.util.Scanner;

public class CheckPowOf2Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(checkPowOfTwo1(n));
		System.out.println(checkPowOfTwo2(n));
	}

	private static boolean checkPowOfTwo1(int n) {
		boolean isPowOfTwo = false;

		for (int i = 2; i <= n; i *= 2) {
			if (i == n) {
				isPowOfTwo = true;
				break;
			}
		}
		return isPowOfTwo;
	}

	private static boolean checkPowOfTwo2(int n) {
		return (n != 0) && (n & (n - 1)) == 0;
	}
}
