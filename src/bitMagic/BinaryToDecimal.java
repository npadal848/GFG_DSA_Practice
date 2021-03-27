package bitMagic;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

//		Method-1  
		System.out.println(Integer.parseInt(String.valueOf(num), 2));

//		Method-2
		System.out.println(convert(num));
	}

	static int convert(int n) {
		int res = 0;
		int pos = 0;
		while (n > 0) {
			int rem = n % 10;
			res += (int) (rem * Math.pow(2, pos));
			n = n / 10;
			pos++;
		}
		return res;
	}
}
