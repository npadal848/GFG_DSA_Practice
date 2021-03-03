package recursion;

import java.util.Scanner;

/*
 * Time Complexity: Theta(n)
 * Auxiliary Space: Theta(n)
 */
public class SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(sum(n));
	}

	static int sum(int n) {

		if (n == 0)
			return 0;
		
		return n+sum(n - 1);
	}
}
