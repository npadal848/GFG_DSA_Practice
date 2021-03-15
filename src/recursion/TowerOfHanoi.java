package recursion;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		tOH(n, 'a', 'b', 'c');
	}

	static void tOH(int n, char a, char b, char c) {

		if (n == 1) {
			System.out.println("Move 1 from " + a + " to " + c);
			return;
		}

		tOH(n - 1, a, c, b);
		System.out.println("Move " + n + " from " + a + " to " + c);
		tOH(n - 1, b, a, c);
	}
}
