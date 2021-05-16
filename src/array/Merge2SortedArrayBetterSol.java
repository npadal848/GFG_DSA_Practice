package array;

public class Merge2SortedArrayBetterSol {

	// Driver Code
	public static void main(String[] args) {
		int[] a1 = { 1, 3, 5 };
		int[] a2 = { 2, 4, 7, 8, 10 };
		// Function Call
		merge(a1, a2, a1.length, a2.length);

		System.out.print("First Array: ");
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] + " ");
		}

		System.out.println();

		System.out.print("Second Array: ");
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i] + " ");
		}
	}

	static void merge(int arr1[], int arr2[], int n, int m) {
		// code here
		int i = 0;
		int j = 0;
		int gap = n + m;
		int temp = 0;
		for (gap = getGap(gap); gap > 0; gap = getGap(gap)) {

			for (i = 0; i + gap < n; i++) {
				if (arr1[i] > arr1[i + gap]) {
					temp = arr1[i];
					arr1[i] = arr1[i + gap];
					arr1[i + gap] = temp;
				}
			}

			for (j = gap > n ? gap - n : 0; i < n && j < m; i++, j++) {
				if (arr1[i] > arr2[j]) {
					temp = arr1[i];
					arr1[i] = arr2[j];
					arr2[j] = temp;
				}
			}

			if (j < m) {
				for (j = 0; j + gap < m; j++) {
					if (arr2[j] > arr2[j + gap]) {
						temp = arr2[j];
						arr2[j] = arr2[j + gap];
						arr2[j + gap] = temp;
					}
				}
			}
		}
	}

	static int getGap(int gap) {
		if (gap <= 1) {
			return 0;
		}

		return (gap / 2) + (gap % 2);
	}

}
