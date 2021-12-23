package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class PreviousGraterEelement {

	public static void main(String[] args) {
		int[] arr1 = { 15, 10, 18, 12, 4, 6, 2, 8 }; // Output: -1, 15, -1, 18, 12, 12, 6, 12
		int[] arr2 = { 8, 10, 12 };
		int[] arr3 = { 12, 10, 8 };
		int[] arr4 = { 5, 15, 10, 8, 6, 12, 9, 18 };

		greaterElement1(arr1);
		greaterElement1(arr2);
		greaterElement1(arr3);
		System.out.println();
		greaterElement2(arr1);
		greaterElement2(arr2);
		greaterElement2(arr3);
		greaterElement2(arr4);
	}

//	Time: O(n^2) and Space: O(1)
	static void greaterElement1(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (arr[j] > arr[i]) {
					System.out.print(arr[j] + " ");
					break;
				}
			}
			if (j == -1)
				System.out.print(-1 + " ");
		}
		System.out.println();
	}

//	Time: Theta(n) and Space: O(n) // Push and pop operation takes O(1) so Time is Theta(n)
	static void greaterElement2(int[] arr) {
		Deque<Integer> stack = new ArrayDeque<>();
		int prevGreaterEle = 0;
		for (int num : arr) {
			while (!stack.isEmpty() && num >= stack.peek())
				stack.pop();
			prevGreaterEle = stack.isEmpty() ? -1 : stack.peek();
			System.out.print(prevGreaterEle + " ");
			stack.push(num);
		}
		System.out.println();
	}
}
