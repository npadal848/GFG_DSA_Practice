package stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class NextGreaterElement {

	public static void main(String[] args) {
		int[] nums1 = { 5, 15, 10, 8, 6, 12, 9, 18 };
		int[] nums2 = { 10, 15, 20, 25 };
		int[] nums3 = { 25, 20, 15, 10 };

		nextGreaterEle1(nums1);
		nextGreaterEle1(nums2);
		nextGreaterEle1(nums3);
		System.out.println();
		System.out.println(nextGreaterEle2(nums1));
		System.out.println(nextGreaterEle2(nums2));
		System.out.println(nextGreaterEle2(nums3));
	}

//	Time: O(n^2) and Space: O(1)
	static void nextGreaterEle1(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int j;
			for (j = i + 1; j < nums.length; j++) {
				if (nums[j] > nums[i]) {
					System.out.print(nums[j] + " ");
					break;
				}
			}
			if (j == nums.length)
				System.out.print(-1 + " ");
		}
		System.out.println();
	}

//	Time: Theta(n) and Space: O(n)
	static List<Integer> nextGreaterEle2(int[] nums) {
		List<Integer> res = new ArrayList<>();
		Deque<Integer> stack = new ArrayDeque<Integer>();
		int nextGrtEle = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && nums[i] >= stack.peek())
				stack.pop();
			nextGrtEle = stack.isEmpty() ? -1 : stack.peek();
			res.add(nextGrtEle);
			stack.push(nums[i]);
		}
		Collections.reverse(res);
		return res;
	}
}
