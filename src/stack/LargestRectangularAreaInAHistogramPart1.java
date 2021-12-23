package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class LargestRectangularAreaInAHistogramPart1 {

	public static void main(String[] args) {
		int[] histogram1 = { 6, 2, 5, 4, 1, 5, 6 };
		int[] histogram2 = { 2, 5, 1 };
		
		System.out.println(largestRectangularArea1(histogram1));
		System.out.println(largestRectangularArea1(histogram2));
		System.out.println();
		System.out.println(largestRectangularArea2(histogram1));
		System.out.println(largestRectangularArea2(histogram2));
	}

//	Time: O(n^2) and Space: O(1)
	static int largestRectangularArea1(int[] histogram) {
		int largestArea = 0;
		for (int i = 0; i < histogram.length; i++) {
			int currArea = histogram[i];
			for (int j = i - 1; j >= 0 && histogram[j] >= histogram[i]; j--) {
				currArea += histogram[i];
			}
			for (int j = i + 1; j < histogram.length && histogram[j] >= histogram[i]; j++) {
				currArea += histogram[i];
			}
			largestArea = Math.max(largestArea, currArea);
		}
		return largestArea;
	}

//	Time: O(n) and Space: O(n)
	static int largestRectangularArea2(int[] nums) {
		Deque<Integer> stack1 = new ArrayDeque<>();
		Deque<Integer> stack2 = new ArrayDeque<>();
		int res = 0;
		int n = nums.length;
//		Prepare Previous smaller elements
		int[] ps = new int[n];
		int[] ns = new int[n];
		for (int i = 0; i < n; i++) {
			while (!stack1.isEmpty() && nums[stack1.peek()] >= nums[i])
				stack1.pop();
			int prevSmallEle = stack1.isEmpty() ? -1 : stack1.peek();
			ps[i] = prevSmallEle;
			stack1.push(i);
		}

//		Prepare Next smaller elements 		
		for (int i = n - 1; i >= 0; i--) {
			while (!stack2.isEmpty() && nums[stack2.peek()] >= nums[i])
				stack2.pop();
			int nextSmallEle = stack2.isEmpty() ? n : stack2.peek();
			ns[i] = nextSmallEle;
			stack2.push(i);
		}

		for (int i = 0; i < n; i++) {
			int curr = nums[i];
			curr += (i - ps[i] - 1) * nums[i];
			curr += (ns[i] - i - 1) * nums[i];
			res = Math.max(res, curr);
		}
		return res;
	}
}
