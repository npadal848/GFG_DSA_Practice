package matrix;

import java.util.Arrays;

public class RtateAMatrixBy90DegreeAntiClockWise {

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 8, 9, 10 } };
//		int[][] mat = { { 1, 2}, {3, 4} };
		int n = mat.length;
//		transpose1(mat, n);
		transpose2(mat, n);
		Arrays.stream(mat).forEach(row -> {
			Arrays.stream(row).forEach(ele -> System.out.print(ele + " "));
			System.out.println();
		});
	}

//	TC - O(n^2) and SC - O(n)
	static void transpose1(int[][] mat, int n) {

		int[][] tranpose = new int[n][n];
		for (int i = n-1; i >0; i--) {
			for (int j = 0; j >=0; j--) {
				tranpose[i][j] = mat[j][i];
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = tranpose[i][j];
			}
		}
	}

//	TC - O(n) and SC - O(1)
	static void transpose2(int[][] mat, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
	}
}
