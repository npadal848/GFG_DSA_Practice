package recursion;

import java.util.Scanner;

public class RopeCutting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println(countMaxPiece(n, a, b, c));
	}

	static int countMaxPiece(int n, int a, int b, int c) {

		if (n == 0)
			return 0;
		if (n < 0)
			return -1;

		int res = Math.max(Math.max(countMaxPiece(n - a, a, b, c), countMaxPiece(n - b, a, b, c)),
				countMaxPiece(n - c, a, b, c));

		if (res == -1) {
			return -1;
		}

		return res + 1;
	}
}
