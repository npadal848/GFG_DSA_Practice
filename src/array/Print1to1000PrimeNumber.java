package array;

public class Print1to1000PrimeNumber {

	public static void main(String[] args) {
		for (int i = 2; i <= 1000; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.println(i);
		}

	}
}
