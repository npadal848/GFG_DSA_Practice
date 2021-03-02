package bitMagic;

import java.util.Scanner;

/*
 * 1. Brute Force O(total no of set bit)
 * 2. O(no of set bit)
 * 3. Theta(1)
 * 
 */
public class CountSetBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(countSetBit1(n));
		System.out.println(countSetBit2(n));
		System.out.println(countSetBit3(n));
	}

	private static int countSetBit3(int n) {
		int[] table = new int[256];
		table[0] = 0;
		for (int i = 1; i < 256; i++) {
			table[i] = (i & 1) + table[i / 2];
		}
		return count(n, table);
	}

	private static int count(int n, int[] table) {
		int res = 0;

		res = table[n & 0xff];
		n = n >> 8;
		res = res + table[n & 0xff];
		n = n >> 8;
		res = res + table[n & 0xff];
		n = n >> 8;
		res = res + table[n & 0xff];
		return res;
	}

	private static int countSetBit1(int n) {
		int res = 0;
		while (n > 0) {
			if ((n & 1) == 1) {
				res++;
			}
			n = n >> 1;
		}
		return res;
	}

	private static int countSetBit2(int n) {
		int res = 0;
		while (n > 0) {
			n = n & (n - 1);
			res++;
		}
		return res;
	}
}
