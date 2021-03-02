package math;

import java.util.Scanner;

/*
 * 1. Brute Force
 * 2. Euclide and LCM
 */
public class FindLCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		// #1
		System.out.println(findLCM1(a, b));
		// #2
//		System.out.println(findLCM(a, b));

	}

	private static int findLCM1(int a, int b) {
		int result = Math.max(a, b);

		while (true) {
			if (result % a == 0 && result % b == 0) {
				return result;
			}
			result++;
		}
	}

	private static int findLCM2(int a, int b) {
		return (a * b) / gcd(a, b);
	}

	private static int gcd(int a, int b) {

		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}
