package hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNumbersDisappearedInAnArray {

	public static void main(String[] args) {
		int[] nums1 = { 4, 3, 2, 7, 8, 2, 3, 1 }; // Output: [5,6]
		int[] nums2 = { 1, 1 }; // Output: [2]

		System.out.println(findDisappearedNumbers1(nums1));
		System.out.println(findDisappearedNumbers1(nums2));
		System.out.println();
		System.out.println(findDisappearedNumbers2(nums1));
		System.out.println(findDisappearedNumbers2(nums2));
	}

//	Time: O(n) and Space: O(n)
	static List<Integer> findDisappearedNumbers1(int[] nums) {
		List<Integer> result = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for (int num : nums)
			set.add(num);
		for (int i = 0; i < nums.length; i++) {
			if (set.add(i + 1))
				result.add(i + 1);
		}
		return result;
	}

//	Time: O(n) and Space: O(1)
	static List<Integer> findDisappearedNumbers2(int[] nums) {
		List<Integer> result = new ArrayList<>();
		for (int num : nums) {
			int index = Math.abs(num);
			if (nums[index - 1] > 0)
				nums[index - 1] = -nums[index - 1];
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0)
				result.add(i + 1);
		}
		return result;
	}
}
