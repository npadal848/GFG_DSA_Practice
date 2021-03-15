package math;

import java.util.Scanner;

/*
 * Find Greatest Common Divisor
 * 1. Brute force
 * 2. Euclidean Algorithm Advance
 */
public class GCD {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
//		System.out.println(bruteForceSol(a, b));
		System.out.println(euclidAlgo(a, b));
	}
	
	static int bruteForceSol(int a, int b) {
		int min=Math.min(a, b);
		for(int i=min; i>0; i--) {
			if(a%i==0 && b%i==0) {
				return i;
			}
		}
		return 0;
	}
	
	static int euclidAlgo(int a, int b) {
		if(b==0) {
			return a;
		}
		return euclidAlgo(b, a%b);
	}
	
}
