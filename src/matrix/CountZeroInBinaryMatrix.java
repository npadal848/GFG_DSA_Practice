package matrix;

public class CountZeroInBinaryMatrix {

	public static void main(String[] args) {
		int[][] mat = { { 0, 0, 0 }, { 0, 0, 1 }, { 0, 1, 1 } };
		int n = mat.length;

		System.out.println(count(mat, n));
	}

	static int count(int[][] mat, int n) {
		int count = 0;
		int row = n - 1;
		int col = 0;

		while (col < n) {
			while (mat[row][col] > 0)
				if (--row < 0)
					return count;
			count+=(row+1);
			col++;
		}
		

		return count;
	}
}
