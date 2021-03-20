package math;

import java.util.Scanner;

public class CountDigitOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

//		System.out.println(count(n));
		System.out.println(countBetterSol(n));
	}

	// Method-1 TC - O(d) where d=No of Digits, SC-O(1)
	static int count(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}

		return count;
	}

	static int countBetterSol(int n) {
		return (int) Math.floor(Math.log10(n) + 1);
	}
}
