package math;

import java.util.Scanner;

public class TrailingZeroWithOn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		long factNum=findFactorial(num);
		System.out.println(factNum);
		System.out.println(countTrailingZero(factNum));
	}

	static long findFactorial(int num) {

		if (num == 0) {
			return 1;
		}

		return num * findFactorial(num - 1);
	}

	static int countTrailingZero(long factNum) {
		int result=0;
		while(factNum%10==0) {
			result++;
			factNum=factNum/10;
		}
		return result;
	}
}
