package sorting;

public class UnionOfTwoSortedArray {

	public static void main(String[] args) {
//		int m = 3;
//		int n = 5;
//		int[] a = { 3, 5, 8 };
//		int[] b = { 2, 8, 9, 10, 15 };

		int m = 6;
		int n = 2;
		int[] a = { 2, 3, 3, 3, 4, 4 };
		int[] b = { 4, 4 };

		union(a, b, m, n);
	}

	static void union(int[] a, int[] b, int m, int n) {
		int i = 0;
		int j = 0;

		while (i < m && j < n) {
			if (i > 0 && a[i] == a[i - 1]) {
				i++;
				continue;
			}

			if (a[i] < b[j]) {
				System.out.print(a[i] + " ");
				i++;
			} else if (a[i] > b[j]) {
				System.out.print(b[j] + " ");
				j++;
			} else {
				System.out.print(a[i] + " ");
				i++;
				j++;
			}
		}
		while (i < m) {
			if (i > 0 && a[i] != a[i - 1]) {
				System.out.print(a[i] + " ");
			}
			i++;
		}

		while (j < n) {
			if (j > 0 && b[j] != b[j - 1]) {
				System.out.print(b[j] + " ");
			}
			j++;
		}
	}
}
