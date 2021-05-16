package array;

public class FindIfEquilibriumPoint {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 2, 2 };
		int n = arr.length;

		System.out.println(find1(arr, n));
		System.out.println(find2(arr, n));
		System.out.println(find3(arr, n));
	}

//	TC - 0(n^2) and SC - 0(1)
	static boolean find1(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			int prefSum = 0;
			int sufSum = 0;

			for (int j = 0; j < i; j++) {
				prefSum += arr[j];
			}

			for (int k = i + 1; k < n; k++) {
				sufSum += arr[k];
			}

			if (prefSum == sufSum) {
				return true;
			}
		}
		return false;
	}

//	TC - 0(n) and SC - 0(n)
	static boolean find2(int[] arr, int n) {
		int[] prefSum = new int[n];
		int[] sufSum = new int[n];
		prefSum[0] = arr[0];
		for (int j = 1; j < n; j++) {
			prefSum[j] = prefSum[j - 1] + arr[j];
		}

		sufSum[n - 1] = arr[n - 1];
		for (int k = n - 2; k >= 0; k--) {
			sufSum[k] = sufSum[k + 1] + arr[k];
		}

		for (int i = 0; i < n - 1; i++) {
			if (i == 0) {
				if (sufSum[i + 1] == 0)
					return true;
			} else if (prefSum[i - 1] == sufSum[i + 1])
				return true;
		}

		return false;
	}

//	TC - 0(n) and SC - 0(1)
	static boolean find3(int[] arr, int n) {
		int sum = 0;
		int leftSum = 0;

		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}

		for (int i = 0; i < n; i++) {
			sum -= arr[i]; // sum is now right sum for index i
			if (leftSum == sum)
				return true;
			leftSum += arr[i];
		}

		return false;
	}
}
