package matrix;

public class PrintBoundryArrayElement {

	public static void main(String[] args) {
//		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 }, { 10, 11, 12, 13, 14 } };
//		int[][] arr = { { 1}, {2}, {3, 4, 7} };
//		int[][] arr = { { 1}, {2, 3}, {4, 5, 6} };
		int[][] arr = { { 1, 2, 3, 4 }};
		print1(arr);
	}

//	TC - O(n^2) and SC - O(1)
	static void print1(int[][] arr) {
		int m = arr.length;

		for (int i = 0; i < m; i++) {
			if (i == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
			} else if (m > 2 && (i > 0 && i < m - 1)) {
				System.out.print(arr[i][arr[i].length - 1] + " ");
			} else if (i == m - 1) {
				for (int j = arr[i].length - 1; j >= 0; j--) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
		for (int i = m - 1; i >= 0; i--) {
			if ((i < m - 1 && i > 0) && arr[i].length > 1) {
				System.out.print(arr[i][0] + " ");
			}
		}
	}
	
//	TC - O(n^2) and SC - O(1)
	static void print2(int arr[][]) {
		int row=arr.length;
	}
}
