package math;

import java.util.Scanner;

public class TrailingZeroWithLogN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println(countTrailingZero(num));
	}

	static int countTrailingZero(long num) {
		int result = 0;

		for (int i = 5; i <= num; i = i * 5) {
			result+=num/i;
		}
		return result;
	}
}
