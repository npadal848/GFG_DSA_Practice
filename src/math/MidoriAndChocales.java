package math;

import java.util.Scanner;

public class MidoriAndChocales {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long i=sc.nextLong();
		long l=sc.nextLong();
		
		System.out.println(leftShop(i, l));
	}

	private static long leftShop(long i, long l) {

		long res=(long) Math.pow(2, l);
		
		return res-i;
	}
}
