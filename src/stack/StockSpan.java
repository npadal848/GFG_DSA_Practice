package stack;

import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		int[] arr1 = { 18, 12, 13, 14, 11, 16 };
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] arr3 = { 4, 3, 2, 1 };

		getStockSpan1(arr1);
		getStockSpan1(arr2);
		getStockSpan1(arr3);
		System.out.println();
		getStockSpan2(arr1);
		getStockSpan2(arr2);
		getStockSpan2(arr3);
	}

//	Time: O(n^2) and space: O(1)
	static void getStockSpan1(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int spanCount = 1;
			for (int j = i - 1; j >= 0 && arr[j] <= arr[i]; j--) {
				spanCount++;
			}
			System.out.print(spanCount + " ");
		}
		System.out.println();
	}

//	Time: O(n^2) and space: O(1)
	static void getStockSpan2(int[] arr) {
		Stack<Integer> s = new Stack<>();
		s.push(0);
		int spanCount = 1;
		System.out.print(spanCount + " ");
		for (int i = 1; i < arr.length; i++) {
			while (!s.isEmpty() && arr[i] >= arr[s.peek()])
				s.pop();
			spanCount = s.isEmpty() ? i + 1 : i - s.peek();
			System.out.print(spanCount + " ");
			s.push(i);
		}
		System.out.println();
	}
}
