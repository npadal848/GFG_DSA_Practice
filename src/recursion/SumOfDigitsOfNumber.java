package recursion;

import java.util.Scanner;

/*
 * 1. Recursive: Time Complexity: Theta(d) where d is the number of digits and Space Complexity: Theta(d) 
 * 2. Iterative: Time Complexity: Theta(d) and Space Complexity: Theta(1)
 */
public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(sum1(n, 0));
		System.out.println(sum2(n));
	}

	static int sum2(int n) {
		int res = 0;
		
		while (n != 0) {
			res=res+(n%10);
			n=n/10;
		}
		return res;
	}

	static int sum1(int n, int res) {

		if (n == 0)
			return res;

		res = res + (n % 10);

		return sum1(n / 10, res);
	}
}
