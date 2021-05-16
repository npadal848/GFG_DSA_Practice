package searching;

public class FindSqrtOfN {

	public static void main(String[] args) {
		int n = 5;

		System.out.println(findSqrtNaiveSol(n));
		System.out.println(findSqrtWithLognSol(n, 0, n));
	}

	static int findSqrtNaiveSol(int n) {
		int i = 1;
		while (i * i <= n) {
			i++;
		}
		return (i - 1);
	}

	static int findSqrtWithLognSol(int n, int start, int end) {
		int ans = 0;

		while (start <= end) {
			int mid = (start + end) / 2;
			int sqrt = mid * mid;
			if (sqrt == n) {
				return mid;
			} else if (sqrt > n)
				end = mid - 1;
			else {
				start = mid + 1;
				ans = mid;
			}

		}
		return ans;
	}
}
