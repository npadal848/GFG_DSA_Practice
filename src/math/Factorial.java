package math;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

//		System.out.println(findFactorial(n));
		System.out.println(findFactorialRecursive(n));
		
		sc.close();
	}

	static long findFactorial(int n) {
		long fact = 1;

		if (n == 0 || n == 1) {
			return 1;
		}

		for (int i = 2; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	static long findFactorialRecursive(int n) {
		if (n == 1) {
			return 1;
		}

		return n * findFactorial(n - 1);
	}
}
